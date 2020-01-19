package com.qiaojian.Attr;

/**
 * @description:
 * @create: 2020-01-19 14:52
 */
public interface AttrService<T> {
    Integer getCode();
    T getData();
    String getMessage();
}
