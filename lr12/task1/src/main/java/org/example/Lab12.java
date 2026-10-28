package org.example;

import java.util.HashMap;
import java.util.Map;

public class Lab12 {
    public static void main(String[] args) {
        Map<String, Tool> tools = new HashMap<>();

        tools.put("дрель 1", new Drill("дрель 1", 1, "сверление", 10));
        tools.put("дрель 2", new Drill("дрель 2", 2, "сверление", 12));
        tools.put("дрель 3", new Drill("дрель 3", 3, "сверление", 15));

        tools.put("пила 1", new Saw("пила 1", 4, "резка", "биметалл"));
        tools.put("пила 2", new Saw("пила 2", 5, "резка", "карбид"));
        tools.put("пила 3", new Saw("пила 3", 6, "резка", "алмаз"));

        tools.put("шлифмашина 1", new Sander("шлифмашина 1", 7, "шлифовка", 80));
        tools.put("шлифмашина 2", new Sander("шлифмашина 2", 8, "шлифовка", 120));

        for (Map.Entry<String, Tool> entry : tools.entrySet()) {
            System.out.println("ключ: " + entry.getKey());
            System.out.println("значение: " + entry.getValue());
        }
    }
}