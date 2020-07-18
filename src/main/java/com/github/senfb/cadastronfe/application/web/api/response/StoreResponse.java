package com.github.senfb.cadastronfe.application.web.api.response;

import com.github.senfb.cadastronfe.core.entities.Store;

public class StoreResponse {

    private Long id;
    private String name;

    public StoreResponse() {
    }

    public StoreResponse(Store store) {
        id = store.getId();
        name = store.getName();
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

    @Override
    public String toString() {
        return "StoreResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
