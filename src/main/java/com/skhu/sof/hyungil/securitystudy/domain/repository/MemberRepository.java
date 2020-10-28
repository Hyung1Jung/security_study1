package com.skhu.sof.hyungil.securitystudy.domain.repository;

import com.skhu.sof.hyungil.securitystudy.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    Optional<MemberEntity> findByEmail(String userEmail);
}