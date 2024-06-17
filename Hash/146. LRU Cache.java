class LRUCache {
      Node head=new Node(0,0);
      Node tail=new Node(0,0);
      HashMap<Integer,Node>hm=new HashMap<>();
      int cap;
    public LRUCache(int capacity) {
        this.cap=capacity;
        head.next=tail;
        tail.prv=head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
           Node node=hm.get(key);
           remove(node);
           insert(node);
           return node.value;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            remove(hm.get(key));
        }
        if(hm.size()==cap){
           remove(tail.prv);
        }
        insert(new Node(key,value));
    }
    public void insert(Node node){
       hm.put(node.key,node);
       node.next=head.next;
       node.next.prv=node;
       head.next=node;
       node.prv=head;

    }
    public void remove(Node node){
      hm.remove(node.key);
      node.prv.next=node.next;
      node.next.prv=node.prv;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
 class Node{
    Node prv,next;
    int key,value;
    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
 }
