public class BellNumber {
    public static void main( String[] args ) {
        int LevelNumber = 25;
        long[][] BellArray = new long[LevelNumber][LevelNumber];
        BellArray[0][0] = 1;
        
        int x, y;
        for (x = 1; x < LevelNumber; x++){
            for (y = 0; y <= x; y++) {
                if (y == 0)
                    BellArray[x][y] = BellArray[x-1][x-1];
                else
                    BellArray[x][y] = BellArray[x][y-1] + BellArray[x-1][y-1];
            }
        }

        System.out.println("B(" + (LevelNumber - 1) + ") = " + BellArray[LevelNumber - 1][0]);
    }
}
