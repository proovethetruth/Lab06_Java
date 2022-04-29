import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class FormattedInput {

    FormattedInput() {
    }

    // %d --- целое int
    // %f --- дробное double
    // %s --- строка
    // %c --- символ

    Object[] scanf(String format) {
        String[] formatArray = format.split(" ");
        Object[] result = new Object[formatArray.length];

        while (true) {
            Scanner inputScanner = new Scanner(System.in);

            for (int i = 0; i < formatArray.length; i++) {
                switch (formatArray[i]) {
                    case "d":
                        if (inputScanner.hasNextInt()) {
                            result[i] = inputScanner.nextInt();
                        } else continue;
                    case "%f":
                        if (inputScanner.hasNextFloat()) {
                            result[i] = inputScanner.nextFloat();
                        } else continue;
                    case ("%s"):
                    case "%c":
                        if (inputScanner.hasNextLine()) {
                            if(inputScanner.nextLine().length() == 1) {
                                System.out.println("CHAR");
                            } else System.out.println("cock");
                        }
                }
            }
            break;
        }
        // if (formatArray.length != inputArray.length) {
        //     System.out.println("\n Number of arguments passed does not equal the amount of formattypes");
        //     inputScanner.close();
        //     inputArray = null;
        //     formatArray = null;
        //     result = null;
        //     this.scanf(format);
        // }
        // for (int i = 0; i < inputArray.length; i++) {

        // }
        // switch(type) {
        // case "%d":
        // }
        // for(int i = 0; i < totalCharacters; i++) {
        // int val1 = s_name.nextInt();
        // double val3 = s_name.nextDouble();
        // String name = s_name.nextLine();
        // char ch = s_name.nextLine().charAt(0);
        // }
        return result;
    }
}
