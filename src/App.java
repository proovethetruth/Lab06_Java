import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        FormattedInput a = new FormattedInput();

        // System.out.println("\nInput: ");
        // Object[] arr = a.scanf("%c %s");

        // StringBuilder str = new StringBuilder();
        // str.append("Recieved Input: ");
        // for(Object element : arr)
        //     str.append(element + " ");
        // System.out.println(str);

        Object[] arr2 = a.sscanf("%c %s", "sgs hello");

        StringBuilder str2 = new StringBuilder();
        str2.append("Recieved Input: ");
        for(Object element : arr2)
            str2.append(element + " ");
        System.out.println(str2);
    }
}
