package hello;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        String sortie = "";
        Personnage pers[] = new Personnage[10];
        int nb = 0;
        //  do/while permet d'avoir un Menu de selection 
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

                }
            } else if (saisie == 2) {
                for (int i = 0; i < pers.length; i++) {
                    if (pers[i] != null) {
                        System.out.println("liste des personnages: " + pers[i]);
                    }
                }

            } else if (saisie == 3) {
                System.out.println("Sélectionnez un personnage:");
                for (int i = 0; i < nb; i++) {
                    if (pers[i] != null) {
                        System.out.println("numero: " + i);
                        System.out.println(
                                "Name: " + pers[i].name() + " nb Vie: " + pers[i].vie() + " Force: " + pers[i].force());
                    }
                }
                int choix = sc.nextInt();
                pers[choix].modif();
                // permet de stocker les modifs dans le tableau pers[]
            } else {
                System.out.println("Veuillez réessayer!");
            }

            System.out.println("\n Voulez vous quitter le programme? y/n");
            sortie = sc.next();
        } while (!sortie.equals("y"));

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
        System.out.println("Choisissez une arme");
        String armename = sc.nextLine();

        System.out.println("Niveau de l'arme (0-100):");
        int attaque = sc.nextInt();
        Arme arme = new Arme(armename, attaque);

        Guerrier newGuerrier = new Guerrier(name, vie, force, arme);

        System.out.println("Souhaitez vous afficher votre personnage? 1.Yes/2.No");
        String affiche = sc.next();
        if (affiche.equals("1")) {
            System.out.println("Voici votre Personnage \n" + newGuerrier.toString());
        } else if (affiche.equals("2")) {

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
        System.out.println("Choisissez un Sort");
        String sortname = sc.nextLine();
        System.out.println("Niveau du Sort (0-100):");
        int attaque = sc.nextInt();
        Sort sort = new Sort(sortname, attaque);

        Magicien newMagicien = new Magicien(name, vie, force, sort);

        System.out.println("Souhaitez vous afficher votre personnage? 1.Yes/2.No");
        String affiche = sc.next();
        if (affiche.equals("1")) {
            System.out.println("Voici votre Personnage " + newMagicien.toString());
        } else if (affiche.equals("2")) {

        }
        return newMagicien;
    }

};

// EXCEPTION
// System.out.println("test parse :");
// String myInteger = sc.nextLine(); 

// try 
// {
//     int myint = Integer.parseInt(myInteger);
// }
// catch (Exception e)
// {
//     System.out.println("invalid number");
// }
