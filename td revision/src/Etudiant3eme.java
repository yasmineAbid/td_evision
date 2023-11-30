import java.util.List;

public class Etudiant3eme extends Etudiant {
    private String branche;

    public Etudiant3eme (String nom, String prenom, int identifiant, float moyenne, String branche) {
        super(nom, prenom, identifiant, moyenne);
        this.branche = branche;
    }
    @Override
    public void ajouterUneAbsence() {
        this.moyenne -= 0.5;
    }


}