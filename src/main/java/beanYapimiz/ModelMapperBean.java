package beanYapimiz;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //bean yapımız için
public class ModelMapperBean {
    @Bean
    public ModelMapper modelMapperBean() {


        return new ModelMapper();
    }
}
