
import java.time.LocalTime;
import java.util.Scanner;

public class FormattedInput {

    FormattedInput() {
    }

    // %d --- целое int
    // %f --- дробное double
    // %s --- строка
    // %c --- символ

    // Object[] scanf(String format) {
    //     long startTime = System.nanoTime();
    //     Scanner sc = new Scanner(System.in);
    //     Object[] result = null;
    //     if(sc.hasNextLine())
    //         result = sscanf(format, sc.nextLine());
    //     else
    //         System.out.println("Incorrect input.");
    //     sc.close();
    //     System.out.println("ELAPSED TIME: " + (System.nanoTime() - startTime));
    //     return result;
    // }

    Object[] scanf(String format) {
        long startTime = System.nanoTime();
        String[] formatArray = format.split(" ");
        Object[] result = new Object[formatArray.length];

        int isReaded = 0;
        while (true) {
            isReaded = 1;
            Scanner inputScanner = new Scanner(System.in);

            for (int i = 0; i < formatArray.length; i++) {
                switch (formatArray[i]) {
                    case "%d":
                        if (inputScanner.hasNextInt()) {
                            result[i] = inputScanner.nextInt();
                            break;

                        } else
                            isReaded = 0;
                        break;

                    case "%f":
                        if (inputScanner.hasNextFloat()) {
                            result[i] = inputScanner.nextFloat();
                            break;

                        } else
                            isReaded = 0;
                        break;

                    case "%s":
                        if (inputScanner.hasNext()) {
                            String temp = inputScanner.next();
                            result[i] = temp;
                            break;
                        } else
                            isReaded = 0;
                        break;
                    case "%c":
                        if (inputScanner.hasNext()) {
                            String temp = inputScanner.next();
                            if (temp.length() > 1) {
                                isReaded = 0;
                                break;
                            } else
                                result[i] = temp;
                            break;

                        } else
                            isReaded = 0;
                        break;
                }
            }

            if (isReaded != 1) {
                System.out.println("Incorrect input. Try again");
                continue;
            } else
                inputScanner.close();
            break;
        }
         System.out.println("ELAPSED TIME: " + (System.nanoTime() - startTime));
        return result;
    }

    Object[] sscanf(String format, String in) {
        String[] formatArray = format.split(" ");
        String[] inputArray = in.split(" ");
        Object[] result = new Object[formatArray.length];

        if (formatArray.length != inputArray.length)
            return result;
        for (int i = 0; i < formatArray.length; i++) {
            switch (formatArray[i]) {
                case "%d":
                    try {
                        result[i] = Integer.parseInt(inputArray[i]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Incorrect input: " + e);
                        return result;
                    }
                case "%f":
                    try {
                        result[i] = Float.parseFloat(inputArray[i]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Incorrect input: " + e);
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
        return result;
    }
}
