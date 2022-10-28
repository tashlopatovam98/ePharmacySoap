package com.epharmacysoap.client.gen;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory(){

    }

    public GetMedicineRequest createGetMedicineRequest() {
        return new GetMedicineRequest();
    }

    public GetMedicineResponse createGetMedicineResponse() {
        return new GetMedicineResponse();
    }

    public Medicine createMedicine() {
        return new Medicine();
    }
}
