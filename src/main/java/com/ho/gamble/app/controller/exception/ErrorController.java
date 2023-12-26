package com.ho.gamble.app.controller.exception;

import com.ho.gamble.common.entity.ResponseData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
  @ExceptionHandler(Exception.class)
  public ResponseData<Void> defaultError() {
    return ResponseData.fail("", "Exception..");
  }
}
