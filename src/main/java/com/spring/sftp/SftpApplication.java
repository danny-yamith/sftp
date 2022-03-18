package com.spring.sftp;

import com.spring.sftp.service.HandleFileService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SftpApplication{

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext =SpringApplication.run(SftpApplication.class, args);
        HandleFileService handleFileService =
                applicationContext.getBean(HandleFileService.class);
        //subir un archivo
        //handleFileService.upload();
        //bajar un archivo
        //handleFileService.download();
        //borrar un archivo
        handleFileService.delete();
    }


}
