package com.qiaojian.Attr;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 */
@Configuration
@EnableConfigurationProperties({AttrProperties.class})
@Import ( AttrServiceImpl.class )
public class AttrServiceAutoConfiguration {
}
