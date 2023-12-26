package com.ho.gamble.app.service.member;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ho.gamble.app.entity.member.Member;
import com.ho.gamble.app.repository.member.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest(properties = {
    "spring.jpa.defer-datasource-initialization=true",
})
@Sql(value = {"classpath:db/h2/member.sql"})
@Slf4j
class MemberServiceTest {
  @Autowired
  MemberRepository memberRepository;

  @Test
  void list() {
    List<Member> members = memberRepository.findAll();
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      log.debug("members => {}", objectMapper.writeValueAsString(members));
      log.debug("member[0].address => {}", objectMapper.writeValueAsString(members.get(0).getAddress()));
    } catch (Exception e) {
      log.error("error", e);
    }
  }
}
