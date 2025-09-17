import java.util.LinkedHashMap;
import java.util.Scanner;
class Program4{
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements");
        //input for size of numbers array
        int n=scanner.nextInt();
        int [] numbers=new int[n];
        for(int i=0;i<n;i++){
            //adding each element in array
            numbers[i]=scanner.nextInt();
        }
        for(int i=1;i<=9;i++){
            int count=0;
            for(int j=0;j<numbers.length;j++){
                //if num is divisible increment the count
                if(numbers[j]%i==0){
                    count++;
                }

            }
            //after inner loop put the i and count in map
            map.put(i,count);

        }
        //print the res map
        System.out.println(map);
        scanner.close();

    }

}