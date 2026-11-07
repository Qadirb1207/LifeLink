
package requests;

import database.DataConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequestManager {

    public boolean saveRequest(Request req) {

        String sql = "INSERT INTO Requests "
                + "(custId, bloodGroup, unitsRequired, requestDate, requestStatus) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DataConnection.getConnection()) {

            if (con == null) {
                return false;
            }

            try (PreparedStatement ps =
                    con.prepareStatement(sql,
                    PreparedStatement.RETURN_GENERATED_KEYS)) {

                ps.setInt(1, req.getCustId());
                ps.setString(2, req.getBloodGroup());
                ps.setInt(3, req.getUnitsRequired());
                ps.setDate(4,
                        java.sql.Date.valueOf(req.getRequestDate()));
                ps.setString(5, req.getRequestStatus());

                int rows = ps.executeUpdate();

                if (rows > 0) {

                    try (ResultSet rs = ps.getGeneratedKeys()) {
                        if (rs.next()) {
                            req.setRequestId(rs.getInt(1));
                        }
                    }

                    System.out.println("Request Saved Successfully!");
                    System.out.println("Generated Request ID: "
                            + req.getRequestId());

                    return true;
                }

            }

        } catch (SQLException e) {
            System.out.println("Request Save Failed!");
            e.printStackTrace();
        }

        return false;
    }
}
