package gr.hua.dit.DAO;

import java.util.List;

import gr.hua.dit.entity.Student;

public interface OfficeDAO {

	List<Student> getStudents();

	void deleteStudent(Student student);

	Student getStudentByID(int studentId);

}
