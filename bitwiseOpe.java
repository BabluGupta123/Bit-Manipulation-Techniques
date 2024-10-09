# Bit-Manipulation-Techniques
import java.util.*;

public class bitwiseOpe {
    public static void main(String[] args) {

        // 0. MY GURU MANTRA ----------------------------------------------

        // NOTE :: when bit manipulation question then
        // always think numbers in their Binary representation.

        // 1. Bitwise Not-----------------------------------------------------

        // a).

        // ~(x)= -(x+1); where x is positive or negative no.
        // ex.

        // ~5 = -(5+1)= -6;
        // ~(-6)= -(-6+1)= -(-5)= 5

        System.out.println("~ 5 = " + ~5);// -6

        System.out.println("~(-6) = " + ~(-6)); // 5

        // b).
        // Now how to calculate decimal value from binary representation of negative
        // number

        // well it is simple

        // let we have to find the decimal value of 1100 (consider 4 bit integers)

        // then msb that is one implies that the no. is negative

        // the decimal value = -8(negative bcz of msb is 1 ans 8 brcause 1000 in decial
        // is
        // equal to 8) + 4(100 in binary = 4 in decimal)= -4

        // 2. Bitwise OR -------------------------------------------------------

        // bitwise OR is simple

        // 0 | 0 = 0

        // 0 | 1 = 1

        // 1 | 0 = 1

        // 1 | 1 = 0

        // 3. Bitwise AND -----------------------------------------------------

        // bitwise AND is also simple

        // 0 | 0 = 0

        // 0 | 1 = 0

        // 1 | 0 = 0

        // 1 | 1 = 1

        // 4. Bitwise XOR ---------------------------------------------------

        // bitwise XOR is also simple

        // when same bits then 0 otherwise 1
        // OR change at end..

        // 0 | 0 = 0

        // 0 | 1 = 1

        // 1 | 0 = 1

        // 1 | 1 = 0

        // 5. Bitwise LeftShift ------------------------------------------------

        // 1110101<<2 == 1010100

        // a<<b == a* Math.pow(2, b);

        System.out.println("10<<3 = " + (10 << 3)); // 10*(2^3) ==80

        // 6. Bitwise RightShift ------------------------------------------------

        // a>>b => a right shifted by b

        // 1010111 >>2 == 0010101

        // a>>b == Math.floor( a/ Math.pow(2, b) )

        System.out.println("10 >>3 = " + (10 >> 3)); // 10/(2^3) == 1

    }

}
