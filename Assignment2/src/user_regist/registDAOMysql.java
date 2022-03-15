package user_regist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class registDAOMysql {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;

	public registDAOMysql() {

	}

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = DatabaseConnection.getInstance().getConnection();
		return conn;
	}

	public void add(User_registration user_regist) {
		try {
			String queryString = "INSERT INTO student(FirstName, LastName, PhoneNumber, EmailAddress,UserName,Age) VALUES(?,?,?,?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setString(1, user_regist.getFirstName());
			ptmt.setString(2, user_regist.getLastName());
			ptmt.setString(3, user_regist.getPhoneNumber());
			ptmt.setString(4, user_regist.getEmailAddress());
			ptmt.setString(5, user_regist.getUserName());
			ptmt.setInt(6, user_regist.getAge());
			ptmt.executeUpdate();
			System.out.println("Data Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void update(User_registration user_regist) {

		try {
			String queryString = "UPDATE student SET (FirstName=?, LastName=?) WHERE EmailAddress=?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setString(1, user_regist.getFirstName());
			ptmt.setString(2, user_regist.getLastName());
			ptmt.setString(3, user_regist.getEmailAddress());
			
			ptmt.executeUpdate();
			System.out.println("Table Updated Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}

	public void delete(String EmailAddress) {

		try {
			String queryString = "DELETE FROM student WHERE EmailAddress=?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setString(1, EmailAddress);
			ptmt.executeUpdate();
			System.out.println("Data deleted Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void findAll() {
		try {
			String queryString = "SELECT * FROM testdb2";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				System.out.println(
						" FirstName " + resultSet.getString("firstName") + ", lastName " + resultSet.getString("lastName") + ", PhoneNumber " + resultSet.getString("PhoneNumber") 
						+ ", EmailAddress " + resultSet.getString("EmailAddress") + ", UserName "
						+ resultSet.getString("UserName") + ", age " + resultSet.getInt("Age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}