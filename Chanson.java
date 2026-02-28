public class Chanson {

    //Attributs//
    private String titre;
    private int duree;
    private String style;

    //Constructeurs//
    public Chanson(){}
    public Chanson(String unTitre, int uneDuree, String unStyle){
        this.titre=unTitre;
        this.duree=uneDuree;
        this.style=unStyle;
    }

    //Get-Set//
    public String getTitre() {return titre;}
    public void setTitre(String titre) {this.titre = titre;}

    public int getDuree() {return duree;}
    public void setDuree(int duree) {this.duree = duree;}

    public String getStyle() {return style;}
    public void setStyle(String style) {this.style = style;}

    //toString//
    public String toString(){
        return "Titre: "+titre+"\nDurée: "+duree+" secondes\nStyle: "+style+"\n";
    }
}
