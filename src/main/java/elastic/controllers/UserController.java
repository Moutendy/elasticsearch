package elastic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import elastic.model.Article;
import elastic.model.UserModel;
import elastic.repository.ArticleRepository;
import elastic.repository.UserRepository;
import elastic.services.ArticleService;
import elastic.services.UserSearch;

@RestController
@RequestMapping("/elasctic/")
public class UserController {

	@Autowired
	private UserSearch userSearch;
	
	@Autowired
	private ArticleService servicearticle;
	
	@Autowired
	ArticleRepository articleRepository;
	
	@PostMapping("/getvaleur")
	public void gevaleur(@RequestBody final Article article)
	{
		servicearticle.saveUser(article);
	}
	
	@GetMapping("/getblog")
	public Iterable<Article>getblog()
	{
		return articleRepository.findAll();
	}
	
	@GetMapping("/getblogbyname/{name}")
	@ResponseBody
	public Iterable<Article>getblogbyname(@PathVariable String name)
	{
		return articleRepository.findByAuthorsName(name);
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
