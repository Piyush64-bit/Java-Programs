public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 25); 
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue()); 
    }
}
