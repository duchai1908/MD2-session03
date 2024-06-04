package btsession03.thuchanh04;

public class Calculator {
    private double a;
    private double b;

    public Calculator() {
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double sum(){
        return a+b;
    }
    public double div(){
        return a/b;
    }
    public double multiply(){
        return a*b;
    }
    public double sub(){
        return a-b;
    }
}
