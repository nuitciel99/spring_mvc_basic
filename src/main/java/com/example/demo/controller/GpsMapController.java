package com.example.demo.controller;

import com.example.demo.service.GpsMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GpsMapController {
    private final GpsMapService gpsMapService;

    @Autowired
    public GpsMapController(GpsMapService gpsMapService, GpsMapService gpsMapService1){
        this.gpsMapService = gpsMapService1;
    }

    @GetMapping("/GpsMap")
    public String gpsMapService(){
        System.out.println("Gps 위치 맵");

        return "GpsMap";
    }
}
