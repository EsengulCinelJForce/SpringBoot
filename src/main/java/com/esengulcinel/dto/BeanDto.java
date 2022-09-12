package com.esengulcinel.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder


public class BeanDto {
    //verileri bir yerden bir yere transfer ederken orta katman olarak kullanılabilir.

    private Long id;
    private String beanName;
    private String beanData;

    //başlangıc

    public void initialBeanMethod(){
        log.info("bean baslamadan once başlar");
        System.out.println("bean baslamadan önceki method bu");

    }


    //bitis
    public void finishBenaMethod(){
        log.info("bean baslamadan sonra başlar");
        System.err.println("bean bittikten sonraki  method bu");

    }



}
