/**
 * 
 */
package eu.codesketch.ws.commons.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The message sent as response in case of error.
 * 
 * @author quirino
 *
 */
public class FailedResponseMessage implements Message {

    private static final long serialVersionUID = 8452824341532114387L;

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("message")
    private String message;

    @JsonCreator()
    public FailedResponseMessage(@JsonProperty("code")
    Integer code, @JsonProperty("message")
    String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
