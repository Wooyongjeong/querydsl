package com.study.querydsl.repository;

import com.study.querydsl.dto.MemberSeachCondition;
import com.study.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSeachCondition condition);
}
