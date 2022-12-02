import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    static List<List<String>> resList;

    public static void main(String[] args) {

        System.out.println(solveNQueens(8));

    }

    public static List<List<String>> solveNQueens(int n) {


        resList = new ArrayList<List<String>>();
        int [] presetPosOfQueens = new int [n];
        Arrays.fill(presetPosOfQueens, -1);

        for (int i = 0; i < n; i++) {
            presetPosOfQueens[0] = i;
            //System.out.println("sending out with queen placed at: " + i);
            solveForQueens(presetPosOfQueens, 0, n);
            presetPosOfQueens[0] = -1;
        }

        System.out.println(resList.size());
        return resList;

    }

    public static void solveForQueens(int [] presetPos, int num, int size){
        //System.out.println("num: " + num + " Queen placed at: " + presetPos[num-1]);
        if (num == size-1) {
            //convert presetPos array to List of Strings
            // presetPos is 1D array where x coordinate is index
            List<String> oneSolution = new ArrayList<String>();
            for (int i = 0; i < size; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0 ; j < presetPos.length; j++) {
                    if (presetPos[j]==i) sb.append("Q");
                    else sb.append("#");
                }
                oneSolution.add(sb.toString()); // added current board position as list of Strings
            }
            resList.add(oneSolution); //adding the solution to the global result list
            return;
        }
        //int [] currPos = Arrays.copyOf(presetPos, presetPos.length);
        for (int y = 0; y < size; y++) {
            if (!isAttacked(presetPos, num, y)) {
                presetPos[num+1] = y;
                solveForQueens (Arrays.copyOf(presetPos, presetPos.length), num+1, size);
                presetPos[num+1] = -1;
            }
        }

        return;
    }

    private static boolean isAttacked(int[] presetPos, int setX, int newY) {
        int newX = setX + 1; // we are adding a queen at the next x coordinate
        for (int x = 0; x <= setX; x++) {
            if (presetPos[x] == newY) return true; //if newY is at the same height as any other Queen on the board, then it is being attacked
            if ( newY == (newX + presetPos[x] - x) || newY == (0 -newX + presetPos[x] + x) ) return true;
            //above condition checks if current coordinates of the queen (newX, newY) fall on the line
            // of slope 1 or -1 connecting points of existing queens
        }
        return false;
    }


}