import java.util.ArrayList;

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
    public static void main(String[] args) {
        ArrayList height = new ArrayList<>();
        height.add(1);
        height.add(7);
        height.add(8);
        height.add(9);
        height.add(4);
        height.add(0);

        System.out.println(mostWaterIs(height));
    }
}
