class Solution {
    public int calPoints(String[] operations) {
        // what would be the size of our array
        int[] record = new int[operations.length];

        int index = 0;
        int sum = 0;
        // for loop
        for(String ch : operations){
            if(ch.equals("+")){
                record[index] = record[index-2] + record[index-1];
                index++;
            }

               else if(ch.equals("C")){
                index--;
            }

               else if(ch.equals("D")){
                record[index] = record[index-1]*2; 
                index++;
            }

                else{
                record[index] = Integer.parseInt(ch);
                index++;
            }
        }

        // find sum of the array remaining
        for(int i = 0 ; i < index ; i++){
            sum += record[i];
        }
        
        return sum;
    }
}