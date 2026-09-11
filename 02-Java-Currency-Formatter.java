import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        double payment = 12324.134;

        java.text.NumberFormat us = java.text.NumberFormat.getCurrencyInstance(Locale.US);
        java.text.NumberFormat india = java.text.NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        java.text.NumberFormat uk = java.text.NumberFormat.getCurrencyInstance(Locale.UK);
        java.text.NumberFormat china = java.text.NumberFormat.getCurrencyInstance(Locale.CHINA);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("UK: " + uk.format(payment));
        System.out.println("China: " + china.format(payment));
    }
}
