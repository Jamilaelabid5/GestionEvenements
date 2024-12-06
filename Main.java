public class Main {
    public static void main(String[] args) {
        UtilisateurManager utilisateurManager = new UtilisateurManager();
        EvenementManager evenementManager = new EvenementManager();
        ReservationManager reservationManager = new ReservationManager();

        // Ajouter un utilisateur
        utilisateurManager.ajouterUtilisateur("Dupont", "Jean", "jean.dupont@example.com", "ETUDIANT");

        // Ajouter un événement
        evenementManager.ajouterEvenement("Conférence Java", "Une conférence sur le langage Java", 1);

        // Afficher les utilisateurs et événements
        System.out.println("Utilisateurs : " + utilisateurManager.afficherUtilisateurs());
        System.out.println("Événements : " + evenementManager.afficherEvenements());

        // Réserver une salle et un terrain pour un événement
        reservationManager.reserver(1, 1, 1, "2024-12-10 10:00:00");

        // Afficher les réservations
        reservationManager.afficherReservations();
    }
}

