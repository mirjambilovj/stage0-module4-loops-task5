package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int num = 8;
        for (int i=0; i<cathetusLength; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
