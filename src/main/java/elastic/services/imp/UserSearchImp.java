package elastic.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import elastic.model.UserModel;
import elastic.repository.UserRepository;
import elastic.services.UserSearch;

@Service
public class UserSearchImp implements UserSearch {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void addUsers(UserModel user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public Iterable<UserModel> fullUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void addAllUsers(List<UserModel> users) {
		// TODO Auto-generated method stub
		userRepository.saveAll(users);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public void updateUser(UserModel user) {
		// TODO Auto-generated method stub
		
		if(userRepository.existsById(user.getId()))
		{
			userRepository.save(user);
		}
		
	}

}
