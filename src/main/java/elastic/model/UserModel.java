package elastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

@Document(indexName = "users")
@Data
public class UserModel {
	@Id
	 private String id;
	
	@Field(type = FieldType.Text, name = "email")
	 private String email;
	
	@Field(type = FieldType.Text, name = "couverture")
	 private String couverture;
	
	@Field(type = FieldType.Text, name = "name")
	 private String name;
	
	@Field(type = FieldType.Text, name = "password")
	 private String password;
	
	@Field(type = FieldType.Text, name = "profil")
	
	 private String profil;
	
	  @Field(type = FieldType.Nested, includeInParent = true,name = "roles")
	 private Role roles;
	
	

}
