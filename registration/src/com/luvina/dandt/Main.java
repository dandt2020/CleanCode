package com.luvina.dandt;

import com.luvina.dandt.model.Admin;
import com.luvina.dandt.model.Member;
import com.luvina.dandt.model.User;
import com.luvina.dandt.model.UserInfo;

public class Main {

    public static void main(String[] args) {
	    UserInfo userInfo = UserInfo
                .builder()
                .age(25)
                .email("mail@mail.mail")
                .name("member")
                .id("1A")
                .build();

	    User member = createMember(userInfo);

	    member.register();
    }

    public static User createMember(UserInfo userInfo){
        return new Member(userInfo);
    }

    public static User createAdmin(UserInfo userInfo){
        return new Admin(userInfo);
    }
}
