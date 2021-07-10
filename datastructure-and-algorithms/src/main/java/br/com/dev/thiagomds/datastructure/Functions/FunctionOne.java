package br.com.dev.thiagomds.datastructure.Functions;

public class FunctionOne {
// One Step + N
// Big O = O(N)

    public int sum ( int number ){
        int sum = 0;

        for ( int i = 0; i <= number; i++ ) {
            sum += i;
        }
        return sum;
    }
}
