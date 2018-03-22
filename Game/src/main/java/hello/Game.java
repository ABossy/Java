package hello;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {
        String sortie = "";
        Personnage pers[] = new Personnage[10];
        int nb = 0;
        /**
         * do/while permet d'avoir un Menu de selection 
         */
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    "Créer un perso (1) " + "Afficher liste des personnages (2) " + "Modifier un personnage (3) ");
            int saisie = sc.nextInt();
            if (saisie == 1) {
                System.out.println("Choisissez un Guerrier(1) ou un Magicien(2)");

                String perso = sc.next();
                if (perso.equals("1")) {
                    pers[nb] = creaGuerrier();
                    nb++;

                } else if (perso.equals("2")) {
                    pers[nb] = creaMagicien();
                    nb++;

                    /**
                     *  condition qui permet de créer le personnage (via la fonction creaPerso()) 
                     *  et de le stocker dans le tab[] pers.  
                     */
                }
            } else if (saisie == 2) {
                for (int i = 0; i < pers.length; i++) {
                    if (pers[i] != null) {
                        System.out.println("liste des personnages: " + pers[i]);
                    }
                }
                /**
                 * permet d'afficher les personnages grâce à la boucle qui parcourt le tableau.
                 */
            } else if (saisie == 3) {
                System.out.println("Sélectionnez un personnage:");
                for (int i = 0; i < nb; i++) {
                    if (pers[i] != null) {
                        System.out.println("numero: " + i);
                        System.out.println(
                                "Name: " + pers[i].name() + " nb Vie: " + pers[i].vie() + " Force: " + pers[i].force());
                    }
                    /**
                     * on parcourt le tableau en fonction de la position ici definit par (nb) 
                      afin qu'il affiche uniquement les perso présent dans le tableau.
                     */
                }
                int choix = sc.nextInt();
                pers[choix].modif();
                /**
                 * permet de stocker les modifs dans le tableau pers[]
                 */
            } else {
                System.out.println("Veuillez réessayer!");
            }
            /**
             * message en cas de mauvaise saisie.
             */

            System.out.println("\n Voulez vous quitter le programme? y/n");
            sortie = sc.next();
        } while (!sortie.equals("y"));
        /**
         *  while de sortie qui execute la sortie du programme. 
         */
    }

    // FONCTION GUERRIER
    private static Guerrier creaGuerrier() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vous avez choisi un Guerrier ");
        System.out.println("Choisissez un nom pour votre guerrier");
        String name = sc.nextLine();
        System.out.println("Veuillez saisir le nombre de vie (1-10):");
        int vie = sc.nextInt();
        System.out.println("Veuillez saisir la force (0-100):");
        int force = sc.nextInt();
        sc.nextLine();
        String morearme;
        ArrayList<Arme> arme = new ArrayList<Arme>();

        do {
            System.out.println("Choisissez une arme");
            String armename = sc.nextLine();
            System.out.println("Niveau de l'arme (0-100):");
            int attaque = sc.nextInt();
            sc.nextLine();
            arme.add(new Arme(armename, attaque));
            System.out.println("souhaitez vous plusieurs armes?:1.Yes/2.No");
            morearme = sc.nextLine();
            for (int i = 0; i < arme.size(); i++) {
                System.out.println(arme.get(i).name);
            }
        } while (morearme.equals("1"));
        {
        }
        /**
         * do/while condition qui me permet d'executer le contenu du "do" ici création d'une arme
         * tant que la saisie utilisateur est egal à 1 .
         */

        Guerrier newGuerrier = new Guerrier(name, vie, force, arme);
        /**
         * instance de Guerrier qui utilise mon constructeur(guerrier)
         */
        System.out.println("Souhaitez vous afficher votre personnage? 1.Yes/2.No");
        String affiche = sc.next();
        if (affiche.equals("1")) {
            System.out.println("Voici votre Personnage: \n" + " ** Guerrier **" + newGuerrier.toString());
        } else if (affiche.equals("2")) {
            /**
            *  condition qui permet d'afficher les infos definit dans ma fonction toString()
            *  return les données name, vie, force + sort ou arme en fonction de la nature du perso.
            */
        }
        return newGuerrier;

    };

    // FONCTION MAGICIEN
    private static Magicien creaMagicien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vous avez choisi un Magicien");
        System.out.println("Choisissez un nom pour votre Magicien");
        String name = sc.nextLine();
        System.out.println("Veuillez saisir le nombre de vie (1-10):");
        int vie = sc.nextInt();
        System.out.println("Veuillez saisir la force (0-100):");

        int force = sc.nextInt();
        sc.nextLine();
        String moresort;
        ArrayList<Sort> sort = new ArrayList<Sort>();

        do {
            System.out.println("Choisissez un Sort");
            String sortname = sc.nextLine();
            System.out.println("Niveau du Sort (0-100):");
            int attaque = sc.nextInt();
            sc.nextLine();
            sort.add(new Sort(sortname, attaque));
            System.out.println("souhaitez vous plusieurs sorts?:1.Yes/2.No");
            moresort = sc.nextLine();
            for (int i = 0; i < sort.size(); i++) {
                System.out.println(sort.get(i).name);
            }
        } while (moresort.equals("1"));
        {

        }
        Magicien newMagicien = new Magicien(name, vie, force, sort);

        System.out.println("Souhaitez vous afficher votre personnage? 1.Yes/2.No");
        String affiche = sc.next();
        if (affiche.equals("1")) {
            System.out.println("Voici votre Personnage " + " ** Magicien **" + newMagicien.toString());
        } else if (affiche.equals("2")) {

        }
        return newMagicien;
    }

};

// EXCEPTION

//  System.out.println("test parse :");
//  String myInteger = sc.nextLine();
//  int myint;
//  try {
//  myint = Integer.parseInt(myInteger);
//  } catch (Exception e) {
//      System.out.println("invalid number");
//  }