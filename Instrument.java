package classes.instr;

public abstract class Instrument {

    //Attributs//
    private String nom;
    private String marque;

    //Constructeurs//
    public Instrument(){}
    public Instrument(String unNom, String uneMarque) {
        this.nom = unNom;
        this.marque = uneMarque;
    }

    //Get-Set//
    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public String getMarque() {return marque;}

    public void setMarque(String marque) {this.marque = marque;}

    //Methodes//
    public abstract void jouer();

    //toString//
    //Ce toString n'est pas utilise dans le main//
    @Override
    public String toString(){
        return "Instrument: "+ nom + "\nMarque: " + marque;
    }





}
