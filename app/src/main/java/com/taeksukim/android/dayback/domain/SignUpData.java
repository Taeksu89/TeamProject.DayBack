package com.taeksukim.android.dayback.domain;

/**
 * Created by TaeksuKim on 2017. 4. 16..
 */

public class SignUpData {

    public String email;
    public String nickname;
    public String password;
    public String profile_photo;



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile_photo() {
        return profile_photo;
    }

    public void setProfile_photo(String profile_photo) {
        this.profile_photo = profile_photo;
    }
}
