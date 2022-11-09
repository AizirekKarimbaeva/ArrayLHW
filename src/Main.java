import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rn = new Random();
        arr.add(rn.nextInt(1,100));
        for (int i = 1; i < 50; i++) {
            System.out.println(arr);
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            Integer x = arr.get(i);
            if(x%2 ==0){
                System.out.println(even.add(x)+" Even number");
            }else
                System.out.println(odd.add(x)+" Odd number");
        }
    }
}
