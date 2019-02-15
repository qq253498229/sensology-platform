package com.client.eurekaclient.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author ouyang
 * @date 2019/2/15 11:13
 */
public interface TestService {
    String search(String from);

    String upload(MultipartFile file);
}
