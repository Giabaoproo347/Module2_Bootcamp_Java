import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FindValueStudent {
    public static void main(String[] args) {
        FindValue findValue = new FindValue();
        findValue.getArray();
    }
}
class FindValue {
    Scanner scanner = new Scanner(System.in);
    String[] students = {"Chirstian","Micheal","Camila","Siena","Tanya","Connor","Zachariar","Mallory","Zoe","Emily"};
    boolean isExist = false;

    public void getArray() {
        System.out.println("Enter name's student:");
        String input_name = scanner.nextLine();

        for ( int i = 0; i < students.length; i++ ) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the student in the list  "+input_name+" is "+ (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found "+input_name+" in the list");
        }
    }

}
