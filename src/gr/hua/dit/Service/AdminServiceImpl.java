package gr.hua.dit.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hua.dit.DAO.AdminDAO;
import gr.hua.dit.entity.Role;
import gr.hua.dit.entity.User;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO adminDAO;

	@Override
	@Transactional
	public void saveUserService(User user) {
		adminDAO.saveUserDAO(user);
	}

	@Override
	@Transactional
	public List<User> getUsers() {
		
		return adminDAO.getUsers();
	}

	@Override
	@Transactional
	public User getUserById(int userId) {

		return adminDAO.getUserById(userId);
	}

	@Override
	@Transactional
	public void deleteUser(User user) {
		adminDAO.deleteUser(user);
	}

	@Override
	@Transactional
	public void saveRoleService(Role role) {
		adminDAO.saveRoleDAO(role);		
	}

	@Override
	@Transactional
	public List<Role> getRoles() {
		return adminDAO.getRoles();
	}

	@Override
	@Transactional
	public Role getRoleById(int roleId) {
		return adminDAO.getRoleById(roleId);
	}

	@Override
	@Transactional
	public void deleteRole(Role role) {
		adminDAO.deleteRole(role);		
	}

}
