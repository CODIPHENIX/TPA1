package chifomie;

public class JeuUnTour {
    private Joueur joueur1;
    private Joueur joueur2;

    public JeuUnTour(String joueur1,String joueur2){
        this.joueur1 = new Joueur(joueur1);
        this.joueur2 = new Joueur(joueur2);

        jouer();
    }
    public void jouer(){
        tour();
        joueur1.ecrireScore();
        joueur2.ecrireScore();
        conclure();
    }
    public void tour(){
        Choix choix1 = joueur1.choisir();
        Choix choix2 = joueur2.choisir();

        if(choix1==Choix.CISEAUX ){
            if (choix2==Choix.CAILLOU){
                joueur2.crediter();
            } else if (choix2==Choix.PAPIER) {
                joueur1.crediter();
            }
        }
        if(choix1==Choix.PAPIER ){
            if (choix2==Choix.CISEAUX){
                joueur2.crediter();
            } else if (choix2==Choix.CAILLOU) {
                joueur1.crediter();
            }
        }
        if(choix1==Choix.CAILLOU ){
            if (choix2==Choix.PAPIER){
                joueur2.crediter();
            } else if (choix2==Choix.CISEAUX) {
                joueur1.crediter();
            }
        }

    }
    public void conclure(){

        if(joueur1.getScore()> joueur2.getScore()){
            System.out.println(joueur1.getNom() + " est le Gagnant");
        }else if(joueur1.getScore()< joueur2.getScore()){
            System.out.println(joueur2.getNom() + " est le Gagnant");
        }else{
            System.out.println("Egaliter");
        }

    }
}
