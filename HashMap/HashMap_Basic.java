package HashMap;
/*
---:Important Notes:---
->HashMap allows one null key and multiple null values.
    Example:
            map.put(null, 10);
            map.put("One", null);
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMap_Basic {
    public static void main(String[] args) {
        //Creating a Hashmap
        HashMap<String, Integer> hm = new HashMap<>();
        
        //Adding Elements: put(K key, V value)
        hm.put("Zero",1);     //Associates the specified value with the specified key in the map.
        hm.put("One",2);
        hm.put("Two",3);
        hm.put("Three",4);
        hm.put("Four",10);
        System.out.println(hm);     //Print the whole HashMap
        
        //Accessing Elements: get(Object key)
        int value = hm.get("Two");
        System.out.println("Accessing Elements: " + value);
        
        //Removing Elements
        System.out.println(hm.remove("Three")); //Removing element returns the value
        
        System.out.println("Size: " + hm.size());   //Returns the number of key-value mappings in the map.
        
        boolean hasKey = hm.containsKey("Three");   //Returns true if the map contains a mapping for the specified key.
        System.out.println("containsKey: " + hasKey);
        
        boolean hasValue = hm.containsValue(3); //Returns true if the map maps one or more keys to the specified value.
        System.out.println("containsValue: " + hasValue);
        
        boolean empty = hm.isEmpty();   //Returns true if the map contains no key-value mappings.
        System.out.println("isEmpty(): " + empty);
        
        Set<String> keys = hm.keySet(); //Returns a set view of the keys contained in the map.
        System.out.println("keySet: " + keys);
        
        //Copies all of the mappings from the specified map to this map: void putAll(Map<? extends K, ? extends V> m)
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Banana", 2);
        hm.putAll(anotherMap);
        System.out.println("With anotherMap: "+hm);
        
        //Returns a set view of the mappings contained in the map.
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        hm.clear();     //Removes all mappings from the map.
        System.out.println(hm);

/*
---Usable methods---
-void clear()
-boolean containsKey(Object key)
-boolean containsValue(Object value)
-Set<Map.Entry<K, V>> entrySet()
-V get(Object key)
-boolean isEmpty()
-Set<K> keySet()
-V put(K key, V value)
-void putAll(Map<? extends K, ? extends V> m)
-V remove(Object key)
-int size()
-Collection<V> values() :---> Collection<Integer> values = hm.values();
-V getOrDefault(Object key, V defaultValue) :---> hm.getOrDefault("Apple", 0);
-V putIfAbsent(K key, V value) :---> int value = hm.putIfAbsent("Apple", 1);
-boolean remove(Object key, Object value) :---> hm.remove("Apple", 1);
-V replace(K key, V value) :---> boolean removed = hm.replace("Apple", 2);
-boolean replace(K key, V oldValue, V newValue) :---> boolean replaced = hm.replace("Apple", 1, 2);
*/
    }
}
