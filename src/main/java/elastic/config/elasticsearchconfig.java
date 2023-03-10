package elastic.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.erhlc.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.client.erhlc.RestClients;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;

@Configuration
@EnableElasticsearchRepositories(basePackages = "elastic.repository")
@ComponentScan(basePackages = { "elastic.services" })
public class elasticsearchconfig{


	    @Bean
	    public RestClient getRestClient() {
	        RestClient restClient = RestClient.builder(
	                new HttpHost("localhost", 9200)).build();
	        return restClient;
	    }

	    @Bean
	    public  ElasticsearchTransport getElasticsearchTransport() {
	        return new RestClientTransport(
	                getRestClient(), new JacksonJsonpMapper());
	    }
	    
	    @Bean
	    public ElasticsearchClient getElasticsearchClient(){
	        ElasticsearchClient client = new ElasticsearchClient(getElasticsearchTransport());
	        return client;
	    }

	

		
	

}
