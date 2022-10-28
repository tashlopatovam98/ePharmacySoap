package com.epharmacysoap.client.gen;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name"
})
@XmlRootElement(name = "getMedicineRequest")
public class GetMedicineRequest {

    @XmlElement(required = true)
    protected String name;

    public String getName(){
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }
}
