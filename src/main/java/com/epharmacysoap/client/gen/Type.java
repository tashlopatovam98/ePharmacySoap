package com.epharmacysoap.client.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "type")
@XmlEnum
public enum Type {

    liquid,
    solid,
    soft,
    aerosol;

    public String value(){
        return name();
    }

    public static Type fromValue(String v){
        return valueOf(v);
    }
}
