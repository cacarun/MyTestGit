package com.example.cjw.mytestgit.util;

import java.util.List;

/**
 * Created by cjw on 2017/4/30.
 */

public class StrUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static int size(List list) {
        return list == null ? 0 : list.size();
    }
}
