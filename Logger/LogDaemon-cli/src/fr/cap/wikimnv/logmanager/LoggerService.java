
package fr.cap.wikimnv.logmanager;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "loggerService", targetNamespace = "http://logManager.wikimnv.cap.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LoggerService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "logger", targetNamespace = "http://logManager.wikimnv.cap.fr/", className = "fr.cap.wikimnv.logmanager.Logger")
    @ResponseWrapper(localName = "loggerResponse", targetNamespace = "http://logManager.wikimnv.cap.fr/", className = "fr.cap.wikimnv.logmanager.LoggerResponse")
    public void logger(
        @WebParam(name = "arg0", targetNamespace = "")
        LogLevel arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws Exception_Exception
    ;

}
