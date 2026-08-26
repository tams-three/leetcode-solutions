class Solution {
    public int calPoints(String[] operations) {
        int totalsum = 0;
       Stack <Integer> stack = new Stack <>();
       for(int i = 0; i<operations.length ; i++){
        String number = operations[i];
        if(number.equals("+")){
            int val1 = stack.pop(); // 10
            int val2 = stack.pop();
            int sum = val1 + val2;
            stack.push(val2);
            stack.push(val1);
            stack.push(sum);
        }
        else if(number.equals("C")){
            stack.pop();
        }
        
        else if(number.equals("D")){
            stack.push(2*stack.peek());
        }
        else{
            stack.push(Integer.parseInt(number));
        }

       }
       while(stack.size()>0){
     totalsum += stack.pop();
       }
      return totalsum;
    }
}