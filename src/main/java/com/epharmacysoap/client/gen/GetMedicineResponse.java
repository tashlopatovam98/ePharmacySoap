package com.epharmacysoap.client.gen;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "medicine"
})
@XmlRootElement(name = "getMedicineResponse")
public class GetMedicineResponse {

    @XmlElement(required = true)
    protected Medicine medicine;

    public Medicine getMedicine(){
        return medicine;
    }

    public void setMedicine(Medicine value) {
        this.medicine = value;
    }
}
