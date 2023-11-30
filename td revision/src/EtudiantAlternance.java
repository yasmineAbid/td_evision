public class EtudiantAlternance extends Etudiant {
    private int salaire;

    public EtudiantAlternance(String nom, String prenom, int identifiant, float moyenne, int salaire) {
        super(nom, prenom, identifiant, moyenne);
        this.salaire = salaire;
    }

    @Override
    public void ajouterUneAbsence() {
        this.salaire -= 50;
    }

    @Override
    public String toString() {
        return "EtudiantAlternance{" +
                "salaire=" + salaire +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", identifiant=" + identifiant +
                ", moyenne=" + moyenne +
                '}';
    }
}