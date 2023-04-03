package com.tohu.tohucommand.Utils;

import com.google.gson.Gson;
import com.tohu.tohucommand.Models.User.User;

public class TohuUseUtils {
    public static User getUser(String url) {
        String jsonStr = HttpReq.Get(url);
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, User.class);
    }

    public static boolean getAuthenticated(String url) {return getUser(url).authenticated;}

    public static String getRole(String url) {
        return getUser(url).role;
    }

    public static String getUserName(String url) {
        return getUser(url).userName;
    }

}
