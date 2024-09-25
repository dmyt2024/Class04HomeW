package app;

public class Solution {


                //PRODUCT №1:

    public static void main(String[]args){


    String prodNumber = "Product №";
    byte prodNum = 1;
    String prodName = "smartphone";
    String totSalesFor = "total sales for";
    int daysSum = 5;
    String daysIs = "days is";
    String currancy = "EUR";
    double totalPrice = 12153.41;
    String salesBy = "sales by day is";
    double dayPrice = totalPrice/daysSum;


    System.out.printf("%s %d: %s,\n%s %d %s %s %.2f,\n%s %s %.2f.\n",
            prodNumber, prodNum, prodName, totSalesFor, daysSum, daysIs,
            currancy, totalPrice, salesBy, currancy, dayPrice);


                 //PRODUCT №2:

        prodNum = 2;
        prodName = "laptop";
        daysSum = 7;
        totalPrice = 10486.85;
        dayPrice = totalPrice/daysSum;

        System.out.printf("%s %d: %s,\n%s %d %s %s %.2f,\n%s %s %.2f.\n ",
                prodNumber, prodNum, prodName, totSalesFor, daysSum, daysIs,
                currancy, totalPrice, salesBy, currancy, dayPrice);






    }
}
