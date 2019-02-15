package com.client.eurekaclient.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ouyang
 * @date 2019/2/13 16:43
 */
@Getter
@Setter
@Component
public class ConfigProperties {
    @Value("${from}")
    private String from;
}
