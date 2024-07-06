package etudient;

public class Etudient {
    String nom;
    public Etudient(String nom){
        this.nom= nom;
    }
    public void travailler(){
        System.out.println(this.nom + " se met au travail !");
    }
    public void seReposer(){
        System.out.println(this.nom + " se repose !");
    }

}
