import java.util.*;
public class swap{
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
      int temp = list.get(idx1);
      list.set(idx1,list.get(idx2));
      list.set(idx2, temp);
    }
    public static void printArray(ArrayList<Integer> list){
      for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
      }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(5);
        list.add(8);
        list.add(10);
        printArray(list); //1 7 5 8 10
        System.out.println();
        swap(list, 2,4);
        printArray(list);//1 7 10 8 5
    }
}