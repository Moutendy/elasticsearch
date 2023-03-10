package elastic.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

@Document(indexName = "blog")
@Data
public class Article {

	   @Id
	    private String id;
	   
		@Field(type = FieldType.Text, name = "title")
	    private String title;
	    
	    @Field(type = FieldType.Nested, includeInParent = true,name = "authors")
	    private List<Author> authors;
}
