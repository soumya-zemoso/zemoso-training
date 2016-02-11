package packg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxPathSum {
	public static void main(String a[]) throws IOException {
        int game[][] = new int[100][100];
        int r=0;
        int sum=0;
        BufferedReader in = new BufferedReader(new FileReader("src/triangle.txt"));
        String line = null;
        while((line=in.readLine()) !=null) {
        //	System.out.println(" "+line);
                String [] tokens = line.split(" ");
                for (int j=0; j<tokens.length; j++) {
                   game[r][j] = Integer.parseInt(tokens[j]);
                    //System.out.print(" "+ game[r][j]);
                }
                r++;
        }
        Calculate c=new Calculate();
        System.out.println("Answer="+c.getMaxSum(game,r));
        in.close();
	}
}
