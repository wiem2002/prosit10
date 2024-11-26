import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement dep1 = new Departement(1, "Informatique", 10);
        Departement dep2 = new Departement(2, "Ressources Humaines", 5);
        Departement dep3 = new Departement(3, "Marketing", 8);

        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);

        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();

        System.out.println("Recherche par nom (Marketing) : " + gestionDepartements.rechercherDepartement("Marketing"));

        System.out.println("Tri par ID :");
        TreeSet<Departement> sorted = gestionDepartements.trierDepartementById();
        for (Departement dep : sorted) {
            System.out.println(dep);
        }

        gestionDepartements.supprimerDepartement(dep2);
        System.out.println("Liste après suppression :");
        gestionDepartements.displayDepartement();
    }
}
