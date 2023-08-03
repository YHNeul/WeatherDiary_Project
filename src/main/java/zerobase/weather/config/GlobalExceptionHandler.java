package zerobase.weather.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import zerobase.weather.dto.ErrorResponse;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ErrorResponse handleAllException(Exception exception) {
        log.error("Error from GlobalExceptionHandler: ", exception);
        return new ErrorResponse("", HttpStatus.INTERNAL_SERVER_ERROR.value());
    }
}
