package elastic.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import elastic.model.Article;
@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article, String>{
	
	Page<Article> findByAuthorsName(String name, Pageable pageable);
}
