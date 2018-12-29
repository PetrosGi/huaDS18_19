package gr.hua.dit.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gr.hua.dit.Service.AdminService;
import gr.hua.dit.Service.AdminServiceImpl;
import gr.hua.dit.entity.Role;
import gr.hua.dit.entity.User;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	

	@RequestMapping("/adminIndex")
	public String showAdminIndex() {
		
		return "/adminIndex";
	}

	@RequestMapping("/adminUserAdd")
	public String showAdminUserAdd(Model model) {
		User user = new User();		
		model.addAttribute("user", user);		
		return "adminUserAdd";
	}
	
	@RequestMapping("/addUser")
	public String addUser(@ModelAttribute("user") User user, Model model) {
		adminService.saveUserService(user);
		
		List<User> list = adminService.getUsers();
		model.addAttribute("user",list);
		//return "redirect:/admin/adminUserAdd";
		return "listUsers";
	}
	
	
	@RequestMapping("/listUsers")
	public String getUsers(Model model) {
		
		List<User> list = adminService.getUsers();
		model.addAttribute("user",list);
		return "listUsers";
	}
	
	
	@RequestMapping("/adminUserEdit")
	public String showAdminUserEdit(@RequestParam("uId") int userId, Model model) {
		
		User user = findById(userId);
		model.addAttribute("user", user);
		return "adminUserAdd";
	}

	@RequestMapping("/userDelete")
	public String deleteUser(@RequestParam("uId") int userId) {
		
		User user = findById(userId);
		adminService.deleteUser(user);
		return "redirect:/admin/listUsers";
	}
	
	
	private User findById(int userId) {
		User user =  adminService.getUserById(userId);
		return user;
	}
	
	
	@RequestMapping("/adminRoleAdd")
	public String showAdminRoleAdd(Model model) {
		Role role = new Role();		
		model.addAttribute("role", role);		
		return "adminRoleAdd";
	}
	
	@RequestMapping("/addRole")
	public String addRole(@ModelAttribute("role") Role role, Model model) {
		adminService.saveRoleService(role);
		
		List<Role> list = adminService.getRoles();
		model.addAttribute("role",list);
		return "listRoles";
	}
	
	
	@RequestMapping("/listRoles")
	public String getRoles(Model model) {
		
		List<Role> list = adminService.getRoles();
		model.addAttribute("role",list);
		return "listRoles";
	}
	
	@RequestMapping("/adminRoleEdit")
	public String showAdminRoleEdit(@RequestParam("rId") int roleId, Model model) {
		
		Role role = findRById(roleId);
		model.addAttribute("role", role);
		return "adminRoleAdd";
	}

	@RequestMapping("/roleDelete")
	public String deleteRole(@RequestParam("rId") int roleId) {
		
		Role role = findRById(roleId);
		adminService.deleteRole(role);
		return "redirect:/admin/listRoles";
	}
	
	
	private Role findRById(int roleId) {
		Role role =  adminService.getRoleById(roleId);
		return role;
	}


}
