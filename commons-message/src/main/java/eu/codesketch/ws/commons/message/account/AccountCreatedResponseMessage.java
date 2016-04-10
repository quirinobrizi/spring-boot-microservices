/**
 * 
 */
package eu.codesketch.ws.commons.message.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import eu.codesketch.ws.commons.message.Message;

/**
 * The response message sent on successful authentication.
 * 
 * @author quirino
 *
 */
public class AccountCreatedResponseMessage implements Message {

    private static final long serialVersionUID = 1251655483744049665L;

    @JsonProperty("token")
    private String token;

    @JsonCreator
    public AccountCreatedResponseMessage(@JsonProperty("token")
    String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
