public class Solution {

 public List<List<Pair>> insertionSort(List<Pair> pairs) {

    List<List<Pair>> result = new ArrayList<>();
    
    // insertion sort
    for(int i =0 ; i < pairs.size() ; i++){
        int j = i-1;
        Pair curr = pairs.get(i);
        while(j>=0 && pairs.get(j).key > curr.key){
            pairs.set(j+1,pairs.get(j));
            j--;
        }
        pairs.set(j+1,curr);
        
        result.add(new ArrayList<>(pairs));
    }

    return result;
   
}





}
