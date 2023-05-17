// Benford's Law portion in Java

// Importations needed for the program to function
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;                



public class Benford{

    /**
     * Displays a menu for the user. Lists the numbers the user needs 
     * to input to access the methods of the sales system.
     */
    public static void printMenu(){ 
        System.out.println("Customer and Sales System");
        System.out.println("1. Analyze File");
        System.out.println("2. Generate Graph");
        System.out.println("9. Quit");
        System.out.println("Enter menu option (1-9)");
    }

    /**
     * Reads and analyzes the sales data file to gather information to determine whether or not it is fraud
     * 
     * @param csvFile The variable that locates the sales data file
     * @return returns all the percentages gathered from the file
     */
    public static double[] analyzeFile(String csvFile) {
        // Sets the delimiter
        String delimiter = ",";

        // Variables to be modified when analyzing the file
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
        char line_index;
        String str_line_index;

      try {
         File file = new File(csvFile);
         FileReader fread = new FileReader(file);
         BufferedReader buff = new BufferedReader(fread);
         String line = "";
         String[] tempArr;

         //Checks to see if there are more lines in the file, and if there is then reads and runs the calculations
         while((line = buff.readLine()) != null) {
            tempArr = line.split(delimiter);
            line_index = line.charAt(4);
            str_line_index = String.valueOf(line_index);
            for(String tempStr : tempArr) {
               System.out.print(tempStr + " ");
            }
            if ("1".equals(str_line_index)){
                num1 = num1 + 1;
                length = length + 1;
            }
            if ("2".equals(str_line_index)){
                num2 = num2 + 1;
                length = length + 1;
            }
            if ("3".equals(str_line_index)){
                num3 = num3 + 1;
                length = length + 1;
            }
            if ("4".equals(str_line_index)){
                num4 = num4 + 1;
                length = length + 1;
            }
            if ("5".equals(str_line_index)){
                num5 = num5 + 1;
                length = length + 1;
            }
            if ("6".equals(str_line_index)){
                num6 = num6 + 1;
                length = length + 1;
            }
            if ("7".equals(str_line_index)){
                num7 = num7 + 1;
                length = length + 1;
            }
            if ("8".equals(str_line_index)){
                num8 = num8 + 1;
                length = length + 1;
            }
            if ("9".equals(str_line_index)){
                num9 = num9 + 1;
                length = length + 1;
            }
            System.out.println();
         }
         buff.close();
        // Accounts for exceptions
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
        
        // Variables for each percentage, and calculates them using data from the file
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
        
        // All the percentages into one array
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
        
        // Returns all the percentages to the user and ends the methods
        return all_percentages;
   }
    
    /**
     * @param stage Sets the stage for the graph to be created on
     * @param all_percentages The values of all the percentages based on the file
     */
    public static void generateGraph(Stage stage, double[]all_percentages) throws Exception {
        // Variables for labeling the bars
        String one = "1";
        String two = "2";
        String three = "3";
        String four = "4";
        String five = "5";
        String six = "6";
        String seven = "7";
        String eight = "8";
        String nine = "9";

        // Sets the aethstetics for the chart
        stage.setTitle("Benford's Law Distribution Leading Digit");
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Benford's Law Distribution Leading Digit");
        xAxis.setLabel("Digit");       
        yAxis.setLabel("Percent");
        bc.setCategoryGap(1.0);
        
        // Writes the bar chart using the values given
        XYChart.Series bar1 = new XYChart.Series();
        bar1.setName("1 = " + all_percentages[0] + "%");      
        bar1.getData().add(new XYChart.Data(one, all_percentages[0]));

        XYChart.Series bar2 = new XYChart.Series();
        bar2.setName("2 = " + all_percentages[1] + "%");
        bar2.getData().add(new XYChart.Data(two, all_percentages[1]));

        XYChart.Series bar3 = new XYChart.Series();
        bar3.setName("3 = " + all_percentages[2] + "%");
        bar3.getData().add(new XYChart.Data(three, all_percentages[2]));
        
        XYChart.Series bar4 = new XYChart.Series();
        bar4.setName("4 = " + all_percentages[3] + "%");
        bar4.getData().add(new XYChart.Data(four, all_percentages[3]));
        
        XYChart.Series bar5 = new XYChart.Series();
        bar5.setName("5 = " + all_percentages[4] + "%");
        bar5.getData().add(new XYChart.Data(five, all_percentages[4]));
        
        XYChart.Series bar6 = new XYChart.Series();
        bar6.setName("6 = " + all_percentages[5] + "%");
        bar6.getData().add(new XYChart.Data(six, all_percentages[5]));   

        XYChart.Series bar7 = new XYChart.Series();
        bar7.setName("7 = " + all_percentages[6] + "%");
        bar7.getData().add(new XYChart.Data(seven, all_percentages[6]));  

        XYChart.Series bar8 = new XYChart.Series();
        bar8.setName("8 = " + all_percentages[7] + "%");
        bar8.getData().add(new XYChart.Data(eight, all_percentages[7]));  

        XYChart.Series bar9 = new XYChart.Series();
        bar9.setName("9 = " + all_percentages[8] + "%");
        bar9.getData().add(new XYChart.Data(nine, all_percentages[8]));         
        
        Scene scene  = new Scene(bc,1000,1000);
        bc.getData().addAll(bar1, bar2, bar3, bar4, bar5, bar6, bar7, bar8, bar9);
        stage.setScene(scene);
        stage.show();
    }

    
    /**
     * 
     * Generates a graph with all the information provided by the sales data file
     * @param all_percentages
     */
    public static void generateFile(double[] all_percentages){
        // Writes the sales data onto the results csv file
        String table = ("1" + "," + "2" + "," + "3" + "," + "4" + "," + "5" + "," + "6" + "," + "7" + "," + "8" + "," + "9\n" + (all_percentages[0]) + "," + (all_percentages[1]) + "," + (all_percentages[2]) + "," + (all_percentages[3]) + "," + (all_percentages[4]) + "," + (all_percentages[5]) + "," + (all_percentages[6]) + "," + (all_percentages[7]) + "," + (all_percentages[8]));
        try {
            File CSVFile = new File("Results.csv");
            if (CSVFile.createNewFile()) {
              System.out.println("File created: " + CSVFile.getName());
              FileWriter writer = new FileWriter("Results.csv");
              writer.write(table);
              writer.close();
            } else {
              System.out.println("File already exists.");
            }
    // Accounts for exceptions
    } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    } 

    /**
     * Runs the methods above in accordance to what the user inputs
     * 
     * @param args stores the variables
     */
    public static void main(String[]args){
        // Defines variables for all methods to use
        Scanner reader = new Scanner(System.in);
        String file = "sales.csv";
        double [] all_percentages = {};

        // The variables that the user uses to access the different parts of the program
        String userInput = "";
        String fileAnalyze = "1";
        String graphGeneration = "2";
        String exitCondition = "9";

    // Checks which number the user inputted and directs them to the correct method
    while (userInput != exitCondition){
        printMenu();
        userInput = reader.nextLine();


        if(userInput.equals(fileAnalyze)){
            analyzeFile(file);
            
        }

        else if(userInput.equals(graphGeneration)){
            if(all_percentages == null){
                System.out.println("You need to analyze the file first.");
            }
            else{
                Application.launch(args);
                generateFile(all_percentages);
            }
        }

        else{
            System.out.println("You need to input a valid option (A number from 1-9).");
        }

    }

    // Ends the program
    System.out.println("Program terminated");
    reader.close();
    }
   
}




