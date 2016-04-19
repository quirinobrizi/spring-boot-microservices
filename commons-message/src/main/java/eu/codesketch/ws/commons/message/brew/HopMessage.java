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
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("type")
    private String type;
    @JsonProperty("alpha")
    private Double alpha;
    @JsonProperty("beta")
    private Double beta;
    @JsonProperty("note")
    private String note;

    @JsonCreator
    public HopMessage(@JsonProperty("name") String name, @JsonProperty("origin") String origin,
            @JsonProperty("type") String type, @JsonProperty("alpha") Double alpha, @JsonProperty("beta") Double beta,
            @JsonProperty("note") String note) {
        this.name = name;
        this.origin = origin;
        this.type = type;
        this.alpha = alpha;
        this.beta = beta;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getType() {
        return type;
    }

    public Double getAlpha() {
        return alpha;
    }

    public Double getBeta() {
        return beta;
    }

    public String getNote() {
        return note;
    }

}
