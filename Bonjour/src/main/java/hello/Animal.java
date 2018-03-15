package hello;

public abstract class Animal implements Bonjour{
    public abstract String sayHello();
  
    public abstract String sayGoodbye();
    
    public String color; // la couleur est définie dans le parametre de l'objet.
   
    public abstract String city();

  };

 
  // comme on implemente Bonjour, (Animal sait faire bonjour)
  // donc public string sayHello() methode de Bonjour.java
 
  