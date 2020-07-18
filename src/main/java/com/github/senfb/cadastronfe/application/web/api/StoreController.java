package com.github.senfb.cadastronfe.application.web.api;

import com.github.senfb.cadastronfe.application.web.api.request.CreateStoreRequest;
import com.github.senfb.cadastronfe.application.web.api.response.StoreResponse;
import com.github.senfb.cadastronfe.core.entities.Store;
import com.github.senfb.cadastronfe.core.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stores")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping
    public ResponseEntity<StoreResponse> create(@RequestBody CreateStoreRequest createStoreRequest) {
        Store store = storeService.create(createStoreRequest.getName());
        StoreResponse storeResponse = new StoreResponse(store);
        return ResponseEntity.ok(storeResponse);
    }
}
