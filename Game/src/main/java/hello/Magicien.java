package hello;
import java.util.Scanner;

public class Magicien extends Personnage {
   
     //  SORT
     private String Sort;

     public String sort() {
         return this.Sort;
     }
 
     public void SetSort(String sort) {
         this.Sort = sort;
     }

     public String toString(){
        return super.toString() +"\n son Sort: "+ this.Sort ;

    }
    public void modif(){
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
        String sort = sc.nextLine();
        this.SetSort(sort);
    }
}