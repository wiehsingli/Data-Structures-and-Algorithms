
public class Common {

    //O(N^2)
    public void commonBruteForce(int[] array1, int[] array2){


        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){

                if(array1[i] == array2[j]){
                }
            }
        }
    }

    /*
     * O(N) Go through arr1 once.
     */
    public void commonOpt(int[] arr1, int[] arr2){

        int i = 0;
        int j = 0;
        while(i < arr1.length){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            } else{
                System.out.println("Array1[" + i + "] & Array2[ " + j +"]: " + arr1[i]);
                i++;
                j++;
            }
        }
    }


}
