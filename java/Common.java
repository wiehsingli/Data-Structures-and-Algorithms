import java.util.HashSet;

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
     * Both lists are sorted.
     */
    public void commonOpt(int[] arr1, int[] arr2){

        int i = 0;
        int j = 0;
        while(i < arr1.length){
            //if element in arr1 is less than element in arr2. We know that elements will only be greater
            if(arr1[i] < arr2[j]){
                i++;
                //Same as the top but in reverse. If element in arr1 is greater than element in arr2, we know that elements before is smaller.
            }else if(arr1[i] > arr2[j]){
                j++;
            } else{
                //Once the common element is found, advance both lists
                System.out.println("Array1[" + i + "] & Array2[ " + j +"]: " + arr1[i]);
                i++;
                j++;
            }
        }
    }

    public void commonWithHash(int[] arr1, int[] arr2) {

        HashSet<Integer> array2 = new HashSet<Integer>();
        for (int i : arr2) {
            array2.add(i);
        }
        for (int i = 0; i < arr1.length; i++) {
            boolean exist = array2.contains(arr1[i]);
            if (exist) {
                System.out.println("Hashed common Elements: " + arr1[i]);
            }
        }
    }
}
