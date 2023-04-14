package uy.edu.ucu.Exception;

import java.net.MalformedURLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import uy.edu.ucu.DTO.ExceptionDTO;

import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ExceptionDTO> handleUnknownException(Exception ex) {
    ExceptionDTO body = ExceptionDTO.builder()
        .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
        .message(ex.getMessage())
        .reason("Unknown reason :(")
        .build();
    return ResponseEntity.internalServerError().body(body);
  }

  @ExceptionHandler(MalformedURLException.class)
  public ResponseEntity<ExceptionDTO> handleMalformedURLException(Exception ex) {
    ExceptionDTO body = ExceptionDTO.builder()
        .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
        .message(ex.getMessage())
        .reason("Unknown reason :(")
        .build();
    return ResponseEntity.internalServerError().body(body);
  }

}