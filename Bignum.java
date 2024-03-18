

class Bignum{
    
     public static void main(String[] args) {
         int number,BiggestNo,size=10;
         int[] Array = {0,1,2,3,4,5,6,7,-1,-7};
         BiggestNo = Array[0];
         for ( number = 1; number < size; number++) {
             if (Array[number] > BiggestNo){
                 BiggestNo = Array[number];
             }
        }
 
 System.out.println("The biggest number is: " +BiggestNo);
     }
 }
   

