package gr.hua.dit.Service;

import java.util.List;

import gr.hua.dit.entity.Student;

public interface OfficeService {

	List<Student> getStudents();

	void deleteStudent(Student student);

	Student getStudentById(int studentId);

}
