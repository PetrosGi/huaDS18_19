package gr.hua.dit.DAO;

import java.util.List;

import gr.hua.dit.entity.Role;
import gr.hua.dit.entity.User;

public interface AdminDAO {

	public void saveUserDAO(User userObj);
	
	public List<User> getUsers();

	public User getUserById(int userId);

	public void deleteUser(User user);

	public void saveRoleDAO(Role role);

	public List<Role> getRoles();

	public Role getRoleById(int roleId);

	public void deleteRole(Role role);

	
}
