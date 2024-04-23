package DataStructure.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DashMap {

    private LinkedList<Entry>[] mapArray = new LinkedList[5];

    public void put(int key, String value) {
        int arrayIndex = key % mapArray.length;
        Entry keyValuePair = new Entry();
        LinkedList<Entry> entries = new LinkedList<>();
        if (mapArray[arrayIndex] == null) {
            keyValuePair.setKey(key);
            keyValuePair.setValue(value);
            entries.addLast(keyValuePair);
            mapArray[arrayIndex] = entries;
        } else {
            LinkedList<Entry> existingLst = mapArray[arrayIndex];
            for (Entry entry : existingLst) {
                if (entry.getKey() == key) {
                    entry.setValue(value);
                }
            }
            keyValuePair.setKey(key);
            keyValuePair.setValue(value);
            existingLst.add(keyValuePair);
        }
    }

    public String get(int key) {
        int arrayIndex = key % mapArray.length;
        if (mapArray[arrayIndex] == null) {
            return null;
        }
        LinkedList<Entry> entries = mapArray[arrayIndex];
        for (Entry entry : entries) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(int key) {
        int arrayIndex = key % mapArray.length;
        LinkedList<Entry> entries = mapArray[arrayIndex];
        if (entries != null) {
            for (Entry entry : entries) {
                if (entry.getKey() == key) {
                    entries.remove(entry);
                }
            }
        }
    }

    @Override
    public String toString() {
        List<String> map = new ArrayList<>();
        for (int i = 0; i < mapArray.length; i++) {
            if (mapArray[i] != null) {
                LinkedList<Entry> entries = mapArray[i];
                for (Entry entry : entries) {
                    map.add(entry.toString());
                }
            }
        }
        String join = String.join(",", (Iterable<? extends CharSequence>) map);
        return "{" + join + "}";

    }

}
