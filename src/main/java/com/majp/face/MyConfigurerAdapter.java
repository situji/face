package com.majp.face;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author pc
 * @since 2018/1/18.
 */
@Configuration
@EnableTransactionManagement
public class MyConfigurerAdapter extends WebMvcConfigurerAdapter {

    @Value("face.apiKey")
    private String apiKey;
    @Value("face.apiSecret")
    private String apiSecret;
    @Value("face.url")
    private String url;

    @Bean
    public FaceClient faceClient() {
        return new DefayltFaceClient(apiKey, apiSecret, url);
    }

}
