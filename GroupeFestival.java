import java.util.ArrayList;

public class GroupeFestival {

    //Attributs//
    private String nom;
    private ArrayList<Musicien> musiciens;
    private ArrayList<Chanson> setlist;

    //Constructeurs//
    public GroupeFestival(String nom) {
        this.nom = nom;
        this.musiciens = new ArrayList<>();
        this.setlist = new ArrayList<>();
    }

    //Get-Set//
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public ArrayList<Musicien> getMusiciens() {return musiciens;}
    public void setMusiciens(ArrayList<Musicien> musiciens) {this.musiciens = musiciens;}

    public ArrayList<Chanson> getSetlist() {return setlist;}
    public void setSetlist(ArrayList<Chanson> setlist) {this.setlist = setlist;}

    //Methodes//
    public void ajouterMusicien(Musicien m){
        musiciens.add(m);
    }
    public void ajouterChanson(Chanson c){
        setlist.add(c);
    }

}
