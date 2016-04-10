/**
 * 
 */
package eu.codesketch.ws.brew.service.domain.model;

/**
 * @author quirino
 *
 */
public enum Origin {

    UK("United Kingodom"), USA("United States of America");

    private String name;

    private Origin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
