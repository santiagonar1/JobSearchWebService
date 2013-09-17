/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.telecom.logic;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author santiago
 */
@WebService(serviceName = "JobSearchWebService")
public class JobSearchWebService {

    /**
     * This is a sample web service operation
     */
    
    // Estas etiquetas permiten generar el WSDL de manera automática, es decir, son los  nombres meidantes los cuales el cliente accede
    @WebMethod(operationName = "getJobOffer")
    public String getJobOffer(@WebParam(name = "keyword") String keyword) {
        return JobSearch.getJobOffers(keyword);
    }
}
