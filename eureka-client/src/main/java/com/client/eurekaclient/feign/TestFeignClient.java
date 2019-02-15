package com.client.eurekaclient.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ouyang
 * @date 2019/2/14 17:26
 *  FeignClient name指向serviceId
 */
@FeignClient(name = "eureka-client-one" ,configuration = FeignConfiguration.class,fallback = TestFeignClientHystrix.class)
public interface TestFeignClient {
    @GetMapping("/test-feign")
    String search(@RequestParam("from") String from);

    @PostMapping(value = "/test-upload",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String upload(@RequestPart("file")MultipartFile file);
}
