package com.zky.demospring.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Article {
    private Long id;
    private String author;
    private String title;
    private String content;
    private String createTime;

    private List<Reader> readers;
}
