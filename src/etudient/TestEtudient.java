package etudient;

public class TestEtudient {

    public static void main(String[] args){
        if(args.length>0){
        Etudient etudient = new Etudient(args[0]);
        etudient.travailler();
        etudient.seReposer();
        }else{
            System.out.println("Veuillez fournir un nom d'étudiant en argument.");
        }
    }
}
