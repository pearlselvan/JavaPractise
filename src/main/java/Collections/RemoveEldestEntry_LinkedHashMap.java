package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by muthuselvan on 2/3/17.
 *
 */

/*
The java.util.LinkedHashMap.removeEldestEntry()
method returns true if this map should remove its eldest
entry. This method is invoked by put and putAll after
inserting a new entry into the map.
It provides the implementor with the opportunity to remove
the eldest entry each time a new one is added.
This is useful if the map represents a cache: it allows the map to reduce memory consumption by deleting
stale entries.

*/

public class RemoveEldestEntry_LinkedHashMap {
    public static void main(String[] args) {
        linkedHashMap();
    }

    // The below demo prgram will remove eldest element "H" from the linkedhashmap
    // LRU will be using this LinkedHashMap to delete old historot page to remove the item
    public static void linkedHashMap() {
      int MAX_ENTRIES = 5;
        LinkedHashMap lhm = new LinkedHashMap(MAX_ENTRIES + 1, .75F, false) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > MAX_ENTRIES;
            }
        };
        lhm.put(0, "H");
        lhm.put(1, "E");
        lhm.put(2, "L");
        lhm.put(3, "L");
        lhm.put(4, "O");
        lhm.put(5, "W");

        System.out.println("" + lhm);

    }
    }


