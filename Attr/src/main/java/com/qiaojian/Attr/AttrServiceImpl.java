package com.qiaojian.Attr;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
public class AttrServiceImpl implements AttrService<String> {
    @Autowired
    private AttrProperties attrProperties;

    public Integer getCode() {
        System.out.println ( "AttrServiceImpl - getCode" );
        return attrProperties.getCode ();
    }

    public String getData() {
        System.out.println ( "AttrServiceImpl - getData" );
        return attrProperties.getData ();
    }

    public String getMessage() {
        System.out.println ( "AttrServiceImpl - getMessage" );
        return attrProperties.getMessage ();
    }
}
