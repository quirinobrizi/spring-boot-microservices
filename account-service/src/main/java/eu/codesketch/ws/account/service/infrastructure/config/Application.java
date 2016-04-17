/**
 * 
 */
package eu.codesketch.ws.account.service.infrastructure.config;

import org.springframework.beans.factory.annotation.Autowired;
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
@ComponentScan("eu.codesketch.ws.account.service")
public class Application {

    @Autowired
    private SpringClientFactory clientFactory;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public LoadBalancerClient getDockerLoadBalancerClient() {
        return new IpAddressLoadBalancerClient(clientFactory);
    }
}
