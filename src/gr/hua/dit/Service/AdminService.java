package gr.hua.dit.Service;

import java.util.List;

import gr.hua.dit.entity.Role;
import gr.hua.dit.entity.User;

public interface AdminService {

	public void saveUserService(User user);
	
	public List<User> getUsers();

	public User getUserById(int userId);

	public void deleteUser(User user);

	public void saveRoleService(Role role);

	public List<Role> getRoles();

	public Role getRoleById(int roleId);

	public void deleteRole(Role role);
	
}
