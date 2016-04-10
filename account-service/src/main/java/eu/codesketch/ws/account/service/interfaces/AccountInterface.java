/**
 * 
 */
package eu.codesketch.ws.account.service.interfaces;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import eu.codesketch.ws.commons.message.Message;
import eu.codesketch.ws.commons.message.account.CreateAccountRequestMessage;

/**
 * @author quirino
 *
 */
@RequestMapping(
    value = "/accounts",
    produces = { MediaType.APPLICATION_JSON_VALUE })
public interface AccountInterface {

    @RequestMapping(
        value = "/{id}",
        method = RequestMethod.GET)
    @ResponseStatus(
        value = HttpStatus.OK)
    @ResponseBody
    Message getAccountById(@PathVariable(
        value = "id") String id);

    @RequestMapping(
        method = RequestMethod.POST,
        consumes = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseStatus(
        value = HttpStatus.CREATED)
    @ResponseBody
    Message createNewAccount(@RequestBody CreateAccountRequestMessage message);

}
