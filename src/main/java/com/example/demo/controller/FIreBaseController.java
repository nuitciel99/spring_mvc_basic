package com.example.demo.controller;

import com.example.demo.service.FireBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FIreBaseController {

    private final FireBaseService fireBaseService;

    @Autowired
    public FIreBaseController(FireBaseService fireBaseService){
        this.fireBaseService = fireBaseService;
    }

    @GetMapping("/firebase")
    public String fireBaseService(){
        System.out.println("fireBaseMap");

        return "fireBaseMap";
    }
}
