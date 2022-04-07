import java.util.ArrayList;
import java.util.List;

public class HappyUsers {


    public void printHappyUsers(List<String> listUserID, List<Integer> listUserSec) {
        List<String> happyUsersIndexes =new ArrayList<>();


        for (int i = 0; i < listUserSec.size(); i++) {

            if( listUserSec.get(i)<10){
                happyUsersIndexes.add(listUserID.get(i));

            }


        }

        System.out.println("ŞANSLI KULLANICILAR");
        System.out.println(happyUsersIndexes);


    }
}
