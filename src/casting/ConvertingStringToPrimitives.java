package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {

        String num1 = "23";
        String num2 = "12";

        // 23 + 12 = 35

        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);   // Returns Primitive

        Integer num1Integer = Integer.valueOf(num1);
        Integer num2Integer = Integer.valueOf(num2);    // Returns Wrapper Class

        int num1IntValueOf = Integer.valueOf(num1);

        System.out.println(num1 + num2);        //2312
        System.out.println(num1Int + num2Int);  //35
        System.out.println(num1Integer + num2Integer); //35



    }
}
