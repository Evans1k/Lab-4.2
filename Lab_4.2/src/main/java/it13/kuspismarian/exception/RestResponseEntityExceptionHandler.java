package it13.kuspismarian.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {
    @ExceptionHandler(value = ServiceException.class )
    public ResponseEntity<Object> handleServiceException(final ServiceException ex, final WebRequest request) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ServiceExceptionDTO(ex));
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class )
    public ResponseEntity<Object> handleServiceException(final MethodArgumentNotValidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ServiceExceptionDTO(400, ex.getMessage(), null));
    }
}
