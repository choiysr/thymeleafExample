package org.zerock.day7_thymeleaf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nz.net.ultraq.thymeleaf.LayoutDialect;

/**
 * LayoutConfig
 */

 /* java코드로 configuration 만들어보기 */
 @Configuration
public class LayoutConfig {

    // layoustDialect bean 설정
    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
    
}