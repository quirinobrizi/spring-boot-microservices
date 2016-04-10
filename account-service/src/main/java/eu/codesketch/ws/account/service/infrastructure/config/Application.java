/**
 * 
 */
package eu.codesketch.ws.account.service.infrastructure.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author quirino
 *
 */

@Configuration
@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan("eu.codesketch.ws.account.service")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
