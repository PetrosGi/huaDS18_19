package gr.hua.dit.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hua.dit.DAO.OfficeDAO;
import gr.hua.dit.entity.Student;

@Service
public class OfficeServiceImp implements OfficeService {

	@Autowired
	private OfficeDAO officeDAO;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		return officeDAO.getStudents();
	}

	@Override
	@Transactional
	public void deleteStudent(Student student) {
		officeDAO.deleteStudent(student);
	}

	@Override
	public Student getStudentById(int studentId) {
		return officeDAO.getStudentByID(studentId);
	}

}
