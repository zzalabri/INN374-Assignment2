
package n9244255sales.warehouse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetComponentResult" type="{http://schemas.datacontract.org/2004/07/n8911371WarehouseService}Warehouse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getComponentResult"
})
@XmlRootElement(name = "GetComponentResponse")
public class GetComponentResponse {

    @XmlElementRef(name = "GetComponentResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Warehouse> getComponentResult;

    /**
     * Gets the value of the getComponentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Warehouse }{@code >}
     *     
     */
    public JAXBElement<Warehouse> getGetComponentResult() {
        return getComponentResult;
    }

    /**
     * Sets the value of the getComponentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Warehouse }{@code >}
     *     
     */
    public void setGetComponentResult(JAXBElement<Warehouse> value) {
        this.getComponentResult = value;
    }

}
