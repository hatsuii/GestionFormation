
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creationFormation complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="creationFormation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.demoFormation.ensup.eu/}formation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creationFormation", propOrder = {
    "arg0"
})
public class CreationFormation {

    protected Formation arg0;

    /**
     * Obtient la valeur de la propri�t� arg0.
     * 
     * @return
     *     possible object is
     *     {@link Formation }
     *     
     */
    public Formation getArg0() {
        return arg0;
    }

    /**
     * D�finit la valeur de la propri�t� arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Formation }
     *     
     */
    public void setArg0(Formation value) {
        this.arg0 = value;
    }

}
