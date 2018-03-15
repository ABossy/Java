package hello;

public class HelloWorld {
    public static void main(String[] args) {
      Animal human = new Human(); 
      Animal dog = new Dog();
      System.out.println(human.sayHello());
      System.out.println(dog.sayHello());
    }
  
}

// system.out.println = console.log
// ici on appelle l'objet human avec la methode sayHello()
// Animal (class) human (l'objet)
// new Human = utilisation du constructeur pour créer un nouvel objet.