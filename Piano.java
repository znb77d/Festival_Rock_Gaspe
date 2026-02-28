package classes.instr;

public class Piano extends Instrument {

    //Attributs//
    private int nombreTouches;

    //Constructeurs//
    public Piano() {}
    public Piano(String unNom,String uneMarque,int unNombreTouches) {
        super(unNom,uneMarque);
        this.nombreTouches = unNombreTouches;
    }

    //Get-Set//
    public int getNombreTouches() {return nombreTouches;}
    public void setNombreTouches(int nombreTouches) {}

    //Methodes//
    @Override
    public void jouer(){
        System.out.println("Appuyer sur les touches du piano pour produire des sons.\n");
    }

    //toString//
    @Override
    public String toString() {
        return "Piano {" + "nombre de touches = " + nombreTouches + "}\n"+ "Marque: "+getMarque()+"\n";
    }

}
