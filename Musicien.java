import classes.instr.Instrument;


public class Musicien {

    //Attributs//
    private String nom;
    private Instrument Instrument;

    //Constructeurs//
    public Musicien() {}
    public Musicien(String unNom, Instrument unInstrument) {
        this.nom = unNom;
        this.Instrument = unInstrument;
    }

    //Get-Set//
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public Instrument getInstrument() {return Instrument;}
    public void setInstrument(Instrument instrument) {Instrument = instrument;}

    //Methodes//
    public void jouerSolo(){
        System.out.println(getNom()+" va jouer en solo avec son instrument: "+ getInstrument());
        Instrument.jouer();
    }

    //toString//
    public String  toString(){
        return "*Musicien: "+getNom() + "*\n";
    }
}
