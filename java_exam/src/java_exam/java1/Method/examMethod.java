package java_exam.java1.Method;

public class examMethod {
    // ���ް���
    public static double valueOfSupply = 10000.0;
    // �ΰ���ġ����
    public static double vatRate = 0.1;
 
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
     
    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
 
    public static void main(String[] args) {
 
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
 
    }
 
}