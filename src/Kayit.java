import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit extends HaftaninSorusuMain{

    static List<String > listUserID = new ArrayList<>();
    static List<Integer> listUserSec= new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int counter =0;


    public  void kayit() {

//        List<String > listUserID = new ArrayList<>();
//        List<Integer> listUserSec= new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        String userID="";

        System.out.print("user ID = ");
        userID = scan.nextLine();

        int userSec = LocalDateTime.now().getSecond();
        System.out.println(userSec);            // kaydolurken kullanıcının kayıt sn yesini göstereriyor, silinebilir

        listUserID.add(userID);
        listUserSec.add(userSec);

        tamamDevamMii();






    }



    private void tamamDevamMii() {


        String tmdm="";

        do {
            System.out.println("Başka kayıt var mı? (E/H giriniz)");
            tmdm = scan.next();
            if (tmdm.equalsIgnoreCase("e")) {
                kayit();
            } else {
                if (tmdm.equalsIgnoreCase("h")) {
                    System.out.println("Teşekkür ederiz");
                    break;
                }
            }
        }while(!tmdm.equalsIgnoreCase("e") && !tmdm.equalsIgnoreCase("h") );


        counter++;
        //System.out.println(counter);  // buradan sonrası listenin uzunluğu kadar tekrar çağırılıyordu. bu şekilde çözdüm
        if (counter==1) {
            HappyUsers hpUsers = new HappyUsers();
            hpUsers.printHappyUsers(listUserID, listUserSec);

        }

    }


}
