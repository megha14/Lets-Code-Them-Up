class CountElements {
    public int countElements(int[] arr) {
        
        // Initialize the count to zer0
        // HashMap of individual elements and their coounts
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Fill the map
        for(int i: arr){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
        }
        
        // Iterate over the keys of HashMap
        for(Integer i: map.keySet()){
            
            // if the map contains i+1 then add the count of i to total count
            if(map.containsKey(i+1)){
                count += map.get(i);
            }
        }
        
        //return result
        return count;
    }
}
