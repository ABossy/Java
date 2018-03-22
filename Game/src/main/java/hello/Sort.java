package hello;

public class Sort {
    public String name;
    public int niveau;

    Sort(String sortname, int attaque) {
        this.name = sortname;
        this.niveau = attaque;

    }

    public String toString() {
        return "\n son Sort: " + this.name + "\n niveau du Sort: " + this.niveau;

    }
}
//Création class Sort avec 2 attributs name et niveau.
