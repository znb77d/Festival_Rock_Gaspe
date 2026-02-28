package classes.instr;

public class Batterie extends Instrument {

    //Attributs//
    private int nombreTambours;

    //Constructeurs//
    public Batterie() {}
    public Batterie(String unNom,String uneMarque,int unNombreTambours) {
        super(unNom,uneMarque);
        this.nombreTambours = unNombreTambours;
    }

    //Get-Set//
    public int getNombreTambours() {return nombreTambours;}
    public void setNombreTambours(int nombreTambours) {}

    //Methodes//
    @Override
    public void jouer(){
        System.out.println("Frapper les tambours de la batterie avec les baguettes pour produire des sons.\n");
    }

    //toString//
    @Override
    public String toString() {
        return "Batterie {" + "nombre de tambours = " + nombreTambours + "}\n"+ "Marque: "+getMarque()+"\n";
    }

}
