package com.epharmacysoap.client.gen;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicine", propOrder = {
        "name",
        "price",
        "manufacturer",
        "type"
})
public class Medicine {

    @XmlElement(required = true)
    protected String name;
    protected int price;
    @XmlElement(required = true)
    protected String manufacturer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Type type;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int value) {
        this.price = value;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type value) {
        this.type = value;
    }
}
