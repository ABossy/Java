package hello;

public class HelloWorld {
    public static void main(String[] args) {
      Animal human = new Human(" Green"); 
      Animal dog = new Dog();
      System.out.println(human.sayHello()+ human.color);
      System.out.println("de " + human.city());
      System.out.println(human.sayGoodbye());
      System.out.println(dog.sayHello());
      System.out.println("&"+ dog.sayGoodbye());
      System.out.println("From "+ dog.city());
    }
  
}

// system.out.println = console.log
// ici on appelle l'objet human avec la methode sayHello()
// Animal (class) human (l'objet)
// new Human = utilisation du constructeur pour créer un nouvel objet.