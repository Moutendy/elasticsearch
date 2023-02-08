package elastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

@Document(indexName = "authors")
@Data
public class Author {
	
	 @Id
	 private String id;
	 
	@Field(type = FieldType.Text, name = "name")
    private String name;
}
