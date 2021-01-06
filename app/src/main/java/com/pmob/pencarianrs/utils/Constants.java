package com.pmob.pencarianrs.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    Map<String, String> places = new HashMap();
    public String[] places_list = new String[]{
            "doctor",
            "hospital",  "mosque"};

    public Constants() {
        addPlaces();
    }

    private void addPlaces() {

        places.put("doctor", "doctor");
        places.put("hospital", "hospital");
        places.put("mosque", "mosque");


    }
}
