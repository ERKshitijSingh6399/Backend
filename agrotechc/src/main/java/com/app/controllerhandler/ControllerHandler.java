package com.app.controllerhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.app.buisnessexception.BuisnessException;

@ControllerAdvice
public class ControllerHandler {

	@ExceptionHandler
	@ResponseBody
	String invalidBuisnessException(BuisnessException exception)
	{return exception.getMessage();}
}
