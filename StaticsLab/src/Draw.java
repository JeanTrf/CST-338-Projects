import java.util.Scanner;

/**
 * Author: Jean Troffer-Charlier
 * Date: 02/13/19
 * Purpose: Draws squares and triangles of stars
 */
public class Draw {
    public static void main(String[] args){
        // initialize a scanner object
        Scanner scan = new Scanner(System.in);
        int size = 1;

        while(size >= 0){

            System.out.print("How many stars? (-1 to quit) :");
            //Use a scanner to read in values from the user
            size = scan.nextInt();
            Draw.square(size);
            Draw.triangle(size);

        }
    }//end main

    /**
     * square
     * @param size
     *
     * square takes an int, size, and draws a
     * square on the screen i.e.
     * 3 ==
     *      * * *
     *      * * *
     *      * * *
     */
//start the static method here
    public static void square(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(j < size -1){
                    System.out.print("* ");
                }
                else{
                    System.out.println("*");
                }
            }
        }
    }

    /**
     * triangle
     * @param size
     * Takes an int, size, and returns a triangle with side
     * length == size. The side is on the left i.e.
     *  3 ==     *
     *         * *
     *       * * *
     */
// start the static method here.
    public static void triangle(int size){
        for(int i = size-1; i >= 0; i--){
            for(int j = 0; j < size; j++){
                if(j < i){
                    System.out.print("  ");
                }
                else if(j < size-1){
                    System.out.print("* ");
                }
                else{
                    System.out.println("*");
                }
            }
        }
    }
}
