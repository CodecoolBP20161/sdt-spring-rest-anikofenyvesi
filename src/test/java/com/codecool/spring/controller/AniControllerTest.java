package com.codecool.spring.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

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
