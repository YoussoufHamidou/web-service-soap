
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://example.org/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://example.org/", className = "proxy.GetCompteResponse")
    @Action(input = "http://example.org/BanqueService/getCompteRequest", output = "http://example.org/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listCompte", targetNamespace = "http://example.org/", className = "proxy.ListCompte")
    @ResponseWrapper(localName = "listCompteResponse", targetNamespace = "http://example.org/", className = "proxy.ListCompteResponse")
    @Action(input = "http://example.org/BanqueService/listCompteRequest", output = "http://example.org/BanqueService/listCompteResponse")
    public List<Compte> listCompte();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroToDH")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroToDH", targetNamespace = "http://example.org/", className = "proxy.ConversionEuroToDH")
    @ResponseWrapper(localName = "ConversionEuroToDHResponse", targetNamespace = "http://example.org/", className = "proxy.ConversionEuroToDHResponse")
    @Action(input = "http://example.org/BanqueService/ConversionEuroToDHRequest", output = "http://example.org/BanqueService/ConversionEuroToDHResponse")
    public double conversionEuroToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}
