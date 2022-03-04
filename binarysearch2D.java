//do some work ..check again on different test
public class binarysearch2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(searchMatrix(matrix,2));
        
    }
    public static boolean binarysearch(int[][] matrix,int row,int cstart,int cend,int target){
        boolean ans = true;
        while(cstart<=cend){
            int mid = cstart + (cend-cstart)/2;
            if(matrix[row][mid]==target){
                return ans;
            }
            if(matrix[row][mid]<target){
                cstart = mid +1;
            }else{
                cend = mid -1;
            }

        }
        return !ans;
    }
    public static boolean searchMatrix(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(cols==0){
            return false;
        }
        if(rows==1){
            binarysearch(matrix, 0, 0, cols-1, target);
        }
        int rstart = 0;
        int rend = rows-1;
        int cmid = cols/2;
        while(rstart<(rend-1)){
            int mid = rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target){
                return true;
            }
            if(matrix[mid][cmid]<target){
                rstart=mid;
            }else{
                rend=mid;
            }
        }
        if(matrix[rstart][cmid]==target){
            return true;
        }
        if(matrix[rstart+1][cmid]==target){
            return true;

        }
        //search in 1st half
        if(target<=matrix[rstart][cmid-1]){
            return binarysearch(matrix, rstart,0, cmid-1, target);
        }
        if(target>=matrix[rstart][cmid+1]){
            return binarysearch(matrix, rstart, cmid+1, cols-1, target);
        }
        if(target<=matrix[rstart+1][cmid-1]){
            return binarysearch(matrix, rstart+1,0,cmid-1, target);
        }
        if(target>=matrix[rstart+1][cmid+1]){
            return binarysearch(matrix, rstart+1, cmid+1, cols-1, target);
        }
    
    return false;

    
}
}
