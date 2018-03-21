package hello;

public abstract class Personnage {
  private String Name;

  public String name() {
    return this.Name;
  } // get methode

  public void SetName(String name) {
    this.Name = name;
  }

  // VIE
  private int Vie;

  public int vie() {
    return this.Vie;
  }

  public void SetVie(int vie) {
    this.Vie = vie;
  }

  // FORCE
  private int Force;

  public int force() {
    return this.Force;
  }

  public void SetForce(int force) {
    this.Force = force;
  }

  public String toString() {
    String result = "\n name: " + this.Name + "\n nb vie: " + this.Vie + "\n Niveau force: " + this.Force;
    // methode public 
    return result;
  }

  public abstract void modif();

  public Personnage(String nom, int vie, int force) {
    this.Name = nom;
    this.Vie = vie;
    this.Force = force;
  }

  public Personnage() {
  }

};
