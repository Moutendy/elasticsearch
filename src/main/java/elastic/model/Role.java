package elastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;
@Document(indexName = "roles")
@Data
public class Role {
	@Id
	 private String id;
	@Field(type = FieldType.Text, name = "name")
	private String name;
}
