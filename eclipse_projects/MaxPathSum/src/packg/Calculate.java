package packg;

public class Calculate {
	public int getMaxSum(int[][] game,int linecount) {
		for(int r=linecount-2;r>=0;r--){
			for(int c=0;c<=r;c++){
				game[r][c]+=game[r+1][c]>game[r+1][c+1]?game[r+1][c]:game[r+1][c+1];
			}
		}
		return game[0][0];
	}
}
