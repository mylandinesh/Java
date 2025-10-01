class Calculatorr{
    int c;
    int add(int a,int b){
        c=a+b;
        return c;
    }
}
public class WithParameterWithReturnType {
    public static void main(String[] args) {
        Calculatorr obj = new Calculatorr();
        int num1=10;
        int num2=20;
        int res=obj.add(num1,num2);
        System.out.println(res);
    }
}
