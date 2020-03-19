package me.mrbluesky.customanntationdemo.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.mrbluesky.customanntationdemo.vo.AnnotationResponseEntity;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Data
@NoArgsConstructor
@Slf4j
public class AnnotationTestService {
    public ResponseEntity<AnnotationResponseEntity> getResult() {
        AnnotationResponseEntity a = new AnnotationResponseEntity("1234", "Test Complete!!");
        log.info("###" + a.toString());
        return new ResponseEntity<AnnotationResponseEntity>(a, HttpStatus.OK);
    }
}
