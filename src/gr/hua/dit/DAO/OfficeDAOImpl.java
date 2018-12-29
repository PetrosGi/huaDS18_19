package gr.hua.dit.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Role;
import gr.hua.dit.entity.Student;
import gr.hua.dit.entity.User;

@Repository
public class OfficeDAOImpl implements OfficeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Student> query = currentSession.createQuery("from Student", Student.class);
		
		List<Student> students = query.getResultList();
		
		return students;
	}

	@Override
	public void deleteStudent(Student student) {
		sessionFactory.getCurrentSession().delete(student);		
	}

	@Override
	public Student getStudentByID(int studentId) {
		Student student = (Student) sessionFactory.getCurrentSession().get(Student.class, studentId);
		return student;
	}

}
