package pack7;

public class FactorialClass {
    public long calculateFactorial(int number){
        if(number>20)
            return -1;

        long  i;
        long fact=1;
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        return fact;

}
}
