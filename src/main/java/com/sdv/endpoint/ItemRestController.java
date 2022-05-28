package com.sdv.endpoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sdv.model.Item;

@RestController
@CrossOrigin(origins = "*")
public class ItemRestController {

	@RequestMapping(
            value = "/api/test/item",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Item> getTestItem() {

        Item result = Item.newTestItem();

        return new ResponseEntity<Item>(result,
                HttpStatus.OK);
    }
	
}
