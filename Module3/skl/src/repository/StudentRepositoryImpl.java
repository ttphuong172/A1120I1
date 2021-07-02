package repository;

import model.Classes;
import model.Student;
import repository.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public List<Student> selectStudentByClass(String classId) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Student> studentList=new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("select * from Students\n" +
                    "inner join ClassDetail\n" +
                    "on Students.StudentID=ClassDetail.StudentID\n" +
                    "inner join Skyline_Classes\n" +
                    "on ClassDetail.ClassID=Skyline_Classes.ClassID\n" +
                    "where ClassDetail.ClassID=?");
            preparedStatement.setString(1,classId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String studentId = resultSet.getString("studentid");
                String studentName = resultSet.getString("studentname");
                Student student=new Student(studentId,studentName);
                studentList.add(student);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    @Override
    public Student findStudentById(String studentId) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Student student=null;
        try {
            preparedStatement = connection.prepareStatement("select * from Students\n" +
                    "where StudentID=?");
            preparedStatement.setString(1,studentId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                String studentName = resultSet.getString("studentname");
                int gender=resultSet.getInt("gender");
                String birthDay=resultSet.getString("birthdate");
                 student=new Student(studentId,studentName,gender,birthDay);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

}

