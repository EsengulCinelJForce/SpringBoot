package com.esengulcinel.controller;


import com.esengulcinel.dto.TeacherDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller //bunun bir controller olabilmesi için
@Log4j2
public class FormController {

    //FORM
    //getMethod
    //http://localhost:8080/form
    @GetMapping("/form")
    public String getForm(Model model){
        model.addAttribute("cv_teacher",new TeacherDto());
        return "form_post/formvalidation";
    }

    //http://localhost:8080/form
    @PostMapping("/form")     //karşı tarafta neler gelecek bi onları alalım
    public String postForm(@Valid @ModelAttribute("cv_teacher")TeacherDto teacherDto , BindingResult bindingResult){ //binding resultta dönüşte ne var ne yok bakmak için

        if (bindingResult.hasErrors()){
            log.error("hata var aloooo ....!!!");
            System.err.println("hataaaa");
            return "form_post/formvalidation";
        }
        log.info("success !" +teacherDto);
        //db ye kayıt etme alanı
        //dosyaya yazma


        return "form_post/success";
    }
}
