package com.stalary.pf.recruit.holder;

/**
 * UserHolder
 *
 * @author lirongqian
 * @since 2018/04/16
 */
public class UserHolder {

    private static final ThreadLocal<Long> userThreadLocal = new ThreadLocal<>();

    public static Long get() {
        return userThreadLocal.get();
    }

    public static void set(Long userId) {
        userThreadLocal.set(userId);
    }

    public static void remove() {
        userThreadLocal.remove();
    }
}