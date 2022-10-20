public class Calculator4 {
    public double tax = .05;
    public double tip = .15;
    public double added = 30/6+15/6;
    public double subtotal =0;

    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public void findTotal(double price, String name){
        double total = (price*(1+tax+tip))+added;
        subtotal=subtotal+total;
        System.out.println(name +": $" +total);
        System.out.println("Current Subtotal: $"+subtotal);

    }
}
