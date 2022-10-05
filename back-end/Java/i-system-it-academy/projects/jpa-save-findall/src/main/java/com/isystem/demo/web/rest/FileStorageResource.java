package com.isystem.demo.web.rest;
import com.isystem.demo.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/file")
public class FileStorageResource {
    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping
    public ResponseEntity<?> upload(@RequestParam("file")MultipartFile requestMultipartFile){
        fileStorageService.save(requestMultipartFile);
        return new ResponseEntity<>(requestMultipartFile.getOriginalFilename() + " file saved.", HttpStatus.OK);
    }
}
