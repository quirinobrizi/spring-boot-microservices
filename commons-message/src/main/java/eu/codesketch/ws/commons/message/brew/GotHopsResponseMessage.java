/**
 * 
 */
package eu.codesketch.ws.commons.message.brew;

import java.util.List;

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
public class GotHopsResponseMessage implements Message {

    private static final long serialVersionUID = -8795120808320191526L;

    @JsonProperty("hops")
    private List<HopMessage> hops;

    @JsonCreator
    public GotHopsResponseMessage(@JsonProperty("hops") List<HopMessage> hops) {
        this.hops = hops;
    }
}
