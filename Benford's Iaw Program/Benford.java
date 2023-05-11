// Benford's Law portion in Java
 
// Importations needed for the program to function
import java.util.Scanner;
//import java.lang.Math.*;
//import java.text.DecimalFormat;
import java.io.File;
import java.io.FileReader;

import org.jfree.chart.JfreeChart;


class BenfordsLaw{

    for(int i=0; i<5; i++){
        String varib =
    }
    public static String loadFile(){
        /*
        * Opens and reads the sales file for use later
        */
        String datafile = new File("sales.csv");
        Scanner fileReader = new Scanner(datafile);
        while(fileReader.hasNextLine()){
            String data = fileReader.nextLine();
            System.out.println(data);
        }


         
    }

    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);

        // The variables that the user uses to access the different parts of the program
    String userInput = "";
    String fileLoad = "1";
    String fileAnalyze = "2";
    String graphGeneration = "3";
    String exitCondition = "9";
    String all_percentages = "";
    String percentages = "";

    // Checks which number the user inputted and directa them to the correct function
    while (userInput != exitCondition){
        printMenu();
        userInput = reader.nextLine();

        if (userInput.equals(fileLoad)){
            String data = loadFile();
        } 

        else if(userInput.equals(fileAnalyze)){
            if(data.equals("")){
                System.out.println("You need to load the file first.");
            }
            else{
                all_percentages = analyzeFile(file);
            }
        }

        else if(userInput.equals(graphGeneration)){
            if(all_percentages.equals("")){
                System.out.println("You need to analyze the file first.");
            }
        }

        else{
            System.out.println("You need to input a valid option (A number from 1-9).");
        }

    }

        reader.close();
    }

    public static void printMenu(){ 
        /*
        * Displays a menu for the user. Lists the numbers the user needs 
        * to input to access the functions of the sales system.
        */
        System.out.println(/* Customer and Sales System\n
    1. Load Sales File\n
    2. Analyze File\n
    3. Generate Graph\n
    9. Quit\n
    Enter menu option (1-9) */);
    }


    public static int analyzeFile(){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;
        int length = 0;
        
        // For loops that analyze the file in order to obtain the first digits
        for (int line )

        double 1st_percent = Math.round(num1/length*100, 2)
        double 2nd_percent = Math.round(num2/length*100, 2)
        double 3rd_percent = Math.round(num3/length*100, 2)
        double 4th_percent = Math.round(num4/length*100, 2)
        double 5th_percent = Math.round(num5/length*100, 2)
        double 6th_percent = Math.round(num6/length*100, 2)
        double 7th_percent = Math.round(num7/length*100, 2)
        double 8th_percent = Math.round(num8/length*100, 2)
        double 9th_percent = Math.round(num9/length*100, 2)

        all_percentages = {1st_percent, 2nd_percent, 3rd_percent, 4th_percent, 5th_percent, 6th_percent, 7th_percent, 8th_percent, 9th_percent};
        
        // Benfor's Law application
        if 29 <= 1st_percent <= 32{
            println("1: " + 1st_percent + "2: " + 2nd_percent + "3: " + 3rd_percent + "4: " + 4th_percent + "5: " + 5th_percent + "6: " + 6th_percent + "7: " + 7th_percent + "8: " + 8th_percent + "9: " + 9th_percent)
            println("The data suggests that fraud did not occur.")
        }
        else{
            println("1: " + 1st_percent + "2: " + 2nd_percent + "3: " + 3rd_percent + "4: " + 4th_percent + "5: " + 5th_percent + "6: " + 6th_percent + "7: " + 7th_percent + "8: " + 8th_percent + "9: " + 9th_percent)
            println("The data suggest that there was fraud present.")
        }

        return all_percentages
    }
    
    
    public static void generateGraph(){
        // The x values that display which bar is which.
        String[] x_values = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // The y values that determine how high each bar is based on the percentages.
        String y_values = all_percentages
        String y_value1 = ("1 = " + String(y_values[0]) + "%");
        String y_value2 = "2 = " + str(y_values[1]) + "%"
        String y_value3 = "3 = " + str(y_values[2]) + "%"
        String y_value4 = "4 = " + str(y_values[3]) + "%"
        String y_value5 = "5 = " + str(y_values[4]) + "%"
        String y_value6 = "6 = " + str(y_values[5]) + "%"
        String y_value7 = "7 = " + str(y_values[6]) + "%"
        String y_value8 = "8 = " + str(y_values[7]) + "%"
        String y_value9 = "9 = " + str(y_values[8]) + "%"

        // Plots each bar on each x and y value accordingly.
        (x_values[0], y_values[0], color="red")
        (x_values[1], y_values[1], color="green")
        (x_values[2], y_values[2], color="blue")
        (x_values[3], y_values[3], color="orange")
        (x_values[4], y_values[4], color="yellow")
        (x_values[5], y_values[5], color="pink")
        (x_values[6], y_values[6], color="purple")
        (x_values[7], y_values[7], color="black")
        (x_values[8], y_values[8], color="brown")
    }
   
}



