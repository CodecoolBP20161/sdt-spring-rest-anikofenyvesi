package com.codecool.spring.controller;

import com.codecool.spring.model.Model;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ani on 2017-03-11.
 */
@RestController
public class AniController {

    @RequestMapping(value = "/ani/json", produces = MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.GET)
    public Object helloJson(){
        Map<String, String> map= new HashMap<>();
        map.put("value", "hello");
        return map;
    }

    @RequestMapping(value = "/ani/json/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object helloJson(@PathVariable String name){
        Map<String, String> map= new HashMap<>();
        map.put("value", "hello " + name);
        return map;
    }

    @RequestMapping(value = "/ani/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Object helloXml(){
        Map<String, String> map= new HashMap<>();
        map.put("value", "hello");
        return map;
    }

    @RequestMapping(value = "/ani/xml/{name}", produces = MediaType.APPLICATION_XML_VALUE)
    public Object helloXml(@PathVariable String name){
        Map<String, String> map= new HashMap<>();
        map.put("value", "hello " + name);
        return map;
    }






}
