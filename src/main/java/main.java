import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String []Args) throws FileNotFoundException {
        List<Name> allNames = new ArrayList<>();

        //zliczanie imion z poszczegolnych plików i tworzenie bazy z nimi
        File txtFile = new File("D:\\PWR\\3 sem\\Jezyki_programowania\\lab3b\\src\\main\\java\\file1.txt");
        int fileNumber = 1;
        String specificName = "Ola";                                         //TODO: pobierac imie z enum
        Utils.loadFileData(allNames,txtFile,specificName,fileNumber);

    }
}
