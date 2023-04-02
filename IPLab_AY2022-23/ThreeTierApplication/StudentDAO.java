package com.rmkcet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	public List<StudentBean> getRecord(int deptId) {
		StudentBean studentBean = null;
		List<StudentBean> studentList = new ArrayList<>();
		String query = "select * from student where deptId=?";
		try (Connection connection = DatabaseConnection.getDatabaseConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, deptId);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				studentBean = new StudentBean();
				studentBean.setRegisterNumber(resultSet.getInt("regno"));
				studentBean.setName(resultSet.getString("name"));
				studentBean.setCgpa(resultSet.getDouble("cgpa"));
				studentBean.setDepartmentID(resultSet.getInt("deptId"));
				studentList.add(studentBean);
			}
		}

		catch (SQLException | IOException e) {
			e.printStackTrace();
		}

		return studentList;
	}

}
