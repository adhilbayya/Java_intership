package day6;

public class ArrayExample3 {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {4,5,6}, {70,8,9}};
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
            
        }System.out.println(max);
    }
}
