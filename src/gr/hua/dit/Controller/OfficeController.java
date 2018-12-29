package gr.hua.dit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gr.hua.dit.Service.OfficeService;
import gr.hua.dit.entity.Student;
import gr.hua.dit.entity.User;

@Controller
@RequestMapping("/")
public class OfficeController {

	@Autowired
	private OfficeService officeService;
	
	
	@RequestMapping("/main-menu")
	public String showMainMenu() {
		return "/main-menu";
	}
	
	@RequestMapping("/listStudents")
	public String getStudents(Model model) {
		
		List<Student> list = officeService.getStudents();
		model.addAttribute("student",list);
		return "listStudents";
	}
	
	@RequestMapping("/studentDelete")
	public String deleteStudent(@RequestParam("studentId") int studentId) {
		
		Student student = findSById(studentId);
		officeService.deleteStudent(student);
		return "redirect:/listStudents";
	}
	
	
	private Student findSById(int studentId) {
		Student student =  officeService.getStudentById(studentId);
		return student;
	}
	
}
