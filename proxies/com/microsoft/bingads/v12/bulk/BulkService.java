
package com.microsoft.bingads.v12.bulk;

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
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BulkService", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v12", wsdlLocation = "https://bulk.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v12/BulkService.svc?wsdl")
public class BulkService
    extends Service
{

    private final static URL BULKSERVICE_WSDL_LOCATION;
    private final static WebServiceException BULKSERVICE_EXCEPTION;
    private final static QName BULKSERVICE_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BulkService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://bulk.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v12/BulkService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BULKSERVICE_WSDL_LOCATION = url;
        BULKSERVICE_EXCEPTION = e;
    }

    public BulkService() {
        super(__getWsdlLocation(), BULKSERVICE_QNAME);
    }

    public BulkService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns IBulkService
     */
    @WebEndpoint(name = "BasicHttpBinding_IBulkService")
    public IBulkService getBasicHttpBindingIBulkService() {
        return super.getPort(new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BasicHttpBinding_IBulkService"), IBulkService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IBulkService
     */
    @WebEndpoint(name = "BasicHttpBinding_IBulkService")
    public IBulkService getBasicHttpBindingIBulkService(WebServiceFeature... features) {
        return super.getPort(new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BasicHttpBinding_IBulkService"), IBulkService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BULKSERVICE_EXCEPTION!= null) {
            throw BULKSERVICE_EXCEPTION;
        }
        return BULKSERVICE_WSDL_LOCATION;
    }

}
