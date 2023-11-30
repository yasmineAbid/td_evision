import java.util.ArrayList;
import java.util.List;

public class Ecole {
    private String nom;
    private List<Etudiant> etudiants;

    public Ecole(String nom, List<Etudiant> etudiant) {
        this.nom = nom;
        this.etudiants = new ArrayList<>();
    }

    public List<Etudiant> ajouterEtudiant(Etudiant etudiant) {
        if (!this.etudiants.contains(etudiant)) {
            this.etudiants.add(etudiant);
        }
        return this.etudiants;
    }

    public int rechercherEtudiant(Etudiant etudiant) {
       return this.etudiants.indexOf(etudiant);
    }

    /*public float getMoyenneDes3A() {
        this.etudiants.
        List<Etudiant3eme> etudiant3emeList;


    }*/

    public  void changerEcole(Etudiant etd, Ecole e){
        etd.setEcole(null);
        e.ajouterEtudiant(etd);
        etd.setEcole(e);
    }

    @Override
    public String toString() {
        return "Ecole{" +
                "nom='" + nom + '\'' +
                ", etudiants=" + etudiants +
                '}';
    }
}
