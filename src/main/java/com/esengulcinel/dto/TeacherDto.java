package com.esengulcinel.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {


    private Long teacherId;

    @NotEmpty(message = "ad soyad alanı boş gecemezsiniz")
    @Size(min = 1,max = 255)
    private  String teacherNameSurname;

    @NotEmpty(message = "email alanı boş gecemezsiniz")
    @Email(message = "uygun formatta email girmediniz ")
    private String teacherEmail;

    @NotEmpty(message = "password alanı boş gecemezsiniz")
    @Min(value = 18,message = "min 18 yasında olmalı ")
    private String teacherPassword;


}
