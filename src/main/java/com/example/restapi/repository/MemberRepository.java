package com.example.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.restapi.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> { }
