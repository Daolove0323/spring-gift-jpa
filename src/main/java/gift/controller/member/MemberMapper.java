package gift.controller.member;

import gift.controller.auth.LoginRequest;
import gift.domain.Member;

public class MemberMapper {

    public static Member from(LoginRequest member) {
        return new Member(member.email(), member.password());
    }

    public static MemberResponse toMemberResponse(Member member) {
        return new MemberResponse(member.getId(), member.getEmail(), member.getPassword(),
            member.getGrade());
    }
}