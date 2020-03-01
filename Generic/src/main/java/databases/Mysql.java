package databases;

import java.util.ArrayList;
import java.util.List;

public class Mysql  {

    public static List<String> searchElements(){
        List<String> elements=new ArrayList<String>();
        elements.add("Tshirt");
        elements.add("books");
        elements.add("Mobile");
        return elements;
    }

    public static int[] name={1,4,5,6};


    public static void main(String[] args) throws Exception {

        System.out.println(searchElements());
        ConnectToSqlDB.insertDataFromArrayListToSqlTable(searchElements(),"BushraTable","searchItems");
      //  ConnectToSqlDB.insertDataFromArrayToSqlTable(name,"names","st");

        System.out.println(ConnectToSqlDB.readDataBase("BushraTable","searchItems"));
    }

}
