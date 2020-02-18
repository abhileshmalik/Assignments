public class FindCommonElement {

 public static void main(String[] args) {
  int[] numArray1 = {1, 4, 5, 6, 10};
  int[] numArray2 = {6, 1, 8, 34, 5, 9,90};
  for(int i = 0; i < numArray1.length; i++){
   for(int j = 0; j < numArray2.length; j++){
    if(numArray1[i] == numArray2[j]){
     System.out.println(numArray1[i]);
     break;
    }
   }
  }
  
 }
}
