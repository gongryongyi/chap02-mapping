package com.ohgiraffers.section06.compositekey.subsection01.embedded;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="member_section06_subsection01")
@Table(name="tbl_member_section06_subsection01")
public class Member {

    @EmbeddedId
    private MemberPK memberPK;
}
