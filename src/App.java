
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Working Directory = " + System.getProperty("user.dir"));
        FormattedInput a = new FormattedInput();
        System.out.println("\nInput: ");
        Object[] arr = a.scanf("%s %c %s %d %f %c %d");

        StringBuilder str = new StringBuilder();
        str.append("Recieved Input: ");
        for(Object element : arr)
            str.append(element + " ");
        System.out.println(str);

        EncodingConverter converterObject = new EncodingConverter();
        converterObject.encodingConverter(args[0], args[1], args[2], args[3]);
    }
}
