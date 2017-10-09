package com.aurea;

import com.aurea.model.EntityAction;

public class StringActionNg extends TestingNg {

    @Override
    protected boolean getTesting() {
        MethodBuilder fp2 = new MethodBuilder();
        EntityAction ac = new EntityAction();
        ac.setLine("public void test_get() {");
        return fp2.makeAction(ac);
    }

}
