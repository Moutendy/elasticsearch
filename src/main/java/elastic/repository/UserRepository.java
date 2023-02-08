package elastic.repository;



import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import org.springframework.stereotype.Repository;

import elastic.model.UserModel;


@Repository
public interface UserRepository extends  ElasticsearchRepository<UserModel, String>{

	

}



