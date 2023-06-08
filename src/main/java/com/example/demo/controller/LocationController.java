//package com.example.demo.controller;
//
//import com.example.demo.service.LocationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//
//@Controller
//public class LocationController {
//    private final LocationService locationService;
//
//    @Autowired
//    public LocationController(LocationService locationService, LocationService locationService1){
//        this.locationService = locationService1;
//    }
//
//    @GetMapping("/Location")
//    public String location(){
//        System.out.println(("키링 위치"));
//
//        return "Location";
//    }
//
//    @PostMapping("/location")
//    public String location(@RequestParam(value = "latitude") double latitude, @RequestParam("longtitude") double longtitude){
//        locationService.updateLocation(latitude, longtitude);
//        return "location";
//    }
//}
