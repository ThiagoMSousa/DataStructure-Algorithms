package br.com.dev.thiagomds.datastructure.Functions;

import br.com.dev.thiagomds.datastructure.NotationsBigO.Constant;
import br.com.dev.thiagomds.datastructure.NotationsBigO.Linear;
import br.com.dev.thiagomds.datastructure.NotationsBigO.Quadratic;
import br.com.dev.thiagomds.datastructure.utils.List;
import br.com.dev.thiagomds.datastructure.utils.Print;
import br.com.dev.thiagomds.datastructure.utils.Timer;

import java.util.ArrayList;

public class FunctionsApplicationMain {

    public static void main(String[] args) {

        int vector[];
        ArrayList<Integer> list;

        System.out.println("\n/****** Test FunctionOne ******/");
        FunctionOne functionOne = new FunctionOne();
        System.out.println( "Start: " + Timer.startTime() );
        functionOne.sum(300);
        System.out.println( "Stop: " + Timer.stopTime() );
        Timer.diffTime();

        System.out.println("\n/****** Test FunctionTwo ******/");
        FunctionTwo functionTwo = new FunctionTwo();
        System.out.println( "Start: " + Timer.startTime() );
        functionTwo.sum(300);
        System.out.println( "Stop: " + Timer.stopTime() );
        Timer.diffTime();

        System.out.println("\n/****** Test FunctionTree ******/");
        System.out.println( "Start: " + Timer.startTime() );
        FunctionTree functionTree = new FunctionTree();
        vector = functionTree.list();
        System.out.println( "Stop: " + Timer.stopTime() );
        Timer.diffTime();
        Print.print(vector);

        System.out.println("\n/****** Test FunctionFour ******/");
        System.out.println( "Start: " + Timer.startTime() );
        FunctionFour functionFour = new FunctionFour();
        list = functionFour.list();
        System.out.println( "Stop: " + Timer.stopTime() );
        Timer.diffTime();
        Print.print(list);
    }
}
