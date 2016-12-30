/**
 * Created by Wie Hsing Li on 12/22/2016.
 */
public class Palindrome {
    boolean isPermutationfromPalilndrome(String string){
        int[] table = frequencyTable(string);
        return checkFrequency(table);
    }
    /*
     * Map each character to a number. a -> 0, b-> 1, c -> 2...
     * Case insensitive.  Non-letter characters map to -1
     */
    int getCharNumber(Character c){

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z){
            return val - a;
        }
        return -1;
    }

    int[] frequencyTable(String string){

        //array of 26 elements
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		/*
		 * Traverses through the string obtaining numerical value from getCharNumber (spaces and symbols = -1)
		 * Incrementing table at value index
		 */
        for(char c : string.toCharArray()){

            int x = getCharNumber(c);
            //skipping spaces and symbols
            if(x != -1){
                table[x]++;
            }
        }
        return table;
    }

    boolean checkFrequency(int[] table){

        boolean oddCount = false;
        for(int count : table){

			/*Checks to see if there is an odd number of a character */
            if(count % 2 == 1){

				/*Checks to see if there is already odd number count
				 * If true, then return false, can't be a palindrome
				 */
                if(oddCount){
                    return false;
                }
				/* if there is, set odd to true */
                oddCount = true;
            }
        }
        return true;
    }
}
