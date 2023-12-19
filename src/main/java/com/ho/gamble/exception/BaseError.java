package com.ho.gamble.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseError {
  /**
   * HTTP status code value, without the textual description.
   */
  private Integer status;

  /**
   * the reason phrase of HTTP status code.
   */
  private String error;

  /**
   * The error message of human read-able.
   */
  private String message;

  @JsonIgnore
  private HttpStatus httpStatus;

  private List<DetailedError> errors;

  public Integer getStatus() {
    return this.httpStatus.value();
  }

  public String error() {
    return this.httpStatus.getReasonPhrase();
  }
}
