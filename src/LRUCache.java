import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    public static class  Node{
        public int key, val;
        public Node next, prev;
        public  Node(int k, int v){
            this.key = k;
            this.val = v;
        }
    }
    private HashMap<Integer, Node> map;
    private LinkedList cache;
    private int cap;
    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        cache = new LinkedList();

    }
    public int get(int key){
        if ( !map.containsKey(key)){
            return -1;
        }
        int val = map.get(key).val;
        put(key,val);

        return val;
    }
    public void put(int key,int val) {
        Node x = new Node(key,val);
        if (map.containsKey(key)){
            cache.remove(map.get(key));
            cache.addFirst(x);
            map.put(key,x);
        }else {
            if (cap == cache.size()){
                Node node= (Node) cache.removeLast();
                map.remove(node.val);
            }
            cache.addFirst(x);
            map.put(x.val,x);
        }
    }

}
