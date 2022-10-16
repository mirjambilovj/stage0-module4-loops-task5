package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int num = 8;
        for (int i=1; i<=sideLength; i++) {
            for (int j=1; j<=sideLength; j++) {
                if ((sideLength+1)/2==i || (sideLength+1)/2==j) {
                    System.out.print(num);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
