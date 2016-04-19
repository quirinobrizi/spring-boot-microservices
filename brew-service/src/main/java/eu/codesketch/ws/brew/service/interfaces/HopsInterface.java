/**
 * 
 */
package eu.codesketch.ws.brew.service.interfaces;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import eu.codesketch.ws.commons.message.Message;
import eu.codesketch.ws.commons.message.brew.CreateHopRequestMessage;

/**
 * @author quirino
 *
 */

@RequestMapping(
    value = "/hops",
    produces = { MediaType.APPLICATION_JSON_VALUE })
public interface HopsInterface {

    @RequestMapping(
        method = RequestMethod.GET)
    @ResponseStatus(
        value = HttpStatus.OK)
    @ResponseBody
    Message getAllHops();

    @RequestMapping(
        method = RequestMethod.POST)
    @ResponseStatus(
        value = HttpStatus.CREATED)
    void addHop(CreateHopRequestMessage message);
}
