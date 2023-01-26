package elastic.services;

import java.util.List;

import elastic.model.UserModel;

public interface UserSearch {

	void addUsers(UserModel user);
	 
	Iterable<UserModel> fullUsers();
	
	void addAllUsers(List<UserModel>users);
	
}
