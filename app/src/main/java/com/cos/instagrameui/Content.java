package com.cos.instagrameui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Content {
    private int id;
    private String username;
    private int profileImgSrc;
    private int contentImgSrc;
}
