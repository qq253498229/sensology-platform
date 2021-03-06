package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.feign.TestFeignClient;
import com.client.eurekaclient.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ouyang
 * @date 2019/2/15 11:14
 */
@Service
@Slf4j
public class TestServiceImpl implements TestService {
    private final TestFeignClient testFeignClient;

    @Autowired
    public TestServiceImpl(TestFeignClient testFeignClient) {
        this.testFeignClient = testFeignClient;
    }

    @Override
    public String search(String from) {
        log.info("info 测试日志测试日志测试日志测试日志测试日志测试日志测试日志");
        log.error("error 测试日志测试日志测试日志测试日志测试日志测试日志测试日志");
        log.debug("debug 测试日志测试日志测试日志测试日志测试日志测试日志测试日志");
        return testFeignClient.search(from);
    }

    @Override
    public String upload(MultipartFile file) {
        return testFeignClient.upload(file);
    }
}
