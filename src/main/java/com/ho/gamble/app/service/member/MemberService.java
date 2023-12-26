package com.ho.gamble.app.service.member;

import com.ho.gamble.app.dto.member.MemberDto;
import com.ho.gamble.app.entity.member.Member;
import com.ho.gamble.app.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
  private final MemberRepository memberRepository;

  public List<Member> getMembers(MemberDto memberDto) {
    return memberRepository.findAll();
  }

  public Member findByLoginId(String username) {
    return memberRepository.findByLoginId(username).orElseThrow(() -> new UsernameNotFoundException("Not Found Username"));
  }
}
