package com.products.products_v1.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;


public class ResponseDto {

    private String message;

    public ResponseDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
