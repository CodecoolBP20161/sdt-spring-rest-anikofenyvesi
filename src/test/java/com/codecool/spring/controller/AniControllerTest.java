package com.codecool.spring.controller;

import com.codecool.spring.model.Model;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import springfox.documentation.spring.web.json.Json;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by ani on 2017-03-11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class AniControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void exampleTest() throws JSONException {
        String response = this.restTemplate.getForObject("/ani/json", String.class);
        JSONObject responseJson  = new JSONObject(response);
        assertEquals("hello", responseJson.getString("value"));
    }

}
