package devfactory.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckMap {
    public static void main(String[] args) {
        Map<String, Set<String>> references = new HashMap<>();
        references.put("key", new HashSet<>());
        references.get("key").add("one");
        references.get("key").add("two");

        System.out.println(references.computeIfAbsent("key", k -> Collections.emptySet()).size());
        System.out.println(references.computeIfAbsent("keyee", k -> Collections.emptySet()).size());
        System.out.println(references.computeIfAbsent("kee", k -> Collections.emptySet()).size());
    }
}
