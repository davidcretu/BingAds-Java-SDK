
package com.microsoft.bingads.v12.campaignmanagement;

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
@WebServiceClient(name = "CampaignManagementService", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v12", wsdlLocation = "https://campaign.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v12/CampaignManagementService.svc?wsdl")
public class CampaignManagementService
    extends Service
{

    private final static URL CAMPAIGNMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException CAMPAIGNMANAGEMENTSERVICE_EXCEPTION;
    private final static QName CAMPAIGNMANAGEMENTSERVICE_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CampaignManagementService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://campaign.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v12/CampaignManagementService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAMPAIGNMANAGEMENTSERVICE_WSDL_LOCATION = url;
        CAMPAIGNMANAGEMENTSERVICE_EXCEPTION = e;
    }

    public CampaignManagementService() {
        super(__getWsdlLocation(), CAMPAIGNMANAGEMENTSERVICE_QNAME);
    }

    public CampaignManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ICampaignManagementService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICampaignManagementService")
    public ICampaignManagementService getBasicHttpBindingICampaignManagementService() {
        return super.getPort(new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BasicHttpBinding_ICampaignManagementService"), ICampaignManagementService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICampaignManagementService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICampaignManagementService")
    public ICampaignManagementService getBasicHttpBindingICampaignManagementService(WebServiceFeature... features) {
        return super.getPort(new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BasicHttpBinding_ICampaignManagementService"), ICampaignManagementService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAMPAIGNMANAGEMENTSERVICE_EXCEPTION!= null) {
            throw CAMPAIGNMANAGEMENTSERVICE_EXCEPTION;
        }
        return CAMPAIGNMANAGEMENTSERVICE_WSDL_LOCATION;
    }

}
