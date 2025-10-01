class calculator{
    int a=10;
    int b=20;
    void add(){
        int c=a+b;
        System.out.println(c);
    }

}
public class WithoutParameterWithoutReturnType {
    public static void main(String[] args) {
        calculator obj = new calculator();
        obj.add();

    }

}
