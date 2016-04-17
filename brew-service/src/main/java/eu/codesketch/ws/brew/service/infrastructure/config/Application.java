/**
 * 
 */
package eu.codesketch.ws.brew.service.infrastructure.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import eu.codesketch.spring.cloud.ribbon.IpAddressLoadBalancerClient;

/**
 * @author quirino
 *
 */
@Configuration
@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan({ "eu.codesketch.ws.brew.service" })
public class Application {

    @Value("${db.username}")
    private String username;

    @Autowired
    private SpringClientFactory clientFactory;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public LoadBalancerClient getIpAddressLoadBalancerClient() {
        return new IpAddressLoadBalancerClient(clientFactory);
    }
}
