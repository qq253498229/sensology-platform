package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.feign.TestFeignClient;
import com.client.eurekaclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ouyang
 * @date 2019/2/15 11:14
 */
@Service
public class TestServiceImpl implements TestService {
    private final TestFeignClient testFeignClient;

    @Autowired
    public TestServiceImpl(TestFeignClient testFeignClient) {
        this.testFeignClient = testFeignClient;
    }

    @Override
    public String search(String from) {
        return testFeignClient.search(from);
    }

    @Override
    public String upload(MultipartFile file) {
        return testFeignClient.upload(file);
    }
}
