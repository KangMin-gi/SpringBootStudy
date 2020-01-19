package kr.co.schoolsharing.inflearn.user;

import kr.co.schoolsharing.inflearn.InflearnApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.security.RunAs;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@SpringBootTest
//@WebMvcTest

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        this.mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));
    }

    @Test
    public void createUserJson()  throws Exception{
        String userJson = "{\"username\":\"mingi\", \"password\":\"1313\"}";
        this.mockMvc.perform(
                post("/user/create")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(userJson))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.password", is(equalTo("1313"))))
                    .andExpect(jsonPath("$.username", is(equalTo("mingi"))));



    }

    @Test
    public void createUserXML()  throws Exception{
        String userJson = "{\"username\":\"mingi\", \"password\":\"1313\"}";
        this.mockMvc.perform(
                post("/user/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_XML)
                        .content(userJson))
                .andExpect(status().isOk())
                .andExpect(xpath("/User/password").string("1313"))
                    .andExpect(xpath("/User/username").string("mingi"));



    }
}
