// Luhn's algorithm in java
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


class BenLuhn{

    public static void printMenu() {
        System.out.println("\nCustomer and Sales System\n");
        System.out.println("1. Enter Customer Information");
        System.out.println("2. Generate Customer data file");
        System.out.println("3. Report on total Sales ");
        System.out.println("4. Check for fraud in sales data");
        System.out.println("9. Quit");
        System.out.println("Enter menu option (1-9)");
    }

    public static void enterCustomerInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter customer information");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("City name: ");
        String city = scanner.nextLine();
        String postalCode = scanner.nextLine().substring(0, 3);
        /*String firstThreeChars = "";
        if (postalCode.length()>4){
            firstThreeChars = postalCode.substring(0,3);

        }else{
            firstThreeChars = postalCode;
        }*/
        if (validatePostalCode(postalCode)) {
            
        } else {
            
        }
        scanner.close();
    }

    public static boolean validatePostalCode(String firstThreeChars) {
        try (Scanner sc = new Scanner(new FileReader("postal_codes.csv"))) {
            sc.useDelimiter("|");
            String line;
            while ((line = sc.nextLine()) != null) {
        
                String[] fields = line.split("\\|");
                if (fields[0].equals(firstThreeChars)) {
                    System.out.println("Valid postal code");
                    return true;
                }else{
                    return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;}

    public static void validateCreditCard(){
        int sum1 = 0;
        int sum2 = 0;
        int sum_total = 0;
        
        // Reverses the card number that the user has entered
        String cardnum = "1234567890";      

        String reversednum = cardnum;
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(reversednum);
 
        // reverse StringBuilder input1
        input1.reverse();

        // Odd Digits
        for (int i = 0; i < String.valueOf(reversednum).length(); i+=2){
            int oddNumber = (reversednum.charAt(i));
            sum1 += oddNumber;
        }

        // Even Digits
        for (int i = 1; i < String.valueOf(reversednum).length(); i+=2) {
            int evenNumber = (String.valueOf(reversednum).charAt(i)) * 2;
            if (evenNumber > 9) {
                evenNumber -= 9;
            }
            sum2 += evenNumber;
        }

        // Gathering Total Sum
        sum_total = sum1 + sum2;
        if (sum_total%10 == 0){
            System.out.println("Valid Credit Card.");
        }
        else{
            System.out.println("Invalid Credit Card.");
        }
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
        String line;
      
        try {
            reader = new BufferedReader(new FileReader("sales.csv"));
            line = reader.readLine();
            char line_index;
            String str_line_index;

            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
                line_index = line.charAt(4);
                str_line_index = String.valueOf(line_index);

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
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
        // For loops that analyze the file in order to obtain the first digits

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
     * @param stage Sets the stage for the graph to be created on
     * @param all_percentages The values of all the percentages based on the file
     */
    public static void generateGraph(Stage stage, Double[] all_percentages){
        /**
         * @stage Sets the stage for the bar graph to be put on
         * @param all_percentages the values of all the percentages gathered from the file
         */
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        stage.setTitle("Benford's Law Chart");
        xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(

"Percentage"))); 
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        new BarChart<String,Number>(xAxis,yAxis);
        barChart.setTitle("Benford's Law Distribution Leading Digit");
        xAxis.setLabel("Digit");       
        yAxis.setLabel("Percent");
        XYChart.Series<String, Number> bar1 = new XYChart.Series<>(); 
        bar1.setName("1");
        bar1.getData().add(new XYChart.Data<>("Digit", all_percentages[0], Color.red));
        XYChart.Series<String, Number> bar2 = new XYChart.Series<>(); 
        bar2.setName("2");
        bar2.getData().add(new XYChart.Data<>("Digit", all_percentages[1], Color.orange));
        XYChart.Series<String, Number> bar3 = new XYChart.Series<>(); 
        bar3.setName("3");
        bar3.getData().add(new XYChart.Data<>("Digit", all_percentages[2], Color.yellow));
        XYChart.Series<String, Number> bar4 = new XYChart.Series<>(); 
        bar4.setName("4");
        bar4.getData().add(new XYChart.Data<>("Digit", all_percentages[3], Color.green));
        XYChart.Series<String, Number> bar5 = new XYChart.Series<>(); 
        bar5.setName("5");
        bar5.getData().add(new XYChart.Data<>("Digit", all_percentages[4], Color.cyan));
        XYChart.Series<String, Number> bar6 = new XYChart.Series<>(); 
        bar6.setName("6");
        bar6.getData().add(new XYChart.Data<>("Digit", all_percentages[5], Color.blue));
        XYChart.Series<String, Number> bar7 = new XYChart.Series<>(); 
        bar7.setName("7");
        bar7.getData().add(new XYChart.Data<>("Digit", all_percentages[6], Color.magenta));
        XYChart.Series<String, Number> bar8 = new XYChart.Series<>(); 
        bar8.setName("8");
        bar8.getData().add(new XYChart.Data<>("Digit", all_percentages[7], Color.pink));
        XYChart.Series<String, Number> bar9 = new XYChart.Series<>(); 
        bar9.setName("9");
        bar9.getData().add(new XYChart.Data<>("Digit", all_percentages[8], Color.black));
        
        //Finalizes the graph
        barChart.getData().addAll(bar1, bar2, bar3, bar4, bar5, bar6, bar7, bar8, bar9);
        Group root = new Group(barChart);
        Scene scene = new Scene(root ,600, 300);
        stage.setScene(scene);
        stage.show();

    }
    /**
     * 
     * Generates a graph with all the information provided by the sales data file
     * @param all_percentages
     */
    public static void generateFile(double[] all_percentages){
        /**
         * Generates a graph with all the information provided by the sales data file
         * 
         * @param all
         */

        // Plots each bar on each x and y value accordingly.

        // Labels the x axis, y axis, creates a legend, gives the graph a title, and shows the graph    

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
    } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    public static void main(String[] args) {
        String enterCustomerOption = "1";
        String generateCustomerOption = "2";
        String exitCondition = "9";
        String userInput = "";
        String fileAnalyze = "3";
        String graphGeneration = "4";
        String all_percentages = "";

        while (!userInput.equals(exitCondition)) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine();
            if (userInput.equals(enterCustomerOption)) {
                enterCustomerInfo();
            //} else if (userInput.equals(generateCustomerOption)) {
                // call generate customer data file method here
            } else if (userInput.equals("3")) {
                // report on total sales method here
            } else if (userInput.equals("4")) {
                // check for fraud in sales data method here
            } else if (!userInput.equals(exitCondition)) {
                System.out.println("Invalid option. Please choose again.");
            }
            else if(userInput.equals(fileAnalyze)){
                analyzeFile();
                
            }
    
            else if(userInput.equals(graphGeneration)){
                if(all_percentages.equals("")){
                    System.out.println("You need to analyze the file first.");
                }
                else{
                    generateGraph(null, null);
                    generateFile(null);
                }
            }
    
            else{
                System.out.println("You need to input a valid option (A number from 1-9).");
            }
            
        }

        System.out.println("Program Terminated");
    } 
}

