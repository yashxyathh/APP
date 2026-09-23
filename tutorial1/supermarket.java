import java.io.PrintStream;
import java.util.Scanner;

public class supermarket {
public supermarket() {
}

public static void main(String[] var0) {
Scanner var1 = new Scanner(System.in);
System.out.println("Enter the price of first product : ");
int var2 = var1.nextInt();
System.out.println("Enter the price of second product : ");
int var3 = var1.nextInt();
System.out.println("Enter the % discount : ");
float var4 = var1.nextFloat();
double var5 = (double)(var2 + var3);
double var7 = var5 * (double)var4 / (double)100.0F;
double var9 = (var5 - var7) * 0.18;
System.out.println("Total of the two products is : " + var5);
System.out.println();
System.out.println("Discount on total is " + var5 + " * " +
var4 + "% that is : " + String.format("%.2f", var7));
System.out.println();
double var11 = (var5 - var7) + var9;
System.out.println("Tax on discounted total is : " + String.format("%.2f", var9));
System.out.println("Price after taxes is : " + String.format("%.2f", var11));
System.out.println();
PrintStream var10000 = System.out;
String var10001 = String.format("%.2f", var11 / (double)3.0F);
var10000.print("Dividing the bill between 3 guys, share of each is : " + var10001
+ " and the remainder is : " + String.format("%.2f", var11 % (double)3.0F));
var1.close();
}
}