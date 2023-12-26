package com.ho.gamble.app.repository.member;

import com.ho.gamble.app.entity.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
