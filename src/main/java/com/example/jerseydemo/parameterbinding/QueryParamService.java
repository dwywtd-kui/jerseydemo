package com.example.jerseydemo.parameterbinding;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * @author hanliukui
 * @Date 2021/4/3 14:43
 */
@Path("/queryparam")
public class QueryParamService {

    /**
     * 映射 普通参数传参
     * @param param1
     * @param param2
     * @return
     */
    @GET
    @Path("/test1")
    public String queryParam1(@QueryParam("aa") String param1,@QueryParam("bb") String param2 ){
        return "param1:"+param1+",param2:"+param2;
    }
}
