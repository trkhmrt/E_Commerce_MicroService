package com.products.products_v1.Exception;


import com.products.products_v1.Dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{
    // `ResourceNotFoundException` hatasını yakala

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex) {
        // Hata mesajını ve HTTP durumu döndür
        return new ResponseEntity<>(new ResponseDto("Product not found"), HttpStatus.NOT_FOUND);
    }



}
