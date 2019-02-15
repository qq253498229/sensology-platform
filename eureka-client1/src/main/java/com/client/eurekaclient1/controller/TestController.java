package com.client.eurekaclient1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ouyang
 * @date 2019/2/14 17:05
 */
@RestController
public class TestController {
    @RequestMapping("/test-feign")
    public String testFeign(String from){
        return "from Feign "+ from;
    }

    @PostMapping("/test-upload")
    public String testUpload(@RequestPart("file")MultipartFile file){
        return file.getName();
    }
}
