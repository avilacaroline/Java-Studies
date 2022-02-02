package greeting;
import java.text.SimpleDateFormat;
import java.util.Date;

public class greeting {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data);
        SimpleDateFormat formatar = new SimpleDateFormat("H");
        String dateFormat = formatar.format(data);
        System.out.println("Now it's " + dateFormat + "h");
        int hour = Integer.parseInt(dateFormat);

        if (hour >= 05 && hour <=12){
            System.out.println("Good morning!");
        }

        else if (hour >= 12 && hour < 18){
            System.out.println("Good afternoon!");
        }

        else if (hour >= 18 && hour < 22){
            System.out.println("Good evening!");
        }

        else if (hour >= 22){
            System.out.println("Good night!");
        }
    }
}
