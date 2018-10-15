
package com.microsoft.bingads.v11.customermanagement;

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
@WebServiceClient(name = "CustomerManagementService", targetNamespace = "https://bingads.microsoft.com/Customer/v11", wsdlLocation = "https://clientcenter.api.bingads.microsoft.com/Api/CustomerManagement/v11/CustomerManagementService.svc?wsdl")
public class CustomerManagementService
    extends Service
{

    private final static URL CUSTOMERMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERMANAGEMENTSERVICE_EXCEPTION;
    private final static QName CUSTOMERMANAGEMENTSERVICE_QNAME = new QName("https://bingads.microsoft.com/Customer/v11", "CustomerManagementService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://clientcenter.api.bingads.microsoft.com/Api/CustomerManagement/v11/CustomerManagementService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERMANAGEMENTSERVICE_WSDL_LOCATION = url;
        CUSTOMERMANAGEMENTSERVICE_EXCEPTION = e;
    }

    public CustomerManagementService() {
        super(__getWsdlLocation(), CUSTOMERMANAGEMENTSERVICE_QNAME);
    }

    public CustomerManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ICustomerManagementService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICustomerManagementService")
    public ICustomerManagementService getBasicHttpBindingICustomerManagementService() {
        return super.getPort(new QName("https://bingads.microsoft.com/Customer/v11", "BasicHttpBinding_ICustomerManagementService"), ICustomerManagementService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICustomerManagementService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICustomerManagementService")
    public ICustomerManagementService getBasicHttpBindingICustomerManagementService(WebServiceFeature... features) {
        return super.getPort(new QName("https://bingads.microsoft.com/Customer/v11", "BasicHttpBinding_ICustomerManagementService"), ICustomerManagementService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERMANAGEMENTSERVICE_EXCEPTION!= null) {
            throw CUSTOMERMANAGEMENTSERVICE_EXCEPTION;
        }
        return CUSTOMERMANAGEMENTSERVICE_WSDL_LOCATION;
    }

}
