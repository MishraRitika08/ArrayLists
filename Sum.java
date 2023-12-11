import java.util.ArrayList;

public class Sum {

    public static boolean  targetIdx(ArrayList<Integer>list,int target){
        // 2 pointer approach
        int lp=0;
        int rp=list.size()-1;

        while (lp!=rp) {
            int curr = list.get(rp)+list.get(lp);
            //case 1
            if (curr==target){
               // System.out.println("first idx "+lp+ " second idx "+ rp);
               return true;
            }
            if(curr <target){
                lp++;
            }
            if(curr>target){
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(7);
        height.add(8);
        height.add(9);
        height.add(3);
        int target = 4  ; 

        System.out.println(targetIdx(height, target));
    }
}
