package com.intellect.hrm.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

@Configuration
public class ElasticSearchConfiguration {
    @Value("${spring.data.elasticsearch.cluster-name}")
    private String clusterName;
    @Value("${spring.data.elasticsearch.cluster-nodes}")
    private String clusterNodes;
    
    TransportClient client;
    @Bean
    public ElasticsearchTemplate elasticsearchTemplate() throws UnknownHostException {
            String server = clusterNodes.split(":")[0];
            Integer port = Integer.parseInt(clusterNodes.split(":")[1]);
            Settings settings = Settings.settingsBuilder()
                .put("cluster.name", clusterName).build();
            client = TransportClient.builder().settings(settings).build()
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(server), port));
            return new ElasticsearchTemplate(client);
  }
    
    /*@Bean
    public Client client() {
        TransportClient client = new TransportClient()
        String server = clusterNodes.split(":")[0];
        Integer port = Integer.parseInt(clusterNodes.split(":")[1]);
        TransportAddress address = new InetSocketTransportAddress(server,port);
        client.addTransportAddress(address);        
        return client;
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(client());
    }
*/
    
    }
