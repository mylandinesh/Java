class Calculator{
    int a=10;
    int b=20;
    int add(){
        int c =a+b;
        return c;
    }
}
public class WithoutParameterWithReturnType {
    public static void main(String[] args) {
      Calculator obj = new Calculator();
      int res= obj.add();
      System.out.println(res);
    }
}
