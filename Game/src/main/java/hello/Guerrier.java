package hello;

import java.util.Scanner;

public class Guerrier extends Personnage {

    //  ARME
    private Arme arme;

    public void SetArme(Arme arme) {
        this.arme = arme;
    }

    public Arme getArme() {
        return this.arme;
    }

    public String toString() {
        return super.toString() + "\n son Arme: " + this.getArme().name + "\n niveau de force: " + this.getArme().force;

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
        System.out.println("Niveau de force");
        int attaque = sc.nextInt();
        Arme arme = new Arme(armename, attaque);
        this.SetArme(arme);
    }

}
