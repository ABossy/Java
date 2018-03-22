package hello;

public class Arme {
    public String name;
    public int force;

    Arme(String armename, int attaque) {
        this.name = armename;
        this.force = attaque;
    }

    public String toString() {
        return "\n son Arme: " + this.name + "\n niveau de l'arme: " + this.force;

    }
}
//Création class Arme avec 2 attributs name et force.