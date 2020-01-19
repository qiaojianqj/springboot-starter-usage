package com.qiaojian.Attr;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 */
@ConfigurationProperties(prefix = "qiaojian")
@Data
public class AttrProperties {
    int code;
    String data;
    String message;
}
