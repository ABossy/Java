package hello;

import java.util.Scanner;
import java.util.ArrayList;

public class Magicien extends Personnage {
    ArrayList<Sort> sort = new ArrayList<Sort>();

    public ArrayList<Sort> getSort() {
        return sort;
    }

    public String toString() {
        return super.toString() + sort.toString();

    }

    public void modif() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un nouveau Nom pour votre Magicien");
        String name = sc.nextLine();
        this.SetName(name);
        System.out.println("Choisissez un nouveau niveau de Vie pour votre Magicien");
        int vie = sc.nextInt();
        this.SetVie(vie);
        System.out.println("Choisissez une nouvelle Force pour votre Magicien");
        int force = sc.nextInt();
        sc.nextLine();
        this.SetForce(force);
        System.out.println("Choisissez un nouveau Sort pour votre Magicien");
        String sortname = sc.nextLine();
        System.out.println("Niveau du Sort (0-100)");
        int attaque = sc.nextInt();
        Sort sort = new Sort(sortname, attaque);
        // this.SetSort(sort);
    }

    //constructeurs
    public Magicien(String nom, int vie, int force, ArrayList<Sort> sort) {
        super(nom, vie, force);
        this.sort = sort;
    }

    public Magicien() {
        super();
    }
}