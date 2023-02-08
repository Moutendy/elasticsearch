package elastic.services;

import java.util.List;

import elastic.model.Article;


public interface ArticleService {

	
	Iterable<Article> fullArticle();
	
	void addAllUsers(List<Article>articles);
	
	void delete(String id);
	
	void updateUser(Article article);
	
	void saveUser(Article article);
}
