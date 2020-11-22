package com.hackerRank.ProblemSolving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    



public class DiagoanlDifference {
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
			int rightDiagonal=0;
			int leftDiagonal=0;
	        for(int i=0,j=0;i<arr.size();)
	        {
	            if(i==j)
	            	rightDiagonal+=arr.get(i).get(j);
	            	leftDiagonal+=arr.get(i).get((arr.size()-1)-j);
	            i++;
	            j++;
	        }
			return rightDiagonal>leftDiagonal?(rightDiagonal-leftDiagonal):(leftDiagonal-rightDiagonal);
	    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);
        System.out.println(result);
       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
