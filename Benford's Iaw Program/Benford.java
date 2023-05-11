// Benford's Law portion in Java
 
// Importations needed for the program to function
import java.util.Scanner;
import java.util.function.*;
import java.lang.Math.*;
import java.text.DecimalFormat;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import org.jfree.chart.JfreeChart;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


class BenfordsLaw{

    public static String loadFile(String csvFile){
        /*
        * Opens and reads the sales file for use later
        */
        File datafile = new File("sales.csv");
        BufferedReader fileReader = new Scanner(datafile);
        fileReader.useDelimiter(",");
        while(fileReader.hasNextLine()){
            String data = fileReader.nextLine();
            System.out.println(data);
        }
         
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
        for (int line in file){
            if "1" 
        }

        double first_percent = Math.round(num1/length*100, 2);
        double second_percent = Math.round(num2/length*100, 2);
        double third_percent = Math.round(num3/length*100, 2);
        double fourth_percent = Math.round(num4/length*100, 2);
        double fifth_percent = Math.round(num5/length*100, 2);
        double sixth_percent = Math.round(num6/length*100, 2);
        double seventh_percent = Math.round(num7/length*100, 2);
        double eighth_percent = Math.round(num8/length*100, 2);
        double ninth_percent = Math.round(num9/length*100, 2);

        double[] all_percentages = {first_percent, second_percent, third_percent, fourth_percent, fifth_percent, sixth_percent, seventh_percent, eighth_percent, ninth_percent};
        
        // Benford's Law application
        if (29 <= first_percent <= 32){
            println("1: " + first_percent + "2: " + second_percent + "3: " + third_percent + "4: " + fourth_percent + "5: " + fifth_percent + "6: " + sixth_percent + "7: " + seventh_percent + "8: " + eighth_percent + "9: " + ninth_percent);
            println("The data suggests that fraud did not occur.");
        }
        else{
            println("1: " + first_percent + "2: " + second_percent + "3: " + third_percent + "4: " + fourth_percent + "5: " + fifth_percent + "6: " + sixth_percent + "7: " + seventh_percent + "8: " + eighth_percent + "9: " + ninth_percent);
            println("The data suggest that there was fraud present.");
        }

        return all_percentages;
    }
    
    
    public static void generateGraph(double[] all_percentages){
        // The x values that display which bar is which.
        String[] x_values = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // The y values that determine how high each bar is based on the percentages.
        String y_values = all_percentages;
        String y_value1 = ("1 = " + String(y_values[0]) + "%");
        String y_value2 = "2 = " + str(y_values[1]) + "%";
        String y_value3 = "3 = " + str(y_values[2]) + "%";
        String y_value4 = "4 = " + str(y_values[3]) + "%";
        String y_value5 = "5 = " + str(y_values[4]) + "%";
        String y_value6 = "6 = " + str(y_values[5]) + "%";
        String y_value7 = "7 = " + str(y_values[6]) + "%";
        String y_value8 = "8 = " + str(y_values[7]) + "%";
        String y_value9 = "9 = " + str(y_values[8]) + "%";

        // Plots each bar on each x and y value accordingly.
        (x_values[0], y_values[0], color="red");
        (x_values[1], y_values[1], color="green");
        (x_values[2], y_values[2], color="blue");
        (x_values[3], y_values[3], color="orange");
        (x_values[4], y_values[4], color="yellow");
        (x_values[5], y_values[5], color="pink");
        (x_values[6], y_values[6], color="purple");
        (x_values[7], y_values[7], color="black");
        (x_values[8], y_values[8], color="brown");

        // Labels the x axis, y axis, creates a legend, gives the graph a title, and shows the graph    
        title("Benford's Law Distribution Leading Digit")
        legend([y_value1, y_value2, y_value3, y_value4, y_value5, y_value6, y_value7, y_value8, y_value9], loc=0)
        xlabel("Digit")
        ylabel("Percent")
        show()
        close()

        // Writes the sales data onto the results csv file
        String table = "1" + "," + "2" + "," + "3" + "," + "4" + "," + "5", "," + "6" + "," + "7" + "," + "8" + "," + "9\n" + str(percentages[0]) + "," + str(percentages[1]) + "," + str(percentages[2]) + "," + str(percentages[3]) + "," + str(percentages[4]) + "," + str(percentages[5]) + "," + str(percentages[6]) + "," + str(percentages[7]) + "," + str(percentages[8])
        String result_fileName = "results.csv"
        result_file = open(result_fileName, "w")
        result_file.writelines(table)
        result_file.close()
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
   
}



