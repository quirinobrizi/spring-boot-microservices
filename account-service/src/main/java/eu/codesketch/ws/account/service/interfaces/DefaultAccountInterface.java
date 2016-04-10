/**
 * 
 */
package eu.codesketch.ws.account.service.interfaces;

import org.springframework.web.bind.annotation.RestController;

import eu.codesketch.ws.commons.message.Message;
import eu.codesketch.ws.commons.message.account.AccountCreatedResponseMessage;
import eu.codesketch.ws.commons.message.account.AccountMessage;
import eu.codesketch.ws.commons.message.account.CreateAccountRequestMessage;
import eu.codesketch.ws.commons.message.account.GotAccountResponseMessage;

/**
 * @author quirino
 *
 */
@RestController
public class DefaultAccountInterface implements AccountInterface {

    /*
     * (non-Javadoc)
     * 
     * @see
     * eu.codesketch.ws.account.service.interfaces.AccountInterface#authenticate
     * ()
     */
    @Override
    public Message createNewAccount(CreateAccountRequestMessage message) {
        return new AccountCreatedResponseMessage("a token");
    }

    @Override
    public Message getAccountById(String id) {
        return new GotAccountResponseMessage(new AccountMessage("account"));
    }

}
