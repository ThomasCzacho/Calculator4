public class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator4 calc = new Calculator4();

        //Name your friends
        calc.findTotal(10, "Person 1");
        calc.findTotal(12, "Person 2");
        calc.findTotal(9,  "Person 3");
        calc.findTotal(8,  "Person 4");
        calc.findTotal(7,  "Person 5");
//        calc.findTotal(15, "Alex");
        System.out.println("Alex: $0");
        calc.findTotal(11, "Person 7");
//        calc.findTotal(30, "Forgetful");
        System.out.println("Forgetful: $0");

        System.out.println("\nTable: $"+(19+21.4+17.799999999999997+16.6+15.4+20.2));
        //Find and print the entire table's total, including tax and tip

    }
}
