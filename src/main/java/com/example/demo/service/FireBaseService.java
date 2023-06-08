package com.example.demo.service;

import com.example.demo.repository.FireBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service

@Transactional
public class FireBaseService {

    private final FireBaseRepository fireBaseRepository;

    @Autowired
    public  FireBaseService(FireBaseRepository fireBaseRepository){
        this.fireBaseRepository = fireBaseRepository;
    }
}
