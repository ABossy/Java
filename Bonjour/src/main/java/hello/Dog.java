package hello;

public class Dog extends Animal {
    public Dog(){
        // System.out.println("i'm a dog");
    }
    
    public String sayHello() {
        return "woof";
    }

    public String sayGoodbye() {
        return "Goodbye";
    }

    public String city() {
        return "Los Angeles";
    }
}