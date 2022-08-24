package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i=0; i<cathetusLength; i++){
            for (int j=0; j<cathetusLength*2; j++){
                if (i+j>=cathetusLength && j-i<=cathetusLength){
                    System.out.print(Math.abs(j-cathetusLength)+1);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
