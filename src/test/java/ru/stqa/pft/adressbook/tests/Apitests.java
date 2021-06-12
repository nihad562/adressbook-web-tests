package ru.stqa.pft.adressbook.tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Apitests {

    @Test
    public void test123() {
         Response resp = given().
                log().all()
                .when()
                .body(new User("Timur", "leader"))
                .post("https://reqres.in/api/users");
        System.out.println(resp.getBody().asString());
    }

    class User {
        private String name;
        private String job;

        public User(String name, String job) {
            this.name = name;
            this.job = job;
        }
    }

    class UserCreateInfo {
        private int id;
        private String createdAt;
    }

}
