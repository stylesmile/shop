package com.shop.service;


import com.shop.entity.Item;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import java.util.Random;
/**
 * @description: 1
 * @author: Stylesmile
 * @date: 2019/01/04
 */
public class ItemService {

    private static final Log Log = LogFactory.getLog(ItemService.class);

    public Item saveItem(Item item){
        int id = new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
