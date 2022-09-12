package com.esengulcinel.controller;

import com.esengulcinel.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

//Bunun controller yapısı olmasını sağlamak istiyorsak
@Controller
public class BeanController {

    //daha önce yazdığımız beanconfig yapısını buraya inject edicem
    //Ama spring frameworkte inject yapısı var. Spring boot'ta Autowired var.
    @Autowired     //bunu her çağırdıgın için yazman lazım
    BeanConfig beanConfig;

    // http://localhost:8080/bean/beanDto   //ve burdakini http olarak vermemizdeki amaç ctrl ile open browser yapıyor
    @GetMapping("/bean/beanDto")         //url yapısı
    @ResponseBody                          //herhangi bir xhtml  gibi yapılarda değilde diğer ekranda göster
    public String getBeanDto(){
        return  beanConfig.beanDto()+""; // + " " string e cast etmiş olduk bununla
    }

//    @Autowired
//    Logger LOG;
//
//    @PostConstruct
//    public void init(){
//        LOG.info("log info cagırdık !!!! ");
//    }

}
