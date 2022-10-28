package com.epharmacysoap;

import com.epharmacysoap.client.gen.Medicine;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class MedicineRepository {

    private static final Map<String, Medicine> medicine = new HashMap<>();

    @PostConstruct
    public void initData(){

    }

    public Medicine findMedicine(String name) {
        return medicine.get(name);
    }
}
