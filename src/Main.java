import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 12, 13, 14, 15, 16, 17, 18 };
        int[] copy = Arrays.copyOfRange(arr, 2, 6);
        for (int i : copy)
            System.out.print(i + "  ");
        System.out.println("");

        int[] copy1 = Arrays.copyOfRange(arr, 4, arr.length + 3);
        for (int i : copy1)
            System.out.print(i + "  ");
        System.out.println("\n");


        Employee[] e = { new Employee(10, "geek1"),
                new Employee(20, "geek2"),
                new Employee(30, "geek3"),
                new Employee(40, "geek4"),
                new Employee(50, "geek5") };

        Employee[] getCopy_Employees = Arrays.copyOfRange(e, 3, 5);
        for (Employee e1 : getCopy_Employees)
            System.out.print(e1.toString() + "  ");
        System.out.println();

        Object getcopy[] = Arrays.copyOfRange(e, 1, 3, Object[].class);
        for (Object e1 : getcopy) {
            System.out.print(e1.toString() + "  ");
        }
    }
}