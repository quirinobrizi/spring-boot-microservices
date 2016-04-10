/**
 * 
 */
package eu.codesketch.ws.brew.service.domain.model;

/**
 * V.O.
 * 
 * @author quirino
 *
 */
public class Hop {

    private String name;
    private Origin origin;
    private Type type;
    private Double alpha;
    private Double beta;
    private String note;

    private Hop(String name, Origin origin, Type type, Double alpha, Double beta, String note) {
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
        return this.origin.getName();
    }

    public String getType() {
        return this.type.name();
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

    public static Hop createHop(String name, Origin origin, Type type, Double alpha, Double beta, String note) {
        return new Hop(name, origin, type, alpha, beta, note);
    }
}
