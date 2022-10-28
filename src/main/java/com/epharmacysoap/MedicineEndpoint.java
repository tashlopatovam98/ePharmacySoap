package com.epharmacysoap;

import com.epharmacysoap.client.gen.GetMedicineRequest;
import com.epharmacysoap.client.gen.GetMedicineResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

public class MedicineEndpoint {

    public static final String NAMESPACE_URI = "D:\\Исломхон\\Islomkhon\\4th Course\\ISD-3_Java_EE_Development of web services\\SOAP_Development\\ePharmacySoap\\src\\main\\java\\com\\epharmacysoap\\client\\gen";

    private MedicineRepository medicineRepository;

    @Autowired
    public MedicineEndpoint(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMedicineRequest")
    @ResponsePayload
    public GetMedicineResponse getMedicine(@RequestPayload GetMedicineRequest request) {
        GetMedicineResponse response = new GetMedicineResponse();
        response.setMedicine(medicineRepository.findMedicine(request.getName()));

        return response;
    }
}
