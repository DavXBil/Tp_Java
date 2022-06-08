package tp_interfaces.difficile;

import fr.diginamic.banque.entites.Compte;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class CompteDaoMem implements CompteDao {
    List<Compte> comptes = new ArrayList<>();

    @Override
    public List<Compte> lister() {
        return comptes;
    }

    @Override
    public void sauvegarder(Compte nvCompte) {

        System.out.println(nvCompte);

        comptes.add(nvCompte);

    }

    @Override
    public boolean supprimer(String numero) {

        comptes.remove(parseInt(numero));

        return true;
    }

    @Override
    public boolean existe(String numero) {

        System.out.println(comptes.get(parseInt(numero)));
        return true;

    }

    @Override
    public Compte getCompte(String numero) {

        return comptes.get(parseInt(numero));

    }
}
