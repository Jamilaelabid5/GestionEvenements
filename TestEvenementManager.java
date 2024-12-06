import java.util.List;

public class TestEvenementManager {
    public static void main(String[] args) {
        // Créez une instance de EvenementManager
        EvenementManager evenementManager = new EvenementManager();

        // Ajouter un événement
        evenementManager.ajouterEvenement("Conférence Java", "2024-12-15", "10:00", "Salle A");

        // Afficher tous les événements
        System.out.println("Liste des événements :");
        List<String> evenements = evenementManager.afficherEvenements();
        for (String evenement : evenements) {
            System.out.println(evenement);
        }

        // Supprimer un événement (par exemple, avec id = 1)
        evenementManager.supprimerEvenement(1);
    }
}
