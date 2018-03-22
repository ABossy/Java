package hello;

import java.util.Scanner;
import java.util.ArrayList;

public class Guerrier extends Personnage {
    ArrayList<Arme> arme = new ArrayList<Arme>();

    public ArrayList<Arme> getArme() {
        return arme;
    }

    public String toString() {
        return super.toString() + arme.toString();
    }

    public void modif() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un nouveau nom pour votre Guerrier");
        String name = sc.nextLine();
        this.SetName(name);
        System.out.println("Choisissez un nouveau niveau de Vie pour votre Guerrier");
        int vie = sc.nextInt();
        this.SetVie(vie);
        System.out.println("Choisissez une nouvelle force pour votre Guerrier");
        int force = sc.nextInt();
        sc.nextLine();
        this.SetForce(force);
        System.out.println("Choisissez une nouvelle arme pour votre Guerrier");
        String armename = sc.nextLine();
        System.out.println("Niveau de L'arme (0-100)");
        int attaque = sc.nextInt();
        Arme arme = new Arme(armename, attaque);
        // this.SetArme(arme);
    }

    //constructeurs
    public Guerrier(String nom, int vie, int force, ArrayList<Arme> arme) {
        super(nom, vie, force);
        this.arme = arme;
    }

    public Guerrier() {
        super();
    }
}
