package com.github.senfb.cadastronfe.application.web.api.request;

public class CreateStoreRequest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CreateStoreRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
