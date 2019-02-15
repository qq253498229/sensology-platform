package com.client.eurekaclient.controller;

import com.client.eurekaclient.configuration.ConfigProperties;
import com.client.eurekaclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



/**
 * @author ouyang
 * @date 2019/2/13 16:18
 */
@RestController
public class TestController {

    @Autowired
    private ConfigProperties configProperties;

    @Autowired
    private TestService testService;

    @RequestMapping("/get-config")
    public String getConfig(){
        return configProperties.getFrom();
    }

    @RequestMapping("/zuul-test")
    public String testZuul(){
        return "from zuul";
    }
    @RequestMapping("/feign-test")
    public String testFeign(){
        return testService.search("client");
    }
    @RequestMapping("/feign-upload")
    @ResponseBody
    public String testUploadFeign(@RequestPart(value = "file") MultipartFile file) {
        return testService.upload(file);
    }

}
