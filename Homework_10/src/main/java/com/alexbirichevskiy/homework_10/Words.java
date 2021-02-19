package com.alexbirichevskiy.homework_10;

import java.util.*;
import java.util.List;

public class Words {
    private static String[] arrayFruits = new String[]{"гранат", "груша", "киви", "персик", "авокадо", "слива", "гранат",
                                        "грейпфрут", "дуриан", "слива", "локва", "грейпфрут", "киви", "лайм", "авокадо",
                                        "помело", "айва", "хурма", "апельсин", "авокадо", "груша", "ананас", "грейпфрут",
                                        "лимон", "мандарин", "груша", "банан"};

    public static void uniqueFruits () {
        Map<String, Integer> mapFruits = new TreeMap();

        for (int i = 0; i < arrayFruits.length; i++) {
            if (mapFruits.containsKey(arrayFruits[i])) {
                mapFruits.put(arrayFruits[i], mapFruits.get(arrayFruits[i]) + 1);
            } else {
                mapFruits.put(arrayFruits[i], 1);
            }
        }

//        Сортируем Map
        List <Map.Entry<String, Integer>> sortedMapFruits = new ArrayList(mapFruits.entrySet());
        Collections.sort(sortedMapFruits, new Comparator <Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> v1, Map.Entry<String, Integer> v2) {
                return v2.getValue() - v1.getValue();
            }
        });

//        Выводим
        Iterator <Map.Entry<String, Integer>> iter = sortedMapFruits.iterator();
        while (iter.hasNext()) {
            Map.Entry <String, Integer> entry = iter.next();
            System.out.println(entry.getKey() + " " + entry.getValue());


        }
    }
}
