package com.cmt.statemachine.util;

/**
 * @author dingchenchen
 * @since 2021/3/30
 */
public class AssertUtil {


    public static void notPositive(int i, String message) {
        if (i <= 0) {
            throw new IllegalArgumentException(message);
        }
    }
}
