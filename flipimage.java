import java.util.Arrays;

public class flipimage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        imageflip(arr);
        System.out.println(Arrays.deepToString(arr));

        
    }
    static int[][] imageflip(int[][] image){
        for(int[] row: image){
            //revrese
            for(int i=0;i<(image[0].length+1)/2;i++){
                //swap
                int temp = row[i]^1; //xor with 1 -> taking complement of the num (to reverse 0->1)
                row[i] = row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;

                }
            }
            return image;

    }
}
