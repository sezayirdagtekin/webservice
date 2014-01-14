
package net.webservicex;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GeoIPService", targetNamespace = "http://www.webservicex.net/", wsdlLocation = "http://www.webservicex.net/geoipservice.asmx?WSDL")
public class GeoIPService
    extends Service
{

    private final static URL GEOIPSERVÝCE_WSDL_LOCATION;
    private final static WebServiceException GEOIPSERVÝCE_EXCEPTION;
    private final static QName GEOIPSERVÝCE_QNAME = new QName("http://www.webservicex.net/", "GeoIPService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/geoipservice.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GEOIPSERVÝCE_WSDL_LOCATION = url;
        GEOIPSERVÝCE_EXCEPTION = e;
    }

    public GeoIPService() {
        super(__getWsdlLocation(), GEOIPSERVÝCE_QNAME);
    }

    public GeoIPService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GEOIPSERVÝCE_QNAME, features);
    }

    public GeoIPService(URL wsdlLocation) {
        super(wsdlLocation, GEOIPSERVÝCE_QNAME);
    }

    public GeoIPService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GEOIPSERVÝCE_QNAME, features);
    }

    public GeoIPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GeoIPService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GeoIPServiceSoap
     */
    @WebEndpoint(name = "GeoIPServiceSoap")
    public GeoIPServiceSoap getGeoIPServiceSoap() {
        return super.getPort(new QName("http://www.webservicex.net/", "GeoIPServiceSoap"), GeoIPServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GeoIPServiceSoap
     */
    @WebEndpoint(name = "GeoIPServiceSoap")
    public GeoIPServiceSoap getGeoIPServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net/", "GeoIPServiceSoap"), GeoIPServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GEOIPSERVÝCE_EXCEPTION!= null) {
            throw GEOIPSERVÝCE_EXCEPTION;
        }
        return GEOIPSERVÝCE_WSDL_LOCATION;
    }

}
