public class Calculator {
    private int number1;
    private int number2;
    private double decimal1;
    private double decimal2;

    public Calculator(){}

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public double getDecimal1() {
        return decimal1;
    }

    public void setDecimal1(double decimal1) {
        this.decimal1 = decimal1;
    }

    public double getDecimal2() {
        return decimal2;
    }

    public void setDecimal2(double decimal2) {
        this.decimal2 = decimal2;
    }

    public int sum(int number1,int number2){
        return number1 + number2;
    }
    public int takeAway(int number1,int number2){
        return number1 - number2;
    }
    public int product(int number1,int number2){
        return number1 * number2;
    }
    public double divide(double decimal1,double decimal2){
        return decimal1 / decimal2;
    }
}
