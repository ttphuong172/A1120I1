package repository;

import model.Classes;
import model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> selectStudentByClass(String classId);
    Student findStudentById(String studentId);

}
