package com.example.commute;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class UserLogin {

    private String uID, pass;

    UserLogin(String userId, String password){
        this.uID = userId;
        this.pass = password;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    String getHash(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = md.digest(password.getBytes(StandardCharsets.UTF_8));
            return hashValue.toString();
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            System.out.print(e.getMessage());
            System.exit(0);
        }
        return "";
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    boolean verifyUser() {
        int userType = UserType.getUserType();
        String id = "";
        String hash = "";

        if(userType == 1) {
            id = " "; //Getting admin uID and password from DB
            hash = "";
        }
        else if(userType == 0){
            id = " "; //Getting user uID and password from DB
            hash = "";
        }
        String passHash = getHash(pass);
        if(uID.equals(id) && passHash.equals(hash)) {
            return true;
        }
        else {
            return false;
        }
    }
}
