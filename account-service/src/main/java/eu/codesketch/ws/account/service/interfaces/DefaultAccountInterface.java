/**
 * 
 */
package eu.codesketch.ws.account.service.interfaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger log = LoggerFactory.getLogger(DefaultAccountInterface.class);

    /*
     * (non-Javadoc)
     * 
     * @see
     * eu.codesketch.ws.account.service.interfaces.AccountInterface#authenticate
     * ()
     */
    @Override
    public Message createNewAccount(CreateAccountRequestMessage message) {
        log.info("create account");
        return new AccountCreatedResponseMessage("a token");
    }

    @Override
    public Message getAccountById(String id) {
        log.info("get account");
        return new GotAccountResponseMessage(new AccountMessage("account"));
    }

}
