
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreationFormation_QNAME = new QName("http://service.demoFormation.ensup.eu/", "creationFormation");
    private final static QName _LireFormation_QNAME = new QName("http://service.demoFormation.ensup.eu/", "lireFormation");
    private final static QName _LireTouteFormationResponse_QNAME = new QName("http://service.demoFormation.ensup.eu/", "lireTouteFormationResponse");
    private final static QName _CreationFormationResponse_QNAME = new QName("http://service.demoFormation.ensup.eu/", "creationFormationResponse");
    private final static QName _ModifierFormation_QNAME = new QName("http://service.demoFormation.ensup.eu/", "modifierFormation");
    private final static QName _SupprimerFormation_QNAME = new QName("http://service.demoFormation.ensup.eu/", "supprimerFormation");
    private final static QName _ModifierFormationResponse_QNAME = new QName("http://service.demoFormation.ensup.eu/", "modifierFormationResponse");
    private final static QName _SupprimerFormationResponse_QNAME = new QName("http://service.demoFormation.ensup.eu/", "supprimerFormationResponse");
    private final static QName _LireFormationResponse_QNAME = new QName("http://service.demoFormation.ensup.eu/", "lireFormationResponse");
    private final static QName _LireTouteFormation_QNAME = new QName("http://service.demoFormation.ensup.eu/", "lireTouteFormation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LireFormation }
     * 
     */
    public LireFormation createLireFormation() {
        return new LireFormation();
    }

    /**
     * Create an instance of {@link LireTouteFormationResponse }
     * 
     */
    public LireTouteFormationResponse createLireTouteFormationResponse() {
        return new LireTouteFormationResponse();
    }

    /**
     * Create an instance of {@link CreationFormation }
     * 
     */
    public CreationFormation createCreationFormation() {
        return new CreationFormation();
    }

    /**
     * Create an instance of {@link CreationFormationResponse }
     * 
     */
    public CreationFormationResponse createCreationFormationResponse() {
        return new CreationFormationResponse();
    }

    /**
     * Create an instance of {@link ModifierFormation }
     * 
     */
    public ModifierFormation createModifierFormation() {
        return new ModifierFormation();
    }

    /**
     * Create an instance of {@link ModifierFormationResponse }
     * 
     */
    public ModifierFormationResponse createModifierFormationResponse() {
        return new ModifierFormationResponse();
    }

    /**
     * Create an instance of {@link SupprimerFormation }
     * 
     */
    public SupprimerFormation createSupprimerFormation() {
        return new SupprimerFormation();
    }

    /**
     * Create an instance of {@link LireFormationResponse }
     * 
     */
    public LireFormationResponse createLireFormationResponse() {
        return new LireFormationResponse();
    }

    /**
     * Create an instance of {@link LireTouteFormation }
     * 
     */
    public LireTouteFormation createLireTouteFormation() {
        return new LireTouteFormation();
    }

    /**
     * Create an instance of {@link SupprimerFormationResponse }
     * 
     */
    public SupprimerFormationResponse createSupprimerFormationResponse() {
        return new SupprimerFormationResponse();
    }

    /**
     * Create an instance of {@link Formation }
     * 
     */
    public Formation createFormation() {
        return new Formation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreationFormation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demoFormation.ensup.eu/", name = "creationFormation")
    public JAXBElement<CreationFormation> createCreationFormation(CreationFormation value) {
        return new JAXBElement<CreationFormation>(_CreationFormation_QNAME, CreationFormation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LireFormation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demoFormation.ensup.eu/", name = "lireFormation")
    public JAXBElement<LireFormation> createLireFormation(LireFormation value) {
        return new JAXBElement<LireFormation>(_LireFormation_QNAME, LireFormation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LireTouteFormationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demoFormation.ensup.eu/", name = "lireTouteFormationResponse")
    public JAXBElement<LireTouteFormationResponse> createLireTouteFormationResponse(LireTouteFormationResponse value) {
        return new JAXBElement<LireTouteFormationResponse>(_LireTouteFormationResponse_QNAME, LireTouteFormationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreationFormationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demoFormation.ensup.eu/", name = "creationFormationResponse")
    public JAXBElement<CreationFormationResponse> createCreationFormationResponse(CreationFormationResponse value) {
        return new JAXBElement<CreationFormationResponse>(_CreationFormationResponse_QNAME, CreationFormationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierFormation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demoFormation.ensup.eu/", name = "modifierFormation")
    public JAXBElement<ModifierFormation> createModifierFormation(ModifierFormation value) {
        return new JAXBElement<ModifierFormation>(_ModifierFormation_QNAME, ModifierFormation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerFormation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demoFormation.ensup.eu/", name = "supprimerFormation")
    public JAXBElement<SupprimerFormation> createSupprimerFormation(SupprimerFormation value) {
        return new JAXBElement<SupprimerFormation>(_SupprimerFormation_QNAME, SupprimerFormation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierFormationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demoFormation.ensup.eu/", name = "modifierFormationResponse")
    public JAXBElement<ModifierFormationResponse> createModifierFormationResponse(ModifierFormationResponse value) {
        return new JAXBElement<ModifierFormationResponse>(_ModifierFormationResponse_QNAME, ModifierFormationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerFormationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demoFormation.ensup.eu/", name = "supprimerFormationResponse")
    public JAXBElement<SupprimerFormationResponse> createSupprimerFormationResponse(SupprimerFormationResponse value) {
        return new JAXBElement<SupprimerFormationResponse>(_SupprimerFormationResponse_QNAME, SupprimerFormationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LireFormationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demoFormation.ensup.eu/", name = "lireFormationResponse")
    public JAXBElement<LireFormationResponse> createLireFormationResponse(LireFormationResponse value) {
        return new JAXBElement<LireFormationResponse>(_LireFormationResponse_QNAME, LireFormationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LireTouteFormation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demoFormation.ensup.eu/", name = "lireTouteFormation")
    public JAXBElement<LireTouteFormation> createLireTouteFormation(LireTouteFormation value) {
        return new JAXBElement<LireTouteFormation>(_LireTouteFormation_QNAME, LireTouteFormation.class, null, value);
    }

}
