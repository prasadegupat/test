package com.intellect.hrm.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.MimeMappings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.intellect.hrm.aop.logging.LoggingAspect;

/**
 * Configuration of web application with Servlet 3.0 APIs.
 */
@Configuration
@EnableAspectJAutoProxy
@EnableJpaAuditing
@EnableJpaRepositories("com.intellect.hrm.repository")
@EnableTransactionManagement
@EnableElasticsearchRepositories("com.intellect.hrm.repository.search")
public class WebConfigurer implements  EmbeddedServletContainerCustomizer {

    private final Logger log = LoggerFactory.getLogger(WebConfigurer.class);
   
    
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        MimeMappings mappings = new MimeMappings(MimeMappings.DEFAULT);
        // IE issue, see https://github.com/jhipster/generator-jhipster/pull/711
        mappings.add("html", MediaType.TEXT_HTML_VALUE + ";charset=utf-8");
        // CloudFoundry issue, see https://github.com/cloudfoundry/gorouter/issues/64
        mappings.add("json", MediaType.TEXT_HTML_VALUE + ";charset=utf-8");
        container.setMimeMappings(mappings);
        //setLocationForStaticAssets(container);
  
    }
  //for cors filters
   
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
            log.debug("Registering CORS filter");
            config.setAllowCredentials(true); 
        	config.addAllowedOrigin("*"); 
        	config.addAllowedHeader("*"); 
        	config.addAllowedMethod("*"); 
        	source.registerCorsConfiguration("/api/**", config);
        	source.registerCorsConfiguration("/v2/api-docs", config);
        return new CorsFilter(source);
    }
    //for logging aspect..
    @Bean
    @Profile("dev")
    public LoggingAspect loggingAspect(Environment env) {
        return new LoggingAspect(env);
    }
    
    /*
     * Support for Hibernate types in Jackson.
     */
    @Bean
    public Hibernate5Module hibernate5Module() {
        return new Hibernate5Module();
    }

    /*
     * Jackson Afterburner module to speed up serialization/deserialization.
     */
    @Bean
    public AfterburnerModule afterburnerModule() {
        return new AfterburnerModule();
    }

  
}

