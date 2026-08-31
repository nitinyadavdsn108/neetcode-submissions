class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // numsaray will not be empty , must have atleast one elemnet
        // to map number and there corresponding frequencies

// used a hashmap

    HashMap<Integer , Integer> map = new HashMap<>();

    for(int n : nums){
        if(map.containsKey(n)){
            map.put(n,map.get(n)+1);
        }
        else{
            map.put(n , 1);
        }
    }


    List<Integer>[] buckets = new ArrayList[nums.length + 1];


// a list of arrays that stores frequencies and there corresponding numbers
// 0th --> []
// 1th -->[]

// create arrayList for the bucket length
for(int i=0 ; i < buckets.length ; i++){
    buckets[i] = new ArrayList<>();
}


//buckets[0] → []
//buckets[1] → []
//buckets[2] → []
//buckets[3] → []
//buckets[4] → []




for(Integer n : map.keySet()){
    int frequency = map.get(n);
    buckets[frequency].add(n);
}


// just traverse from the end of buckets until k
int j = 0 ;
int[] result = new int[k];

for(int i = buckets.length-1 ; i >= 0 && j<k ; i--){

    for(Integer n : buckets[i]){
        result[j] = n;
        j++;
        if(j==k){
            break;
        }
    }

}





return result;



    }
}
