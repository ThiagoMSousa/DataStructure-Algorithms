package br.com.dev.thiagomds.datastructure.NotationsBigO;

import br.com.dev.thiagomds.datastructure.Functions.FunctionFour;
import br.com.dev.thiagomds.datastructure.Functions.FunctionOne;
import br.com.dev.thiagomds.datastructure.Functions.FunctionTree;
import br.com.dev.thiagomds.datastructure.Functions.FunctionTwo;
import br.com.dev.thiagomds.datastructure.utils.List;
import br.com.dev.thiagomds.datastructure.utils.Print;
import br.com.dev.thiagomds.datastructure.utils.Timer;

import java.util.ArrayList;

public class NotationsBigOApplicationMain {

    public static void main(String[] args) {

        int number;
        ArrayList<Integer> list;

        System.out.println("....: EXAMPLES BIG O :...." );

        System.out.println("\n/****** CONSTANT - O(1) ******/");
        System.out.println( "Start: " + Timer.startTime() );
        Constant constant = new Constant();
        list = List.createList(1000);
        number = constant.constant(list);
        System.out.println( "Stop: " + Timer.stopTime() );
        Timer.diffTime();
        Print.print(number);

        System.out.println("\n/****** LINEAR - O(N) ******/");
        System.out.println( "Start: " + Timer.startTime() );
        Linear linear = new Linear();
        list = List.createList(1000);
        number = linear.linear(list, 4);
        System.out.println( "Stop: " + Timer.stopTime() );
        Timer.diffTime();
        Print.print(number);

        System.out.println("\n/****** QUADRATIC O(N^2) ******/");
        System.out.println( "Start: " + Timer.startTime() );
        Quadratic quadratic = new Quadratic();
        list = List.createList(1000);
        number = quadratic.quadratic(list);
        System.out.println( "Stop: " + Timer.stopTime() );
        Timer.diffTime();
        Print.print(number);

    }
}
