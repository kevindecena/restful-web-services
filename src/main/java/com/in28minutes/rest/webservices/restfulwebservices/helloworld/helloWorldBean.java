package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class helloWorldBean {
    private final String message;

    public helloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("helloWorldBean{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
