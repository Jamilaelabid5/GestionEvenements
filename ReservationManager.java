import java.sql.*;

public class ReservationManager {

    public void reserver(int idEvenement, int idSalle, int idTerrain, String dateReservation) {
        String query = "INSERT INTO reservations (id_evenement, id_salle, id_terrain, date_reservation) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idEvenement);
            stmt.setInt(2, idSalle);
            stmt.setInt(3, idTerrain);
            stmt.setString(4, dateReservation);

            stmt.executeUpdate();
            System.out.println("Réservation effectuée avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void afficherReservations() {
        String query = "SELECT * FROM reservations";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.println("Réservation: Événement ID " + rs.getInt("id_evenement") +
                                   ", Salle ID " + rs.getInt("id_salle") +
                                   ", Terrain ID " + rs.getInt("id_terrain") +
                                   ", Date: " + rs.getString("date_reservation"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
