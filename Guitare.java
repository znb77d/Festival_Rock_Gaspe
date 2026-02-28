package classes.instr;

public class Guitare extends Instrument {

    //Attributs//
    private int nombreCordes;

    //Constructeurs//
    public Guitare() {}
    public Guitare(String unNom, String uneMarque,int unNombreCordes){
        super(unNom,uneMarque);
        this.nombreCordes = unNombreCordes;
    }

    //Get-Set//
    public int getNombreCordes() {return nombreCordes;}
    public void setNombreCordes(int nombreCordes) {this.nombreCordes = nombreCordes;}

    //Methodes//
    @Override
    public void jouer(){
        System.out.println("Pincer les cordes de la guitare avec les doigts ou avec un médiator pour produire des sons.\n");
    }

    //toString//
    @Override
    public String toString() {
        return "Guitare {" + "nombre de cordes = " + nombreCordes +"}\n"+ "Marque: "+getMarque()+"\n";
    }


}
