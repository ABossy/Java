package hello;
import java.util.Scanner;

public class Guerrier extends Personnage {

    //  ARME
    private String Arme;

    public String arme() {
        return this.Arme;
    }

    public void SetArme(String arme) {
        this.Arme = arme;
    }

    public String toString() {
        return super.toString() + "\n son Arme: " + this.Arme;

    }
    public void modif(){
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
        String arme = sc.nextLine();
        this.SetArme(arme);
    }

}
