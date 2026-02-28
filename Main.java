import classes.instr.Instrument;
import classes.instr.Batterie;
import classes.instr.Guitare;
import classes.instr.Piano;


public static void main(String[]args){

    //Creation instrument//
    Guitare uneGuitare = new Guitare("Guitare classique","Yamaha",7);
    Batterie uneBatterie = new Batterie("Batterie électronique","Roland",5);
    Piano unPiano = new Piano("Piano classique","Yamaha",88);

    //Creation musicien//
    Musicien m1= new Musicien("Bob", uneGuitare);
    Musicien m2= new Musicien("Julie", unPiano);

    //Creation chanson//
    Chanson c1 = new Chanson("chanson quelconque",240,"Rock");
    Chanson c2 = new Chanson("chanson quelconque2",260,"Ballade");

    //Creation groupe//
    GroupeFestival groupe = new GroupeFestival("Les marées noires");

    //Ajouter musicien et chanson//
    groupe.ajouterMusicien(m1);
    groupe.ajouterMusicien(m2);

    groupe.ajouterChanson(c1);
    groupe.ajouterChanson(c2);

    //Affichage info du groupe//
    System.out.println("\nGroupe: ***Les marrées noires*** \n");

    System.out.println("--Les instruments--\n");
    System.out.println(uneGuitare);
    System.out.println(uneBatterie);
    System.out.println(unPiano);

    System.out.println("--Les musiciens (solo)--\n");
    System.out.println(m1);
    m1.jouerSolo();
    System.out.println(m2);
    m2.jouerSolo();

    System.out.println("--Les chansons--\n");
    System.out.println(c1);
    System.out.println(c2);





}

