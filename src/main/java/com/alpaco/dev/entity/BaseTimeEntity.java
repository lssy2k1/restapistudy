package com.alpaco.dev.entity;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public abstract class BaseTimeEntity {
//어디서 사용될지 모르니 추상클래스로 만들어준다.
    protected LocalDateTime createdAt;

    protected LocalDateTime updatedAt;
}
