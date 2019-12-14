package com.example.commute;

public final class UserType {

    static int userType;

    static void setUserType(int type) {
        UserType.userType = type;
    }

    static int getUserType() {
        return UserType.userType;
    }
}
