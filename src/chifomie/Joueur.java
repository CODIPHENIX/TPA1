package chifomie;

public class Joueur {
    private String nom;
    private int score=0;
    private IHMSaisie saisie;

    public Joueur(String nom){
        this.nom=nom;
        saisie = new IHMSaisie(nom);
    }
    public void crediter(){
        score++;
    }
    public Choix choisir(){
        return saisie.proposerChoix();
    }
    public String getNom(){
        return nom;
    }
    public int getScore(){
        return score;
    }
    public void ecrireScore(){
       System.out.println("Le score de "+ nom+" est "+score);
    }
}
