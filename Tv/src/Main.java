import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SmartTV> tele = new ArrayList<SmartTV>();
        tele.add(new SmartTV("Sony","20LM",2001));
        tele.add(new SmartTV("LG","LGoled",2006));
        tele.add(new SmartTV("Samsung","IbraMZX",2018));

        System.out.println(tele);

    }
}