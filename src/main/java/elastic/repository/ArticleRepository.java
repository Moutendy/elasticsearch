package elastic.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import org.springframework.stereotype.Repository;

import elastic.model.Article;
@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article, String>{
	
	List<Article> findByAuthorsName(String name);
	
	List<Article> findByTitle(String name);
}
