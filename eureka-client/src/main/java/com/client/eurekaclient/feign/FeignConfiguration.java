package com.client.eurekaclient.feign;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;

/**
 * @author ouyang
 * @date 2019/2/14 17:20
 */
public class FeignConfiguration {
    /**
     * 支持文件上传
     * @return
     */
    @Bean
    public Encoder feignFormEncoder(){
        return new SpringFormEncoder();
    }
}
