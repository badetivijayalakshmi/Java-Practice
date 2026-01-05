public class Array{
    public static void main(String[] args) {
        int[] [] matrix = {
            {1,5,7,9,10,11},
            {6,10,12,13,20,21},
            {9,25,29,30,32,41},
            {15,55,59,63,68,70},
            {40,70,79,81,95,105}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("The spiral order is:");
        int rStart = 0;
        int rEnd = n-1;
        int cStart = 0;
        int cEnd = m-1;
        while (rStart<=rEnd && cStart<=cEnd) {
            for (int col=cStart;col<=cEnd;col++){
                System.out.println(matrix[rStart][col]+" ");
            }
            rStart++;
            for(int row=rStart;row<=rEnd;row++){
                System.out.println(matrix[row][cEnd]+" ");
            }
            cEnd--;
            for(int col=cEnd;col>=cStart;col--){
                System.out.println(matrix[rEnd][col]+" ");
            }
            rEnd--;
            for(int row=rEnd;row>=rStart;row--){
                System.out.println(matrix[row][cStart]);
            }
            cStart++;
            System.out.println();
        }    
    
    }
}
