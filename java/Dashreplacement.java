/**
 * Created by Wie Hsing Li on 12/22/2016.
 */
public class Dashreplacement {

    public String solution(String S, int K) {
        String string = noDashes(S);

        StringBuilder str = new StringBuilder(string);
        //Start off at the first chunk of characters
        int index = str.length() - K;

        while( index > 0 ){
            str.insert(index, "-");
            index = index - K;
        }
        return new String(str.toString().toUpperCase());
    }

    public String noDashes(String S){

        StringBuilder string = new StringBuilder();
        String[] stringarr = S.split("-");
        for (String str : stringarr) {
            string.append(str);
        }
        return string.toString();
    }
}
