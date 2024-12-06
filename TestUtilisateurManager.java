public class TestUtilisateurManager {
    public static void main(String[] args) {
        UtilisateurManager utilisateurManager = new UtilisateurManager();

        // Ajouter un utilisateur
        utilisateurManager.ajouterUtilisateur("John", "Doe", "john@example.com", "ETUDIANT");

        // Afficher les utilisateurs
        System.out.println("Liste des utilisateurs :");
        for (String utilisateur : utilisateurManager.afficherUtilisateurs()) {
            System.out.println(utilisateur);
        }

        // Supprimer un utilisateur (par exemple, avec id = 1)
        utilisateurManager.supprimerUtilisateur(1);
    }
}
