/**
 * 
 */
package eu.codesketch.ws.commons.message.brew;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import eu.codesketch.ws.commons.message.Message;

/**
 * @author quirino
 *
 */
@JsonInclude(Include.NON_EMPTY)
public class HopMessage implements Message {

    private static final long serialVersionUID = 6067716723405680250L;

    @JsonProperty("name")
    private String name;

    @JsonCreator
    public HopMessage(@JsonProperty("name") String name) {
        this.name = name;
    }

}
