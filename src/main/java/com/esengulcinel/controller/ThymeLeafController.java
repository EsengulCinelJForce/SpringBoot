package com.esengulcinel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller                                  //bir birimin controller olabilmesi için bu annotaion kesin olmalı
public class ThymeLeafController {

    //http://localhost:8080/thymeleal1
    @GetMapping("/thymeleal1")
//    @ResponseBody  // herhangi bir sayfaya yönlendirince direkt gösteriyor ne döndürüyorsan
    public String getThymeLeaf() {
    //    return "sA aS";  //bu varken responsebody olmalı ,, alttaki için kapat
        return "thymeleaf1";   //buraya templates alıntaki html'in adını yapıştırınca üsttekine gerek kalmadan
                                //direkt o sayfa içindekini okuyabiliriz. :)

    }
}
