class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        
        //Initialize Priority Queue to Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        
        //add all elements of stones array to priority queue
        for(int stone: stones){
            pq.add(stone);
        }
        
        //Loop until the heap has atleast two elements.
        while(pq.size() >= 2){
            
            //Pop out the two max elements
            int x = pq.poll();
            int y = pq.poll();
            
            //Push the difference between the two values back into the queue
            if(x != y){
                pq.add(x - y);
            }
        }
        
        // return 0 is queue is empty, else the top element
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
