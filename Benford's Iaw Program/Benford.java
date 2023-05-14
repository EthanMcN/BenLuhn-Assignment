// Benford's Law portion in Java

// Importations needed for the program to function
import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.util.Scanner;
import java.util.function.*;
import java.lang.Math.*;
import java.text.DecimalFormat;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.awt.Color;
import java.io.IOException;

class BenfordsLaw{

    public static String[] loadFile(){
        /**
         * Opens and reads the sales file for use late
         * 
         * @delimiter   Sets the delimiter for the file reading
         */
        
         BufferedReader reader;
      
        try {
            reader = new BufferedReader(new FileReader("sales.csv"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();

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


    public static double[] analyzeFile(){
        double num1 = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;
        double num4 = 0.0;
        double num5 = 0.0;
        double num6 = 0.0;
        double num7 = 0.0;
        double num8 = 0.0;
        double num9 = 0.0;
        double length = 0.0;
        
        BufferedReader reader;
        String line = reader.readLine();
        int filenum = 0;
      
        try {
            reader = new BufferedReader(new FileReader("sales.csv"));
            line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
        // For loops that analyze the file in order to obtain the first digits
        for (int i=0; i<filenum; i++){
            if ("1".equals(line(4))){
                num1 = num1 + 1;
                length = length + 1;
            }
            if ("2" in line[4]){
                num2 = num2 + 1;
                length = length + 1;
            }
            if ("3" in line[4]){
                num3 = num3 + 1;
                length = length + 1;
            }
            if ("4" in line[4]){
                num4 = num4 + 1;
                length = length + 1;
            }
            if ("5" in line[4]){
                num5 = num5 + 1;
                length = length + 1;
            }
            if ("6" in line[4]){
                num6 = num6 + 1;
                length = length + 1;
            }
            if ("7" in line[4]){
                num7 = num7 + 1;
                length = length + 1;
            }
            if ("8" in line[4]){
                num8 = num8 + 1;
                length = length + 1;
            }
            if ("9" in line[4]){
                num9 = num9 + 1;
                length = length + 1;
            }

        }

        double first_percent = (num1/length*100);
        double second_percent = (num2/length*100);
        double third_percent = (num3/length*100);
        double fourth_percent = (num4/length*100);
        double fifth_percent = (num5/length*100);
        double sixth_percent = (num6/length*100);
        double seventh_percent = (num7/length*100);
        double eighth_percent = (num8/length*100);
        double ninth_percent = (num9/length*100);

        first_percent = Math.round(first_percent);
        second_percent = Math.round(second_percent);
        third_percent = Math.round(third_percent);
        fourth_percent = Math.round(fourth_percent);
        fifth_percent = Math.round(fifth_percent);
        sixth_percent = Math.round(sixth_percent);
        seventh_percent = Math.round(seventh_percent);
        eighth_percent = Math.round(eighth_percent);
        ninth_percent = Math.round(ninth_percent);

        double[] all_percentages = {first_percent, second_percent, third_percent, fourth_percent, fifth_percent, sixth_percent, seventh_percent, eighth_percent, ninth_percent};
        
        // Benford's Law application
        if ((first_percent >= 29) && (first_percent <= 32)){
            System.out.println("1: " + first_percent + "2: " + second_percent + "3: " + third_percent + "4: " + fourth_percent + "5: " + fifth_percent + "6: " + sixth_percent + "7: " + seventh_percent + "8: " + eighth_percent + "9: " + ninth_percent);
            System.out.println("The data suggests that fraud did not occur.");
        }
        else{
            System.out.println("1: " + first_percent + "2: " + second_percent + "3: " + third_percent + "4: " + fourth_percent + "5: " + fifth_percent + "6: " + sixth_percent + "7: " + seventh_percent + "8: " + eighth_percent + "9: " + ninth_percent);
            System.out.println("The data suggest that there was fraud present.");
        }

        return all_percentages;
    }
    
    
    /**
     * 
     * Generates a graph with all the information provided by the sales data file
     * @param all_percentages
     */
    public static void generateGraph(double[] all_percentages){
        /**
         * Generates a graph with all the information provided by the sales data file
         * 
         * @param all
         */
        // The x values that display which bar is which.
        String[] x_values = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // The y values that determine how high each bar is based on the percentages.
        String[] y_values = {Double.toString(all_percentages[0]), Double.toString(all_percentages[1]), Double.toString(all_percentages[2]), Double.toString(all_percentages[3]), Double.toString(all_percentages[4]), Double.toString(all_percentages[5]), Double.toString(all_percentages[6]), Double.toString(all_percentages[7]), Double.toString(all_percentages[8])};
        String y_value1 = ("1 = " + (y_values[0]) + "%");
        String y_value2 = "2 = " + (y_values[1]) + "%";
        String y_value3 = "3 = " + (y_values[2]) + "%";
        String y_value4 = "4 = " + (y_values[3]) + "%";
        String y_value5 = "5 = " + (y_values[4]) + "%";
        String y_value6 = "6 = " + (y_values[5]) + "%";
        String y_value7 = "7 = " + (y_values[6]) + "%";
        String y_value8 = "8 = " + (y_values[7]) + "%";
        String y_value9 = "9 = " + (y_values[8]) + "%";

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
        File CSVFile = new File("Results.csv")
        try {
            File myObj = new File("Results.csv");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
              FileWriter writer = new FileWriter("Results.csv");
              writer.write(table);
              writer.close();
            } else {
              System.out.println("File already exists.");
            }
    } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
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
        System.out.println("Program terminated");
        reader.close();
    }
   
}






