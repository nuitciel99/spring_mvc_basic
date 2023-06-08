package com.example.demo.service;

import com.example.demo.repository.GpsMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service

@Transactional
public class GpsMapService {

    private final GpsMapRepository gpsMapRepository;

    @Autowired
    public GpsMapService(GpsMapRepository gpsMapRepository){
        this.gpsMapRepository = gpsMapRepository;
    }
}
