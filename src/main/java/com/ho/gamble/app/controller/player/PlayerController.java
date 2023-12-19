package com.ho.gamble.app.controller.player;

import com.ho.gamble.app.entity.player.Player;
import com.ho.gamble.app.service.player.PlayerService;
import com.ho.gamble.common.entity.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlayerController {
  private final PlayerService playerService;

  @GetMapping("/api/v1/players")
  public ResponseData<List<Player>> players() {
    return ResponseData.success(playerService.list());
  }
}
