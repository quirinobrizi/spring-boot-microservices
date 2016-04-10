/**
 * 
 */
package eu.codesketch.ws.brew.service.interfaces;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import eu.codesketch.ws.commons.message.Message;
import eu.codesketch.ws.commons.message.account.GotAccountResponseMessage;
import eu.codesketch.ws.commons.message.brew.GotHopsResponseMessage;
import eu.codesketch.ws.commons.message.brew.HopMessage;

/**
 * @author quirino
 *
 */
@RestController
public class DefaultHopsInterface implements HopsInterface {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    /*
     * (non-Javadoc)
     * 
     * @see eu.codesketch.ws.brew.service.interfaces.HopsInterface#getAllHops()
     */
    @Override
    public Message getAllHops() {

        GotAccountResponseMessage accountResponseMessage = this.restTemplate.getForObject(
                "http://account-service/accounts/1", GotAccountResponseMessage.class);
        System.out.println(accountResponseMessage.getAccount());
        return new GotHopsResponseMessage(Arrays.asList(new HopMessage("Goldings")));
    }

}
