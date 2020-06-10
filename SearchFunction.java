import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import oop1movie_search.*;

public class SearchFunction{

    public static String[][] main(String input, int searchType2) throws FileNotFoundException {
        
        int i = 0;
        int counter = 0;
        String[][] dataBase = new String[4444444][3];
        ArrayList<String> selected = new ArrayList<String>();
        int searchType = searchType2;
        String searchString = input;

        Scanner scanner = new Scanner(new File("movie_directors_export.csv"));
         
        //Set the delimiter used in file
        scanner.useDelimiter(",");

        //I am just printing them
        while (scanner.hasNext()) 
        {
            for (counter=0;counter<3;counter++){
                dataBase[i][counter]=scanner.next();
            }
            i++;
        }

        scanner.close();
        
        
        
        System.out.println(dataBase[3][2]);

        //call input_output function

        //put input into parameters for search

        //return the results for the user in input_output

        return dataBase;
    }

    private static void searchAlgo(String[][] dataBase, ArrayList<String> selected, int searchType) {


    }
}