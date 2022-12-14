package com.esengulcinel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller                                  //bir birimin controller olabilmesi için bu annotaion kesin olmalı
public class ThymeLeafController {

    //http://localhost:8080

    //opsiyonel yapı root {}
    @GetMapping({"/", "index"})
    public String index() {
        return "index";

    }


    //http://localhost:8080/thymeleal1
    @GetMapping("/thymeleal1")
//   @ResponseBody  // herhangi bir sayfaya yönlendirince direkt gösteriyor ne döndürüyorsan
    public String getThymeLeaf() {
        //    return "sA aS";  //bu varken responsebody olmalı ,, alttaki için kapat
        return "thymeleaf1";   //buraya templates alıntaki html'in adını yapıştırınca üsttekine gerek kalmadan
        //direkt o sayfa içindekini okuyabiliriz. :)
    }


    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeLeaf2Model(Model model) {
        model.addAttribute("key_model", "modelden gelen");
        return "thymeleaf2";
    }


    //http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3/{id}")
    public String getThymeLeaf3Model(Model model, @PathVariable(name = "id") Long id) {
        model.addAttribute("key_model", "id : " + id);
        return "thymeleaf3";
    }


    //RequestParam
    //http://localhost:8080/thymeleaf4?id=4
                                        //id, name vs ne varsa burada sıra önemsiz gönderebiliriz.
                                        //false olursa yukarıdaki id kısmını boş şekilde de gönderebiliriz. id= gibi ama
                                        //required =true olursa kesinlikle bir şey gitmeli ve
                                        //ekranda istediğin şekilde farklı değerlerde gönderebilirsin
    @GetMapping("/thymeleaf4")
    public String getThymeLeaf4Model(Model model, @RequestParam(name = "id",required = false) Long id) {
        model.addAttribute("key_model", "id : " + id);
        return "thymeleaf4";
    }



}
