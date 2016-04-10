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
public class AccountMessage implements Message {

    private static final long serialVersionUID = -5793216086403925761L;

    @JsonProperty("name")
    private String name;

    @JsonCreator
    public AccountMessage(@JsonProperty("name") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AccountMessage [name=");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }
}
