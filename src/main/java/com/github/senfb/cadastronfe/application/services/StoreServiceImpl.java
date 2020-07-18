package com.github.senfb.cadastronfe.application.services;

import com.github.senfb.cadastronfe.core.entities.Store;
import com.github.senfb.cadastronfe.core.service.StoreService;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

    @Override
    public Store create(String name) {
        Store store = new Store();
        store.setId(1L);
        store.setName(name);
        return store;
    }
}
