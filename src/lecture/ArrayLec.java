package lecture;
import java.util.Arrays;
public class ArrayLec {
    public static void main(String[] args) {
        double[] prices;
        prices = new double[4];
        prices[0] = 12.24;
        prices[1] = 3.14;
        prices[2] = 2.3;
        prices[3] = 3.1111;
//        prices[4] = 33.22; //index will be out of bound
        String name[] = {"yong", "john", "david"};
        String name2[] = {"yong", "john", "david"};
        System.out.println(prices.length);
        System.out.println(prices[3]);
        for(int i = 0; i < prices.length; i++){
            System.out.println(" " + prices[i]);
        }
//        for(int i =0; i <name.length; i++){
//            System.out.println(name[i]);
//        }
        //forEach
        for(String names: name){
            System.out.println(names);
        }
        Arrays.fill(prices, 0.00);
        System.out.println(prices[0]);
        for(double price: prices){
            System.out.println(price);
        }
//        return type has to be same type
        System.out.println(Arrays.equals(name, name2));
        System.out.println(Arrays.copyOf(prices, 4));

        System.out.println(Arrays.toString(prices));

        Arrays.sort(name);
        for(String names: name){
            System.out.println(names);
        }

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        System.out.println(matrix[1][0]);
        for(int[] row: matrix){
            for(int array: row){
                System.out.println(array);
            }
        }
        for(int row=0; row < matrix.length; row++){
            for(int col=0; col<matrix.length; col++){
                System.out.println(matrix[row][col]);
            }
        }


    }
}
