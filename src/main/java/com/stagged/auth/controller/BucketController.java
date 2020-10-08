package com.stagged.auth.controller;

import com.stagged.auth.services.S3Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/storage/")
public class BucketController {


    private S3Operation s3Operation;

    @Autowired
    BucketController(S3Operation s3Operation) {
        this.s3Operation = s3Operation;
    }

    @PostMapping("/uploadFile")
    public String uploadFile (@RequestPart(value = "file") MultipartFile file) {
        return this.s3Operation.uploadFile(file);
    }

}
