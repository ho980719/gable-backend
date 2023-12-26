package com.ho.gamble.app.controller.member;

import com.ho.gamble.app.dto.member.MemberDto;
import com.ho.gamble.app.entity.member.Member;
import com.ho.gamble.app.service.member.MemberService;
import com.ho.gamble.common.entity.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
  private final MemberService memberService;
  @GetMapping("/api/v1/members")
  public ResponseData<List<Member>> members(MemberDto memberDto) {
    return ResponseData.success(memberService.getMembers(memberDto));
  }
}
