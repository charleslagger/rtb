package rtb.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import rtb.model.User;

@Repository("userDao")
public class UserDao extends AbstractDao<Long, User>{
	
	public void save(User user) {
		user.setDay(new Date());
		persist(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();		
	}

}
