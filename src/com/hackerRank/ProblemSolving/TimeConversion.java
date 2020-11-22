package com.hackerRank.ProblemSolving;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) throws ParseException  {
        /*
         * Write your code here.
         */
    	  //Date/time pattern of input date (12 Hours format - hh used for 12 hours)
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");

        //Date/time pattern of desired output date (24 Hours format HH - Used for 24 hours)
        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String output = null;

        //Returns Date object
        date = df.parse(s);

        //old date format to new date format
        output = outputformat.format(date);
        System.out.println(output);

        return output;
        


    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ParseException {
      //  BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

      //  bw.write(result);
      //  bw.newLine();

     //   bw.close();
    }
}
