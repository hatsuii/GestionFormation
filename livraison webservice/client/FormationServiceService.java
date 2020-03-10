
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FormationServiceService", targetNamespace = "http://service.demoFormation.ensup.eu/", wsdlLocation = "http://localhost:8888/bg?wsdl")
public class FormationServiceService
    extends Service
{

    private final static URL FORMATIONSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException FORMATIONSERVICESERVICE_EXCEPTION;
    private final static QName FORMATIONSERVICESERVICE_QNAME = new QName("http://service.demoFormation.ensup.eu/", "FormationServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/bg?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FORMATIONSERVICESERVICE_WSDL_LOCATION = url;
        FORMATIONSERVICESERVICE_EXCEPTION = e;
    }

    public FormationServiceService() {
        super(__getWsdlLocation(), FORMATIONSERVICESERVICE_QNAME);
    }

    public FormationServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FORMATIONSERVICESERVICE_QNAME, features);
    }

    public FormationServiceService(URL wsdlLocation) {
        super(wsdlLocation, FORMATIONSERVICESERVICE_QNAME);
    }

    public FormationServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FORMATIONSERVICESERVICE_QNAME, features);
    }

    public FormationServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FormationServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IFormationService
     */
    @WebEndpoint(name = "FormationServicePort")
    public IFormationService getFormationServicePort() {
        return super.getPort(new QName("http://service.demoFormation.ensup.eu/", "FormationServicePort"), IFormationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IFormationService
     */
    @WebEndpoint(name = "FormationServicePort")
    public IFormationService getFormationServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.demoFormation.ensup.eu/", "FormationServicePort"), IFormationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FORMATIONSERVICESERVICE_EXCEPTION!= null) {
            throw FORMATIONSERVICESERVICE_EXCEPTION;
        }
        return FORMATIONSERVICESERVICE_WSDL_LOCATION;
    }

}
