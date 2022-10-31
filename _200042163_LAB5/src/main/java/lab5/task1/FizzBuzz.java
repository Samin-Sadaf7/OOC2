package lab5.task1;

public class FizzBuzz {
    public String getFizzBuzz(int number){
        if(number % 3==0 && number % 7==0){
            return "Fizzbuzz";
        }
        else if(number % 3==0){
            return  "Fizz";
        }
        else if(number % 7==0){
            return "Buzz";
        }
        else{
            return "Gotcha";
        }
    }
}
