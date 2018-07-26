
public class WorkingWithString {

    public static void main(String[] args) {
        String name = "Ongart";
        int age = 25;
        String result = name+" "+age;
        System.out.println(result);
        
        int a,b,c = 0;
        a = c++;
        System.out.println(a+" "+c);
        b = ++a;
        System.out.println(b+" "+a);
        c++;
        System.out.println(c);
        b = ++c + a++;
        System.out.println(a+" "+b+" "+c);
        a = --b + c++;
        System.out.println(a+" "+b+" "+c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
