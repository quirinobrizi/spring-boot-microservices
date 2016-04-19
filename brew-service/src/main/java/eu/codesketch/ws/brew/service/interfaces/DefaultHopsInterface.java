/**
 * 
 */
package eu.codesketch.ws.brew.service.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import eu.codesketch.ws.brew.service.app.HopService;
import eu.codesketch.ws.brew.service.interfaces.translator.HopMessageTranslator;
import eu.codesketch.ws.brew.service.interfaces.translator.HopTranslator;
import eu.codesketch.ws.commons.message.Message;
import eu.codesketch.ws.commons.message.brew.CreateHopRequestMessage;
import eu.codesketch.ws.commons.message.brew.GotHopsResponseMessage;

/**
 * @author quirino
 *
 */
@RestController
public class DefaultHopsInterface implements HopsInterface {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    @Autowired
    private HopService hopService;
    @Autowired
    private HopTranslator hopTranslator;
    @Autowired
    private HopMessageTranslator hopMessageTranslator;

    /*
     * (non-Javadoc)
     * 
     * @see eu.codesketch.ws.brew.service.interfaces.HopsInterface#getAllHops()
     */
    @Override
    public Message getAllHops() {

        // GotAccountResponseMessage accountResponseMessage =
        // this.restTemplate.getForObject(
        // "http://account-service/accounts/1",
        // GotAccountResponseMessage.class);
        return new GotHopsResponseMessage(hopTranslator.translate(hopService.retrieveAllHops()));
    }

    @Override
    public void addHop(CreateHopRequestMessage message) {
        hopService.createNewHop(hopMessageTranslator.translate(message.getHop()));
    }

}
