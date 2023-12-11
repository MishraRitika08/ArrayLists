import java.util.ArrayList;
 //brute force approach On2
public class MostWater {
    public static int mostWaterIs(ArrayList<Integer>height){
        int maxWater = 0 ;
        for(int i=0;i<height.size();i++){
            int left = height.get(i);
            for(int j=i+1;j<height.size();j++){
                int width = j-i;
                int length = Math.min(left, height.get(j));
                maxWater = Math.max(maxWater, length*width);
            }
        }

        return maxWater;
    }

    //two pointer approach->lp & rp

    public static int mostWater(ArrayList<Integer>height){
        int max = 0;
            int lp = 0;
            int rp = height.size()-1;
            while(lp<rp){
              int width = rp-lp;
              int length = Math.min(height.get(lp),height.get(lp));
              max=Math.max(max,length*width);

              if(height.get(lp)<height.get(rp)){
                lp++;
               }
               else{
                rp--;
               }
            }
        return max;
    }
    

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(7);
        height.add(8);
        height.add(9);
        height.add(4);
        height.add(0);

        System.out.println(mostWater(height));
    }
}