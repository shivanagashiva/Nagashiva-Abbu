import java.util.Scanner;
class Program3{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        if(a<=0){
           System.out.println("enter a positive number"); //edge case for negative numbers
        }
        else{
            int count=0;
            int odd=1;
            int numberOfOddsToPrint=(a%2==0?a-1:a);//to handle even numbers it only prints n-1 odds for evens
            while(count<numberOfOddsToPrint){
                System.out.print(odd+" ");
                count++;
                odd+=2;
            }
        }
        scanner.close();



    }
}