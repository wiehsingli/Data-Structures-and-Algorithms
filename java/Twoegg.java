/**
 * Created by Wie Hsing Li on 12/22/2016.
 */
public class Twoegg {
    //O(N)
    public int twoEggBruteForce(int floor){

        int egg1 = 0;
        for(int i = 0; i <= floor; i++){

            if(egg1 != floor) egg1++;
            else return egg1;
        }
        return egg1;
    }
    /*
     * First egg will go up in increments of 10.
     * Once the first egg breaks the second egg will increment from the last 10th increment one by one.
     * Ex. Worst case scenario: floor 99
     * Amount of drops = 19
     */
    public int twoEggOpt(int floor){

        int egg1=0, egg2=0;
        int counter = 0;

        while(egg1 <= floor){
            if(egg1 == floor) return egg1 - 1;
            if(floor < 10) egg2 = 0;
            egg1+=10;
            counter++;
        }
        egg2 = egg1 - 10;
        while(egg2<floor){
            if(egg2 == floor)return counter;
            egg2++;
            counter++;
        }
        System.out.println("Floor: " + floor + " | Drops: " + counter);
        return counter;
    }

}
