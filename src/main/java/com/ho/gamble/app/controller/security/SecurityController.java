package com.ho.gamble.app.controller.security;

import com.ho.gamble.common.entity.ResponseData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SecurityController {

  @PostMapping("/api/v1/auth/login")
  public ResponseData<Void> login(@RequestBody LoginRequest loginRequest) {
    log.debug("LoginRequest => {}", loginRequest);
    return ResponseData.success();
  }

  public record LoginRequest(String username, String password) {
  }

}
