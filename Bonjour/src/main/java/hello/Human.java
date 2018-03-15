package hello;

public class Human extends Animal {
    public Human(String color) {
        this.color= color;
        
    }
    
   public String sayHello(){
       return "Bienvenue au campus !";
   }

   public String sayGoodbye(){
       return "Au revoir";
   }

 public String city(){
     return "Grenoble";
 }

    }
