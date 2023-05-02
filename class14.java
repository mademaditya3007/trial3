class algebra{
    int x,y;

    algebra(int a,int b){
    x=a;
    y=b;

    }
    int add(){
        return x+y;
        
    }
    int sub(){
        return x-y;

    }
    int mul(){
        return x*y;

    }
}
public class class14 {
    public static void main(String[] args) {
        algebra k1=new algebra(5,7);
        System.out.println(k1.mul());
        System.out.println(k1.add());
        System.out.println(k1.sub());

    }
}
