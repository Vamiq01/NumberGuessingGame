import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Guess the Number between 1 to 100 within 5 trial");
	int number = (int) (Math.random()*100)+1;
    int trials =5;
    while(trials>0){
        System.out.println("Enter a Number ");
        int inputNumber = sc.nextInt();
        if(inputNumber==number){
            System.out.println("Guess is correct You won!!");
        }
        else if(inputNumber<number){
            System.out.println("Wrong Guess");
            System.out.println("Number is Greater " + inputNumber);
        
        }
        else{
            System.out.println("Wrong Guess");
            System.out.println("Number is less " + inputNumber);
            
        }
        trials--;
    }
    if(trials==0){
        System.out.println("You Lost " + number + " was correct");
    }

	}
}
