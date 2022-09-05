package bubblesort;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapDemo {
    public void bubbleSort(List l) {
        int temp;
        System.out.println("Before sorting............");
        System.out.println(l);
        for (int i = 0; i <= l.size() - 2; i++) {
            for (int j = 0; j <= l.size() - i - 2; j++) {
                if ((int)l.get(j)>(int)l.get(j + 1)) {
                    temp=(int)l.get(j);
                    l.set(j,l.get(j+1));
                    l.set(j+1,temp);
                }
            }
        }
        System.out.println("After sorting................");
        System.out.println(l);
    }
    public void insertionSort(List l) {
        System.out.println("Before sorting............");
        System.out.println(l);
        for (int i = 1; i <= l.size() - 1; i++) {
            int current= (int) l.get(i);
            //int current = arr[i];
            int j = i - 1;
            while (j >= 0 && (int)l.get(j) > current) {
                //Keep swapping
                l.set(j+1,l.get(j));
                j--;
            }
            l.set(j+1,current);
        }
        System.out.println("After sorting................");
        System.out.println(l);
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> hash1=new HashMap<>();
        System.out.println("Enter the size of HashMap");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for (int i = 0; i <=size-1 ; i++) {
            System.out.println("Enter a integer value");
            hash1.put(i,sc.nextInt());
        }
        System.out.println(hash1);
        List<Integer> list =new ArrayList<>(hash1.values());
        System.out.println(list);
        int ch=0;
        System.out.println("Enter 1 for Insertion sort on HashMap \n" +
                "Enter 2 for Bubble sort on HashMap\n" +
                "3 for exit\n");
        ch=sc.nextInt();
        HashMapDemo hm=new HashMapDemo();
        switch (ch){
            case 1:
                hm.insertionSort(list);
                break;
            case 2:
                hm.bubbleSort(list);
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
