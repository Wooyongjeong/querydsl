package com.study.querydsl.dto;

import lombok.Data;

@Data
public class MemberSeachCondition {
    //회원명, 팀명, 나이(ageGoe, ageLoe)
    private String username;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;
}
