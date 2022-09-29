import java.util.TreeMap;

public class ABB<T> {

    private TreeMap<Integer, T> data;

    public ABB(){
        this.data = new TreeMap<>();
    }

    public T find(int key){
        return this.data.get(key);
    }

    /**
     * This function adds a new element to the data structure if the key is not already present
     * 
     * @param key The key to be used to store the element in the map.
     * @param newElement The element to be added to the map.
     * @return A boolean value.
     */
    public boolean add(int key, T newElement){
        boolean result = false;
        if(!this.data.containsKey(key)){
            this.data.put(key, newElement);
            result = true;
        }
        return result;
    }
    
    public int size(){
        return this.data.size();
    }

    public T[] allElements(T[] array){
        T[] allData = this.data.values().toArray(array);
        return allData;
    }

    public T remove(int key){
        return this.data.remove(key);
    }
}
