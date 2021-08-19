import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost\\sqlexpress;databaseName=Student";
		String username = "ht";
		String password = "12345";
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			// String sql = "INSERT INTO info (Name)" + "VAlUES ('Aloha')";
			String sql = "INSERT INTO info (Name)" + "VAlUES (?)";

			// Statement statement = connection.createStatement();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "Kim");
			// int rows = statement.executeUpdate(sql);
			int rows = statement.executeUpdate();

			if (rows > 0) {
				System.out.println("Rows has been inserted");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
