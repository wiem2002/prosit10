import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements;


    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }


    @Override
    public void ajouterDepartement(Departement t) {
        if (departements.add(t)) {
            System.out.println("Département ajouté avec succès !");
        } else {
            System.out.println("Le département existe déjà !");
        }
    }


    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep : departements) {
            if (dep.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean rechercherDepartement(Departement t) {
        return departements.contains(t);
    }


    @Override
    public void supprimerDepartement(Departement t) {
        if (departements.remove(t)) {
            System.out.println("Département supprimé avec succès !");
        } else {
            System.out.println("Le département n'existe pas !");
        }
    }


    @Override
    public void displayDepartement() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département à afficher.");
        } else {
            for (Departement dep : departements) {
                System.out.println(dep);
            }
        }
    }


    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedSet = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sortedSet.addAll(departements);
        return sortedSet;
    }
}
