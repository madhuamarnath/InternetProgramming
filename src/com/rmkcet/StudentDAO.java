package com.rmkcet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	public StudentBean getRecord(int regno) {
		StudentBean studentBean = new StudentBean();
		String query = "select * from student where regno=" + regno;
		try (Connection connection = DatabaseConnection.getDatabaseConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(query)) {
			while (resultSet.next()) {
				studentBean.setRegisterNumber(resultSet.getInt("regno"));
				studentBean.setName(resultSet.getString("name"));
				studentBean.setCgpa(resultSet.getDouble("cgpa"));
				studentBean.setDepartmentID(resultSet.getInt("deptId"));
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return studentBean;
	}

}
