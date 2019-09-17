package helloWorld;

import java.util.Scanner;
import java.io.*;

public class initial
{
    public static void main(String[] input)
    {
        String fname;
        Scanner scan = new Scanner(System.in);
        
        /* enter filename with extension to open and read its content */
        
        System.out.print("Enter File Name to Open (with extension like file.txt) : ");
        fname = scan.nextLine();
        
        /* this will reference only one line at a time */
        
        String line = null;
        try
        {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader(fname);
            
            /* always wrap the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int[] linenumberarr = new int[25];
            int counter = 0;
            int linenumber = 1;
            while((line = bufferedReader.readLine()) != null)
            {
            	if(line.contains("f8")) {
            		System.out.println(linenumber);
            		linenumber -= 1;
            		linenumberarr[counter] = linenumber;
            		linenumber += 1;
            		linenumberarr[counter] = linenumber;
            		linenumber += 1;
            		linenumberarr[counter] = linenumber;
            		linenumber -= 1;
            	}
            	
            	linenumber += 1;
            }
            
            /* always close the file after use */
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}