package com.example.jerseydemo;

import com.example.jerseydemo.parameterbinding.FormParamService;
import com.example.jerseydemo.parameterbinding.PathParamService;
import com.example.jerseydemo.parameterbinding.QueryParamService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.jersey.ResourceConfigCustomizer;

/**
 * @author hanliukui
 * @Date 2020/11/27 16:31
 */
public class MyResourceConfigCustomizer implements ResourceConfigCustomizer {

    @Override
    public void customize(ResourceConfig config) {
//        config.register(SpringbootResource.class);
        config.register(PathParamService.class);
        config.register(QueryParamService.class);
        config.register(FormParamService.class);
    }
}
