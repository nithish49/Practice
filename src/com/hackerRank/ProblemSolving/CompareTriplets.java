package com.hackerRank.ProblemSolving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTriplets {
	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	int alice=0;
    	int bob=0;
    	for(int i=0;i<a.size();i++)
    	{
    		if(a.get(i)>b.get(i))
    			alice++;
    		else if(a.get(i)<b.get(i))
    			bob++;
    		else
    			continue;
    	}
    	String res=""+alice+" "+bob;
    	 return Stream.of(res.replaceAll("\\s+$", "").split(" "))
    	            .map(Integer::parseInt)
    	            .collect(toList());
    	 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);
		/*
		 * bufferedWriter.write( result.stream() .map(Object::toString)
		 * .collect(joining(" ")) + "\n" );
		 */
        bufferedReader.close();
     //   bufferedWriter.close();
    }
}
