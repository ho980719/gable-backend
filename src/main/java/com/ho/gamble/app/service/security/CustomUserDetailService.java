package com.ho.gamble.app.service.security;

import com.ho.gamble.app.entity.member.Member;
import com.ho.gamble.app.enums.member.Role;
import com.ho.gamble.app.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {
  private final MemberService memberService;
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Member member = memberService.findByLoginId(username);
    return User.builder()
        .username(member.getLoginId())
        .username(member.getPassword())
        .roles(Role.USER.name())
        .build();
  }
}
