package com.epharmacysoap.client;

import com.epharmacysoap.client.gen.GetMedicineRequest;
import com.epharmacysoap.client.gen.GetMedicineResponse;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.slf4j.Logger;

public class MedicineClient extends WebServiceGatewaySupport {

    public static final Logger logger = LoggerFactory.getLogger(MedicineClient.class);

    public GetMedicineResponse getMedicine(String medicine){

        GetMedicineRequest request = new GetMedicineRequest();
        request.setName(medicine);

        logger.info("Requesting information for " + medicine);

        GetMedicineResponse response = (GetMedicineResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        return response;
    }
}
