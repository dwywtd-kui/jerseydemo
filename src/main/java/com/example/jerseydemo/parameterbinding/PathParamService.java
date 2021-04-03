package com.example.jerseydemo.parameterbinding;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/pathparam")  // 基路径
@Produces(value = MediaType.APPLICATION_JSON)
public class PathParamService {

    /**
     * 映射 url中的路径参数
     * @param id
     * @return
     */
    @GET
    @Path("/test1/{id}")
    public String testPathParam(@PathParam("id") String id){
        return id;
    }

    /**
     * 映射多个路径参数
     * @param key
     * @param value
     * @return
     */
    @GET
    @Path("/test2/{key}/{value}")
    public String testPathParam2(@PathParam("key") String key, @PathParam("value") String value){
        return key+":"+value;
    }

}
