
public class Variable {
    public static void main(String[] args) {
        HienThi getdata = new HienThi();
        getdata.getOut();
    }
}
class HienThi{
    int i = 10;
    float f = 20.5f;
    double d = 20.5d;
    boolean b = true;
    char c = 'a';
    String s = "Hello Java";

    public void getOut(){
        System.out.println("gía tri i la: "+i);
        System.out.println("Giá trị của f là: "+f);
        System.out.println("Giá trị của d là : "+d);
        System.out.println("Giá trị của b là:" +b );
        System.out.println("Giá trị của c là : "+c);
        System.out.println("Giá trị của String là: "+s);
    }
}
