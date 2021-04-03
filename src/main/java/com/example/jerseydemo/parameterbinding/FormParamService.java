package com.example.jerseydemo.parameterbinding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 映射表单
 * @author hanliukui
 * @Date 2021/4/3 15:10
 */
@Path("/formparam")
public class FormParamService {

    /**
     * 映射表单提交参数，要求请求是POST,PUT,并且编码格式必须是x-www-form-urlencoded
     *
     * @param name
     * @param age
     * @return
     */
    @PUT
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee formParam(@FormParam("name") String name, @FormParam("age") int age) {
        return new Employee(1L, name, age);
    }

}

class Employee {
    private Long id;
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
