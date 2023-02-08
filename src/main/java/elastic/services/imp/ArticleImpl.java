package elastic.services.imp;

import java.util.List;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import elastic.model.Article;
import elastic.model.Author;
import elastic.services.ArticleService;
@Service
public class ArticleImpl implements ArticleService {

	private ElasticsearchOperations elasticsearchOperations;
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
		elasticsearchOperations.indexOps(Article.class).create();
	
		
	}

}
