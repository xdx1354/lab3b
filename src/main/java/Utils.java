import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Utils {

    public static void loadFileData(List<Name> allNames, File txtFile, String name, int fileNumber) throws FileNotFoundException {
        int counter = 0;
        Scanner fileScanner = new Scanner(txtFile);
        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            if(Objects.equals(line, name)){
                counter++;
            }
        }
        if(counter!=0){
            Name a = new Name(name,counter,fileNumber); ///tworzy obiekt zapamietujacy wystapienia poszukiwanego imienia, ich ilosc i w jakim pliku
            allNames.add(a);
        }
    }


}
