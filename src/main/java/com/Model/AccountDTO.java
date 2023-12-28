package com.Model;

import javax.persistence.*;

@Entity
public class AccountDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pass_Id")
    @SequenceGenerator(name="pass_Id",initialValue = 500,allocationSize = 100)
    private int profile_Id;
    private String profile_First_Name;
    private String getProfile_Last_Name;
    private String email;

    public int getProfile_Id() {
        return profile_Id;
    }

    public void setProfile_Id(int profile_Id) {
        this.profile_Id = profile_Id;
    }

    public String getProfile_First_Name() {
        return profile_First_Name;
    }

    public void setProfile_First_Name(String profile_First_Name) {
        this.profile_First_Name = profile_First_Name;
    }

    public String getGetProfile_Last_Name() {
        return getProfile_Last_Name;
    }

    public void setGetProfile_Last_Name(String getProfile_Last_Name) {
        this.getProfile_Last_Name = getProfile_Last_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String followers) {
        this.email= followers;
    }

    @Override
    public String toString() {
        return "PasswordDTO{" +
                "profile_Id=" + profile_Id +
                ", profile_First_Name='" + profile_First_Name + '\'' +
                ", getProfile_Last_Name='" + getProfile_Last_Name + '\'' +
                ", followers=" + email +
                '}';
    }
}
