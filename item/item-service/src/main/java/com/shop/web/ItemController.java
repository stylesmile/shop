package com.shop.web;

import com.shop.enums.ExceptionEnums;
import com.shop.entity.Item;
import com.shop.exception.ShopException;
import com.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: item
 * @author: Stylesmile
 * @date: 2019/01/05
 */
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/saveItem")
    @ResponseBody
    public ResponseEntity<Item> saveItem(Item item) {
        if (item.getPrice() == null) {
            throw new ShopException(ExceptionEnums.PRICE_CONNOT_BE_NULL);
            //return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        item = itemService.saveItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }
}
