/**
 * 
 */
package eu.codesketch.ws.commons.message.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import eu.codesketch.ws.commons.message.Message;

/**
 * @author quirino
 *
 */
@JsonInclude(Include.NON_NULL)
public class GotAccountResponseMessage implements Message {

    private static final long serialVersionUID = -8193874501968906681L;

    @JsonProperty("account")
    private AccountMessage account;

    @JsonCreator
    public GotAccountResponseMessage(@JsonProperty("account") AccountMessage account) {
        this.account = account;
    }

    public AccountMessage getAccount() {
        return account;
    }
}
