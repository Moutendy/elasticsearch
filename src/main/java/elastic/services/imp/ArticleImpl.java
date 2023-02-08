package elastic.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import elastic.model.Article;
import elastic.model.Author;
import elastic.repository.ArticleRepository;
import elastic.services.ArticleService;
@Service
public class ArticleImpl implements ArticleService {

	@Autowired
	ArticleRepository articleRepository;
	
	@Override
	public Iterable<Article> fullArticle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAllUsers(List<Article> articles) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(Article article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveUser(Article article) {
		// TODO Auto-generated method stub
	    articleRepository.save(article);
	}

}
