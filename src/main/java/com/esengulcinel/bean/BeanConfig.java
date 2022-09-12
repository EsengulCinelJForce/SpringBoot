package com.esengulcinel.bean;

import com.esengulcinel.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration  //conf birimi olduğunu göstermiş olduk
public class BeanConfig {


    //burada yazdığımız dto'yu bean yapısı olarak gösterebilmemiz için
    //annotaion lazım sonra gittik yukarda configuration yapısı olarak verdik
    @Bean(initMethod = "initialBeanMethod",destroyMethod = "finishBenaMethod")
    @Scope("singleton")  //proje ile başlar proje ile ölür  REQUEST SESSION
    public BeanDto beanDto(){
        return BeanDto.builder().
                id(0L).   //burada L yapısı şeklinde gösterdik çünkü id'yi Long diye verdik.
                beanName("beanAdi").
                beanData("bean data").
                build();
    }
}
