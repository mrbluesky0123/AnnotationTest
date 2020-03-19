package me.mrbluesky.customanntationdemo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnnotationResponseEntity {
    private String status;
    private String msg;
}
