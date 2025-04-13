package com.example.hellospringboot344.response;

//https://stackoverflow.com/questions/35378352/how-to-use-lombok-data-annotation-in-a-spring-boot-application
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Data
public class HelloResponse implements Cloneable {

    public HelloResponse(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message.toString();
    }

    @JsonProperty("Message")
    private String message;
}
