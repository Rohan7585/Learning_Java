package HashMap.FromStrach;

public class MyHashMap<K, V>{   // Inner class to hold key-value pairs (linked list for collisions)
    private static class Entry<K, V>{
        K key;
        V value;
        Entry<K, V> next;   // Pointer to next entry in the chain

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Entry<K, V>[] arr;    // Hash table array (buckets)
    private int capacity = 16;  // Initial size (power of 2 for efficiency)
    private int size = 0;   // Track number of entries

    public MyHashMap(){ // Constructor
        arr = new Entry[capacity];    // Initialize the array
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity; // Ensure the hash is positive, then compress to array size
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Entry<K, V> newEntry = new Entry<>(key, value);
    
        if (arr[index] == null) {    // Case 1: No collision (bucket is empty)
            arr[index] = newEntry;
        } 
    
        else {    // Case 2: Collision → Traverse the chain
            Entry<K, V> current = arr[index];
            while (current.next != null) {
                if (current.key.equals(key)) { // Key exists → update value
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            current.next = newEntry; // Append to the end
        }
    
        size++;
        // Resize if the table is too full
        if ((double) size / capacity > 0.75) {
            resize();
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        Entry<K, V> current = arr[index];
    
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value; // Key found!
            }
            current = current.next;
        }
        return null; // Key not found
    }

    private void resize() {
        // 1. Double the capacity
        capacity *= 2;
        
        // 2. Create a new empty array
        Entry<K, V>[] newTable = new Entry[capacity];
        
        // 3. Rehash all entries from the old table to the new one
        for (Entry<K, V> entry : arr) {
            Entry<K, V> current = entry;
            while (current != null) {
                // Save the next entry before moving
                Entry<K, V> next = current.next;
                
                // Recalculate the new index for the current entry
                int newIndex = getIndex(current.key);
                
                // Insert at the head of the new bucket
                current.next = newTable[newIndex];
                newTable[newIndex] = current;
                
                // Move to the next entry in the chain
                current = next;
            }
        }
        
        // 4. Replace the old table with the new one
        arr = newTable;
    }
}