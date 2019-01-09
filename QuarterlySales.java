package ch7pc6;

import java.util.Scanner;

/**
 * Michael Haugh 
 * CH7PC6 - Quarterly Sales 
 * Programming III - AP CS 
 * 1-8-19
 */

public class QuarterlySales {

    public static void main(String[] args) {
        //Declare a 2D array with 4 quarters (columns) and 6 divisions(rows)
        double[][] sales = new double[6][4];

        //Declare the scanner
        Scanner kb = new Scanner(System.in);

        //USER INPUT OF ALL SALES IN THE TWO DIMENSIONAL ARRAY
        //Iterates through each division
        for (int d = 0; d < sales.length; d++) {
            //Tells user to enter sales in each division
            System.out.println("Please enter the sales in Division "
                    + (d + 1));

            //Iterates through each quarter of each division to enter sales    
            for (int q = 0; q < sales[0].length; q++) {
                //Tells user to enter sales in each quarter
                System.out.println("Please enter Quarter " + (q + 1) + "'s sales.");
                //Places user input into the 2D array
                sales[d][q] = kb.nextDouble();
            }
        }

        //GENERATE A LIST OF THE SALES FIGURES BY DIVISION
        //Iterates through each division
        for (int d = 0; d < sales.length; d++) {
            //Iterates through each quarter
            for (int q = 0; q < sales[d].length; q++) {
                //Prints out the array
                System.out.print(sales[d][q] + "\t");
            }
            System.out.println("");
        }

        //CALCULATE THE TOTAL SALES FOR EACH QUARTER
        for (int q = 0; q < sales[0].length; q++) {
            double total = 0;
            for (int d = 0; d < sales.length; d++) {
                total += sales[d][q];
            }
            System.out.println("Total Sales For Quarter " + (q + 1) + "\t"
                    + "$" + total + "\n");
        }

        //CALCULATE THE AVERAGE SALES FOR ALL DIVISIONS
        //Declare the total and average variables
        double total = 0;
        double average = 0.0;
        //Iterates through each division
        for (int d = 0; d < sales.length; d++) {
            total = 0;
            //Iterates through each quarter
            for (int q = 0; q < sales[d].length; q++) {
                //Calculates total as the sum of the sales for each division
                total += sales[d][q];
            }
            //Calculates the average as the total divided by the length of the division
            average = (double) total / sales[d].length;
            //Prints the average sales for each division
            System.out.println("Average for Division " + (d + 1) + "\t" + "$" + average
                    + "\n");
        }

        //CALCULATE THE DIVISION WITH THE HIGHEST TOTAL SALES
        //declare the variables for the highest total sales and division number of the sales
        int topDivision = 0;
        double topTotal = 0;
        //calculate top total across divisions
        for (int d = 0; d < sales.length; d++) {
            //calculate total per division
            double tot = 0;
            for (int q = 0; q < sales[0].length; q++) {
                tot += sales[d][q];
            }
            //compare this division to the top division
            // if this division is higher, it is the new top.
            if (tot > topTotal) {
                topTotal = tot;
                topDivision = d;
            }
        }
        //print the division with the highest total sales number and the total sales
        System.out.println("The division with the highest sales is division "
                + (topDivision + 1) + " with total sales of $" + topTotal);

    }

}
