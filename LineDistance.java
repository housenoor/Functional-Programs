package functionalprgm;
import java.util.Scanner;

public class LineDistance {
	public static void main(String[] args) {
        //variable decleration
        int x1,x2,y1,y2;
        double distance;
        System.out.println("A program for Line Distanca computation");
        //Ask User To Enter The Values
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 value");
        x1=sc.nextInt();
        System.out.println("enter y1 value");
        y1=sc.nextInt();
        System.out.println("enter x2 value");
        x2=sc.nextInt();
        System.out.println("enter y2 value");
        y2=sc.nextInt();
        //Calculate The Distance Between values using the formula
        distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Distance Between"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is : " +distance);
    }
}