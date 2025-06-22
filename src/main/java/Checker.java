import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Checker {
	
	public static void main(String[] args) {   

        String url = "jdbc:mysql://localhost:3306/foodDelivery";
        String user = "root";
        String password = "tenmay2003";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "select rId,name,address from restaurant";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            	ResultSet resultSet = pstmt.executeQuery(sql);
            	while(resultSet.next()) {
            		System.out.println(resultSet.getInt("rId")+ " " + resultSet.getString("name") + " " + resultSet.getString("address"));
            	}
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
}
