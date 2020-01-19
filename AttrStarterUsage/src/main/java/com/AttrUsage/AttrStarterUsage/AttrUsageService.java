package com.AttrUsage.AttrStarterUsage;

import com.qiaojian.Attr.AttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service
public class AttrUsageService {
    @Resource
    private AttrService attrService;

    public void getAttributes() {
        System.out.println ( "code: " + attrService.getCode () );
        System.out.println ( "data: " + attrService.getData () );
        System.out.println ( "message: " + attrService.getMessage () );
    }
}
