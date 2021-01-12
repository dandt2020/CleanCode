package com.luvina.dandt.model;

public class Admin extends User{
    public Admin(UserInfo userInfo) {
        super(userInfo);
    }

    @Override
    public void register() {
        System.out.println(String.format("This is admin %s", userInfo));
    }
}
