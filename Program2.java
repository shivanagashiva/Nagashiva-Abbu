import java.util.Scanner;
class Program2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //take input
        int a=scanner.nextInt();
        if(a<=0){
           System.out.println("enter a positive number"); //edge case for negative numbers
        }
        int odd=1;
        int count=0;
       while(count<a){
        //print odd and add +2 to it
        System.out.print(odd+" ");
        odd+=2;
        count++;
       }
       scanner.close();       
    }

}