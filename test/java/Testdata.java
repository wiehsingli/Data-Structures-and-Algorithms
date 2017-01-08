
import Tree.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class Testdata {

    @Test
    public void testQueue(){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(4);
        q.printQueue();
        System.out.println("Top of queue: " + q.peek());
        q.remove();
        System.out.println("Top of queue is removed.");
        q.printQueue();
    }
    @Test
    public void testStack() {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(4);
        st.printStack();
        System.out.println("Top of stack: " + st.front());
        st.pop();
        System.out.println("Top of stack is popped");
        st.printStack();
    }
    @Test
    public void testBST() {
        BST tree = new BST();
        tree.insert(3);tree.insert(8);
        tree.insert(1);tree.insert(4);tree.insert(6);tree.insert(14);tree.insert(9);

        System.out.println("Original Tree: ");
        tree.display(tree.root);
        System.out.println("\nFinding 4: " + tree.find(4));
        tree.delete(6);
        System.out.println("Deleting 6: ");
        tree.display(tree.root);
    }
    @Test
    public void testDashreplacement(){
        Dashreplacement test = new Dashreplacement();
        String result;
        result = test.solution("6h39LIH219IEK", 4);
        assertEquals( result, "6-H39L-IH21-9IEK");
    }
    @Test
    public void testPalindome(){
        Palindrome pp = new Palindrome();
        assertTrue(pp.isPermutationfromPalilndrome("madam i'm adam"));
    }
    @Test
    public void testPermutation(){
        Permutation isPerm = new Permutation();
        assertTrue(isPerm.isPermutation("dog", "god"));
    }
    @Test
    public void testUnique(){
        Unique isUnique = new Unique();
        assertTrue(isUnique.uniqueBruteForce("house"));
        assertTrue(isUnique.isUnique("party"));
    }
    @Test
    public void testCommon(){
        System.out.println("\nCOMMON TEST");
        int[] arr1 = {1,3,7,9,12,22,26,36,40,56};
        int[] arr2 = {12,20,22,25,34,56};
        Common elements = new Common();

        elements.commonBruteForce(arr1, arr2);
        elements.commonOpt(arr1, arr2);
        elements.commonWithHash(arr1, arr2);
    }

    @Test
    public void twoEggTest(){
        System.out.println("EGG TEST");
        Twoegg eggs = new Twoegg();
        assertEquals(99,eggs.twoEggBruteForce(99));
        assertEquals(3,eggs.twoEggOpt(11));
    }
    @Test
    public void testMergesort(){
        int[] array = {4,7,2,6,3,8,2,11,9,1};
        int[] solution = {1,2,2,3,4,6,7,8,9,11};
        Mergesort sort = new Mergesort();
        sort.mergesort(array);
        for(int i = 0; i < array.length; i++){
            assertEquals(solution[i] , array[i]);
        }
    }
    @Test
    public void testQuicksort(){

        int[] array = {4,7,2,6,3,8,2,11,9,1};
        int[] solution = {1,2,2,3,4,6,7,8,9,11};
        Quicksort sort = new Quicksort();
        sort.quickSort(array, 0, array.length-1);

        for(int i = 0; i < array.length; i++){
            assertEquals(solution[i] , array[i]);
        }
    }
}
