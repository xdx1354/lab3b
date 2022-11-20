import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {


    public static void main(String []Args) throws FileNotFoundException {
        List<Name> allNames = new ArrayList<>();
        ArrayList <Letter> lettersList = new ArrayList<>(26);

        //zliczanie imion z poszczegolnych plików i tworzenie bazy z nimi
        File txtFile1 = new File("D:\\PWR\\3 sem\\Jezyki_programowania\\lab3b\\src\\main\\java\\file1.txt");
        File txtFile2 = new File("D:\\PWR\\3 sem\\Jezyki_programowania\\lab3b\\src\\main\\java\\file2.txt");
        File txtFile3 = new File("D:\\PWR\\3 sem\\Jezyki_programowania\\lab3b\\src\\main\\java\\file3.txt");
        List <String> enumNames = new ArrayList<>();
        for( NamesEnum name:NamesEnum.values()){
            enumNames.add(name.toString());
        }

        List <Character> firstLetters =new ArrayList<>();
        int counter=0;
        for (String s: enumNames){
            Utils.generateNameSummary(allNames,txtFile1,txtFile2,txtFile3,s);       //dodaje do allNames dane imie

            if(!firstLetters.contains(s.charAt(0))){                                //dodaje pierwsza litere do listy
                firstLetters.add(s.charAt(0));
            }
        }

        Utils.generateLettersList(firstLetters,allNames,lettersList);


        Collections.sort(lettersList,(l1,l2)->l1.letter.compareTo(l2.letter));
        //System.out.println(lettersList);
        Utils.printingLettersList(lettersList);
    }
}
