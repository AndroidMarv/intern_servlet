package me.maad;

import com.sun.istack.internal.Nullable;

import java.io.Serializable;

/**
 * Created by Manan Sharma on 22-12-2016 for GoKrazee Innovations Private Limited.
 */
public class ModelUsers implements Serializable{
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ModelCollage getModelCollage() {
        return modelCollage;
    }

    public void setModelCollage(ModelCollage modelCollage) {
        this.modelCollage = modelCollage;
    }

    private String userName,userId,userCity,gender;
    private ModelCollage modelCollage;
    private String userInviteCode ;

    public String getUserInviteCode() {
        return userInviteCode;
    }

    public void setUserInviteCode(String userInviteCode) {
        this.userInviteCode = userInviteCode;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
