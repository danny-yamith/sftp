package com.spring.sftp.service;

import com.spring.sftp.service.impl.FileSystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class HandleFileService {
    @Autowired
    private FileSystemServiceImpl fileSystemServiceImpl;

    public void upload() throws Exception {
        //Con esta linea podria crear un archivo en blanco para la prueba
        //Path tempFile = Files.createTempFile("UPLOAD_TEST", ".csv");
        fileSystemServiceImpl.uploadFile("/exercises/sftp-config.rtf"
                ,new File("/Users/danpascu1/documents/sftp-config.rtf"));
    }
    public void download() throws Exception {
        fileSystemServiceImpl.downloadFile("/upload/exercises/foto1.png");
    }

    public void delete() throws Exception {
        fileSystemServiceImpl.deleteFile("/upload/exercises/foto1.png");
    }
}
