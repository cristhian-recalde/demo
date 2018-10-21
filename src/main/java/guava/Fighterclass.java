package guava;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Fighterclass {

    private int many;

    int getMany() {
        return this.many;
    }

    public static void main(String[] args) {
        Table<String, String, Integer> table = HashBasedTable.create();

        table.put("row1", "col1", 5);
        table.put("row1", "col2", 6);
        table.put("row1", "col3", 3);
        table.put("row1", "col4", 2);

        table.put("row2", "col1", 0);
        table.put("row2", "col2", -1);
        table.put("row2", "col3", 3);

        table.put("row3", "col1", 51);
    }
}
