package TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class nqt {
    public static void main(String[] args) {
//        String ar[]={"pratik","Rohit","Amar","Manohar"};
//        ArrayList<String> list=new ArrayList<>(List.of(ar));
        Scanner sc=new Scanner(System.in);
//        String first=sc.next();
//        String second=sc.next();
//        list.remove(first);
//        System.out.println(list);
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).equals(second)){
//                System.out.println(i+1);
//                exit(1);
//            }
//        }
//        System.out.println("Not present bhai");

        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(ar));

    }
}
