
package fr.cap.wikimnv.logmanager;

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
@WebServiceClient(name = "loggerService", targetNamespace = "http://logManager.wikimnv.cap.fr/", wsdlLocation = "http://172.20.100.129:8080/logdeamon/webservices/logger?wsdl")
public class LoggerService_Service
    extends Service
{

    private final static URL LOGGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException LOGGERSERVICE_EXCEPTION;
    private final static QName LOGGERSERVICE_QNAME = new QName("http://logManager.wikimnv.cap.fr/", "loggerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.20.100.129:8080/logdeamon/webservices/logger?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOGGERSERVICE_WSDL_LOCATION = url;
        LOGGERSERVICE_EXCEPTION = e;
    }

    public LoggerService_Service() {
        super(__getWsdlLocation(), LOGGERSERVICE_QNAME);
    }

    public LoggerService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOGGERSERVICE_QNAME, features);
    }

    public LoggerService_Service(URL wsdlLocation) {
        super(wsdlLocation, LOGGERSERVICE_QNAME);
    }

    public LoggerService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOGGERSERVICE_QNAME, features);
    }

    public LoggerService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoggerService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LoggerService
     */
    @WebEndpoint(name = "loggerServicePort")
    public LoggerService getLoggerServicePort() {
        return super.getPort(new QName("http://logManager.wikimnv.cap.fr/", "loggerServicePort"), LoggerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoggerService
     */
    @WebEndpoint(name = "loggerServicePort")
    public LoggerService getLoggerServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://logManager.wikimnv.cap.fr/", "loggerServicePort"), LoggerService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOGGERSERVICE_EXCEPTION!= null) {
            throw LOGGERSERVICE_EXCEPTION;
        }
        return LOGGERSERVICE_WSDL_LOCATION;
    }

}
