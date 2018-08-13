package com.nar.mockitodemo.controller;

import com.nar.mockitodemo.service.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MContorller {

    @Autowired
    private MService mService;

    @RequestMapping(value = "/getNameById", method = RequestMethod.GET)
    public String getNameById (@RequestParam("id") Integer id) {

        String name = mService.getNameByIdService(id);
        System.out.println("Name is "+name);

        return name;

    }

    @RequestMapping(value = "/getIdByName", method = RequestMethod.GET)
    public Integer getIdByName (@RequestParam("name") String name) {


        System.out.println("Inside getNameById");

        return 20;

    }
}
