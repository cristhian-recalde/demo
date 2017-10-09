package com.aurea;

import java.util.List;
import java.util.regex.Pattern;

import com.aurea.model.ClassAction;
import com.aurea.model.VMConstants;

public class MethodBuilder {
    private static Pattern function = Pattern.compile("\\w[A-Za-z0-9_]+\\([\\s*\\w*][,\\s*\\w\\s*]*\\)\\s*{");

    public boolean makeAction(ClassAction action) {
        return function.matcher(action.getLine()).find();
    }

    public boolean makeAction(VMConstants action) {
        return function.matcher(action.processLine()).find();
    }

    public boolean makeAction(List<String> actions) {
        return actions != null && actions.size() > 0 && function.matcher(actions.get(0)).find();
    }

}
