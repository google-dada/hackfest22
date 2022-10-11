import java.util.Scanner;

public class menu{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    char ch = 'y';

    while(ch =='y'){

        System.out.println("1: To find the Area of Circle");
        System.out.println("2: To find the Area of Rectangle");
        System.out.println("3: To find the Area of Triangle");

        System.out.print("Enter your Choice: ");
        int n = sc.nextInt();

        switch(n){
                //added cases for switch

            case 1 :
                System.out.print("Enter radius of the Circle: ");
                float r = sc.nextFloat();
                float arC = 3.14f*r*r;
                System.out.printf("Area of the circle is = %f\n", arC);
                break;

            case 2:
                System.out.print("Enter Length of the Rectangle: ");
                float l = sc.nextFloat();
                System.out.print("Enter Breadth of the Rectangle: ");
                float b = sc.nextFloat();
                float arR = l*b;
                System.out.printf("Area of the Rectangle is = %f\n", arR);
                break;


            case 3:
                System.out.print("Enter Height of the Triangle: ");
                float h = sc.nextFloat();
                System.out.print("Enter Base of the Triangle: ");
                float ba = sc.nextFloat();
                float arT = 0.5f*ba*h;
                System.out.printf("Area of the Triangle is = %f\n1", arT);
                break;


            default:
                System.out.println("Enter a valid choice!");
                break;

        }


       System.out.print("Do you want to continue(y/n): ");
       ch = sc.next().charAt(0);


    }

    }
}
