package genral;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sample {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            //i=arr[i]+i;
            i=i+i;
        }



       /* for (int i = 0; i < 7; i++) {

            Fiveton t = Fiveton.getIntance();
            System.out.println(t);
        }*/

    }

}


class Fiveton {
    private static List<Fiveton> arr = new ArrayList<>();
    private static int counter = 0;

    private Fiveton() {
    }

    ;

    static {
        for (int i = 0; i < 5; i++) {
            arr.add(new Fiveton());
        }
        System.out.println(arr);
    }

    public static Fiveton getIntance() {
        if (counter == 5) {
            counter = 0;
        }
        return arr.get(counter++);
//        if(arr.size()==5){
//            System.out.println(arr);
//            Fiveton re = arr.get(new Random().nextInt(5));
//            System.out.println(re);
//            return re;
//        }else{
//            System.out.println("else");
//            Fiveton obj = new Fiveton();
//            int lenth = arr.size();
//            arr.add(obj);
//            return  obj;
//        }
    }
}


