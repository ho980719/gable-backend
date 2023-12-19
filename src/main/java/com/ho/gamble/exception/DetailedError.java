package com.ho.gamble.exception;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetailedError {
  /**
   * error code for API request.
   */
  private String reason;

  private String location;

  /**
   * error message.
   */
  private String message;
}
