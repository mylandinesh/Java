class withparameter {
    int c;
    void add(int a,int b){
        c=a+b;
        System.out.println(c);
    }
}
public class WithParameterWithoutReturnType {
    public static void main(String[] args) {
        withparameter obj = new withparameter();
        int num1=10;
        int num2=20;
        obj.add(num1,num2);
    }
}
