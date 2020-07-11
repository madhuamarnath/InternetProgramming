import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String deptName = sc.nextLine();
		// rmkcet is the database name
		String connectionUrl = "jdbc:mysql://localhost/rmkcet";
		String userName = "root";
		String password = "password";
		String query = "select * from student S join department D on D.deptId = S.deptId where deptName='" + deptName
				+ "'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(connectionUrl, userName, password);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1));
				System.out.print("\t" + resultSet.getString(2));
				System.out.print("\t" + resultSet.getDouble(3) + "\n");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
