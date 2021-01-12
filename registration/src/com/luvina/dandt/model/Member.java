package com.luvina.dandt.model;

public class Member extends User{

    public Member(UserInfo userInfo) {
        super(userInfo);
    }

    @Override
    public void register() {
        System.out.println(String.format("This is member %s", userInfo));
    }
}
