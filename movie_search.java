import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class movie_search{
    //Hier kommt der Code von Ben rein
    public static void main(String[] args) throws FileNotFoundException {
        /*
        *   Tell User what the Application is for
        *   Get User Input
        */
        int i = 0;
        int counter = 0;
        String[][] x = new String[4444444][3];

        Scanner scanner = new Scanner(new File("movie_directors_export.csv"));
         
        //Set the delimiter used in file
        scanner.useDelimiter(",");

        //Get all tokens and store them in some data structure
        //I am just printing them
        while (scanner.hasNext()) 
        {
            for (counter=0;counter<3;counter++){
                x[i][counter]=scanner.next();
            }
            i++;
        }
        
        //Do not forget to close the scanner  
        scanner.close();
        System.out.println(x[3][2]);
        //call input_output function

        //put input into parameters for search

        //return the results for the user in input_output
    }
}