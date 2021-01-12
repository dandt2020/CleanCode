package com.luvina.dandt.model;

import com.luvina.dandt.enums.Gender;

public class UserInfo {
    private String id;
    private String name;
    private String email;
    private int age;
    private Gender gender;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public static class UserBuilder {
        private UserInfo userInfo = new UserInfo();

        public UserBuilder id(String id) {
            userInfo.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            userInfo.name = name;
            return this;
        }

        public UserBuilder email(String email) {
            userInfo.email = email;
            return this;
        }

        public UserBuilder age(int age) {
            userInfo.age = age;
            return this;
        }

        public UserBuilder gender(Gender gender) {
            userInfo.gender = gender;
            return this;
        }

        public UserInfo build() {
            return userInfo;
        }
    }
}
