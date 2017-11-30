package rtb.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rtb.dao.UserDao;
import rtb.model.User;

@Service("userService")
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;

	public void createUser(User user){
//		if(ObjectUtils.isEmpty(user)) {
//			throw new Exception();
//		}
		
		userDao.save(user);
		
	}

	public Collection<User> getUsers() {
		return userDao.getUsers();
	}
	
	
}
