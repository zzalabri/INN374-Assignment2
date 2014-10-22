
package n9244255client.sales;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for state.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="state">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Quote"/>
 *     &lt;enumeration value="Delay"/>
 *     &lt;enumeration value="Appointment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "state")
@XmlEnum
public enum State {

    @XmlEnumValue("Quote")
    QUOTE("Quote"),
    @XmlEnumValue("Delay")
    DELAY("Delay"),
    @XmlEnumValue("Appointment")
    APPOINTMENT("Appointment");
    private final String value;

    State(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static State fromValue(String v) {
        for (State c: State.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
