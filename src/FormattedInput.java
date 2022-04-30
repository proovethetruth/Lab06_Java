
import java.util.Scanner;

public class FormattedInput {
    boolean errorFlag = true;

    Object[] scanf(String format) {
        Scanner sc = new Scanner(System.in);
        Object[] result = null;
        while(errorFlag)
            result = sscanf(format, sc.nextLine());
        sc.close();
        return result;
    }

    Object[] sscanf(String format, String in) {
        String[] formatArray = format.split(" ");
        String[] inputArray = in.split(" ");
        Object[] result = new Object[formatArray.length];

        if (formatArray.length != inputArray.length) {
            System.out.println("Incorrect input. Not enough / too many arguments passed.");
            return result;
        }
        for (int i = 0; i < formatArray.length; i++) {
            switch (formatArray[i]) {
                case "%d":
                    try {
                        result[i] = Integer.parseInt(inputArray[i]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Incorrect input " + e);
                        return result;
                    }
                case "%f":
                    try {
                        result[i] = Float.parseFloat(inputArray[i]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Incorrect input " + e);
                        return result;
                    }
                case "%s":
                    result[i] = inputArray[i];
                    break;
                case "%c":
                    if(inputArray[i].length() > 1) {
                        System.out.println("Incorrect input: char consists of 1 letter");
                        return result;
                    } else result[i] = inputArray[i];
            }
        }
        errorFlag = false;
        return result;
    }
}
