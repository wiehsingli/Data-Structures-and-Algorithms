/**
 * Created by Wie Hsing Li on 12/22/2016.
 */
public class Unique {
    public boolean uniqueBruteForce(String string){

        char pos1, pos2;
        for(int i = 0; i < string.length()-1; i++){
            for(int j = i + 1; j < string.length(); j++){

                pos1 = string.charAt(i);
                pos2 = string.charAt(j);
                if(pos1 == pos2) return false;
            }
        }
        return true;
    }

    public boolean isUnique(String  string){
        int[] array = new int[128];
        int pos;

        if(string.length() > 128) return false;

        for(int i = 0; i < string.length(); i++){

            pos = string.charAt(i);
            if(array[pos] >= 1 ){
                return false;
            }

            array[pos]++;
        }
        return true;
    }
}
