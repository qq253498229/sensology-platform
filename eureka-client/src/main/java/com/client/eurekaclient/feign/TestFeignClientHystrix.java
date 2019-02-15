package com.client.eurekaclient.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ouyang
 * @date 2019/2/15 11:00
 * 需要注入到IOC容器中
 */
@Component
public class TestFeignClientHystrix implements TestFeignClient{
    @Override
    public String search(String from) {
        return "search error";
    }
    @Override
    public String upload(MultipartFile file) {
        return "upload error";
    }
}
