package pack2;

public class PowerOfFour {

String isPowerOfFour(int n) {

    if(n == 0)

        return "no";

    else if(n==1)

        return "yes";

    while(n > 1) {

        if(n % 4 != 0)

            return "no";

        n = n / 4;

    }

    return "yes";

}

}