package org.lanqiao.controller;

import org.lanqiao.entity.Cart;
import org.lanqiao.service.GetCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetCartController {
    @Autowired
    GetCartService getCartService;
    @RequestMapping("/Cart/GetCartInformation")
    public List<Cart> getCartInformation(int userId){return getCartService.GetCartInformation(userId);}
}
