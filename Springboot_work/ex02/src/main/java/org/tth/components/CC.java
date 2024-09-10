package org.tth.components;

import org.springframework.stereotype.Component;

public class CC {
    private static CC cc= new CC();
    public static CC getInstance(){
        if (cc==null)
            cc= new CC();
        return cc;
    }

}
