package com.ho.gamble.app.service.player;

import com.ho.gamble.app.entity.player.Player;
import com.ho.gamble.app.repository.player.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {
  private final PlayerRepository playerRepository;

  public List<Player> list() {
    return playerRepository.findAll();
  }
}
