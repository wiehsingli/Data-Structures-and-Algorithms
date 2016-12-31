/**
 * Created by Wie Hsing Li on 12/22/2016.
 */
public class Permutation {

    String strSort(String str){

        char[] contents = str.toCharArray();
        java.util.Arrays.sort(contents);
        return new String(contents);
    }

    public boolean isPermutation(String str1, String str2){

//		char[] string1 = strSort(str1).toCharArray();
//		char[] string2 = strSort(str2).toCharArray();
//
//		if(str1.length() != str2.length()) return false;
//		for(int i = 0; i < string1.length; i++){
//
//			if(string1[i] != string2[i]) return false;
//		}
//
//		return true;

        if(strSort(str1).equals(strSort(str2))) return true;
        else return false;

    }
}
