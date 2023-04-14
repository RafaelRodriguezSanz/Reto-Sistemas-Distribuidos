package uy.edu.ucu.DTO;

import lombok.Builder;

@Builder
public class ExceptionDTO {
    int code;
    String message;
    String reason;
}
