package tp_interfaces.difficile;

import fr.diginamic.banque.entites.Compte;

import java.util.List;

public interface CompteDao {

    List<Compte> lister();

    void sauvegarder(Compte nvCompte);

    boolean supprimer(String numero);

    boolean existe(String numero);

    Compte getCompte(String numero);
}
