import java.util.Scanner;
import java.util.Arrays;
public class ArrayElection {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of candidates: ");
		int candidateNum = Integer.parseInt(input.nextLine());
		int [] numArr = new int [candidateNum];
		String name;
		int vote;
		String [] nameArr = new String [candidateNum];
		int [] voteArr = new int [candidateNum];
		for (int i = 0; i < numArr.length; i++) {
			System.out.print("Enter " + (i+1) + ". name: " );
			name = input.nextLine();
			nameArr[i] = name;
			System.out.print("Enter votes: ");
			vote = Integer.parseInt(input.nextLine());
			voteArr[i] = vote;
		}
		
		System.out.println("");
		int largestVote = voteArr[0];
		String winner = nameArr[0];
		int largestCount = 1;
		String result = "";
	    for(int i = 1; i < voteArr.length; i++){  
	        if(voteArr[i] > largestVote){  
	        	largestVote = voteArr[i];
	        	winner = nameArr[i];
	        }  else if (voteArr[i] == largestVote) {
	        	largestCount++;
	        	result += nameArr[i] + " (" + voteArr[i] + " votes)" + "\n";
	        }
	    }
	    if (largestCount == 1) { 
	    	System.out.println("The winner is " + winner + " with " + largestVote + " votes!");
	    } else { 
	    	System.out.println("The election is a tie between the following candidates:" + "\n" + winner + " (" + largestVote + " votes)" + "\n" + result);
	    }
	}
}
