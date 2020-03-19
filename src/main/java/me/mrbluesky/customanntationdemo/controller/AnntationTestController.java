package me.mrbluesky.customanntationdemo.controller;

import lombok.NoArgsConstructor;
import me.mrbluesky.customanntationdemo.service.AnnotationTestService;
import me.mrbluesky.customanntationdemo.vo.AnnotationResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
@NoArgsConstructor
public class AnntationTestController {

    private AnnotationTestService annotationTestService;

    @Autowired
    public AnntationTestController(AnnotationTestService annotationTestService) {
        this.annotationTestService = annotationTestService;
    }

    @GetMapping(path="/")
    public ResponseEntity<AnnotationResponseEntity> getResponseEntity() {
        ResponseEntity<AnnotationResponseEntity> a = this.annotationTestService.getResult();
        return a;
    }


}
