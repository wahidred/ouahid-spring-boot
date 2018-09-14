package business.drh.advices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@org.springframework.web.bind.annotation.RestControllerAdvice 


public class RestControllerAdvice extends ResponseEntityExceptionHandler{

	Logger logger = LoggerFactory.getLogger(RestControllerAdvice.class);

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> webApplicationHandler(Exception ex, WebRequest request) {

		HttpHeaders headers = new HttpHeaders();
		String headerName = request.getHeaderNames().next();
//headers.set(headerName, request.getHeaderValues(headerName));
		logger.info(ex.getMessage());
		
return super.handleExceptionInternal(ex, null, headers, HttpStatus.BAD_REQUEST, request);
		//return handleHttpRequestMethodNotSupported((HttpRequestMethodNotSupportedException) ex, headers, null, request);

	}
	
}
