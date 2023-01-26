package elastic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import elastic.model.UserModel;
import elastic.repository.UserRepository;
import elastic.services.UserSearch;

@RestController
@RequestMapping("/elasctic/")
public class UserController {

	@Autowired
	private UserSearch userSearch;
	
	@GetMapping("/getvaleur")
	static void gevaleur()
	{
		System.out.println("bonjour");
	}
	@PostMapping("/post")
	public void createProductIndexBulk(@RequestBody final List<UserModel> products) {
		userSearch.addAllUsers(products);
		 }
	
	    @PostMapping("/postall")
		 public void createProductIndex(@RequestBody final UserModel product) {
	    	userSearch.addUsers(product);
		 }
	    
	    @GetMapping("/findEverything")
	    public Iterable<UserModel> findAllEmployees() {
	        return userSearch.fullUsers();
	    }

}
