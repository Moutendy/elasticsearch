package elastic.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "blog")
public class Article {

	   @Id
	    private String id;
	   
		@Field(type = FieldType.Text, name = "title")
	    private String title;
	    
	    @Field(type = FieldType.Nested, includeInParent = true)
	    private List<Author> authors;
}
