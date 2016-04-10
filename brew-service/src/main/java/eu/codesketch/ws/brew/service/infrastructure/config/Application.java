/**
 * 
 */
package eu.codesketch.ws.brew.service.infrastructure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author quirino
 *
 */
@Configuration
@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan("eu.codesketch.ws.brew.service")
public class Application {

    @Value("${db.username}")
    private String username;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public String dbUsername() {
        System.err.println(">>>>>>>>>>>>>>> " + username);
        return username;
    }
}
