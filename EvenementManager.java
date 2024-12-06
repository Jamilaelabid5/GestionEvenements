import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EvenementManager {

    public void ajouterEvenement(String titre, String description, int idUser) {
        String query = "INSERT INTO evenements (titre, description, id_user) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, titre);
            stmt.setString(2, description);
            stmt.setInt(3, idUser);

            stmt.executeUpdate();
            System.out.println("Événement ajouté avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> afficherEvenements() {
        List<String> evenements = new ArrayList<>();
        String query = "SELECT * FROM evenements";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                evenements.add(rs.getString("titre") + " - " + rs.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return evenements;
    }

    public void supprimerEvenement(int id) {
        String query = "DELETE FROM evenements WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Événement supprimé avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
