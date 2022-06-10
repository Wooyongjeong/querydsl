package com.study.querydsl.repository;

import com.study.querydsl.dto.MemberSeachCondition;
import com.study.querydsl.dto.MemberTeamDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSeachCondition condition);
    Page<MemberTeamDto> searchPageSimple(MemberSeachCondition condition, Pageable pageable);
    Page<MemberTeamDto> searchPageComplex(MemberSeachCondition condition, Pageable pageable);
}
