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

    public void set(int i, String sortname, int attaque) {
    }
}
//Création class Sort avec 2 attributs name et niveau.
