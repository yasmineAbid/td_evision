import java.util.Objects;

public abstract class Etudiant {
    protected String nom;
    protected String prenom;
    protected int identifiant;
    protected float moyenne;

    public Ecole getEcole() {
        return ecole;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }

    public Ecole ecole;

    public Etudiant(String nom, String prenom, int identifiant, float moyenne) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.moyenne = moyenne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return identifiant == etudiant.identifiant && Float.compare(moyenne, etudiant.moyenne) == 0 && Objects.equals(nom, etudiant.nom) && Objects.equals(prenom, etudiant.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, identifiant, moyenne);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne='" + moyenne + '\'' +
                ", identifiant='" + identifiant + '\'' +
                '}';
    }

    public abstract void ajouterUneAbsence();
}
