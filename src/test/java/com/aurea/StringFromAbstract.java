package com.aurea;

// import java.util.ArrayList;
import java.util.List;

import org.mockito.Mockito;

public class StringFromAbstract extends OtherTest {

    @Override
    protected boolean getTesting() {
        MethodBuilder method = new MethodBuilder();
        List<String> aList = Mockito.mock(List.class);
        return method.makeAction(aList);
    }

}
