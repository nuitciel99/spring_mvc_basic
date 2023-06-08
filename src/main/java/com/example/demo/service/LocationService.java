//package com.example.demo.service;
//
//import com.example.demo.repository.LocationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//
//@Service
//
//@Transactional
//public class LocationService {
//
//    private  final LocationRepository locationRepository;
//    private double latitude;
//    private double longtitude;
//
//    @Autowired
//    public LocationService(LocationRepository locationRepository){
//        this.locationRepository = locationRepository;
//    }
//
//    @Autowired
//    public void updateLocation(double latitude, double longtitude) {
//        this.latitude = latitude;
//        this.longtitude = longtitude;
//    }
//}
