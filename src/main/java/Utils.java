import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Utils {

    public static int countNames(File txtFile, String name) throws FileNotFoundException {
        int counter = 0;
        Scanner fileScanner = new Scanner(txtFile);
        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            if(Objects.equals(line, name)){
                counter++;
            }
        }
        return counter;
    }

    public static void generateNameSummary(List<Name> allNames, File txtFile1, File txtFile2, File txtFile3, String name) throws FileNotFoundException {
        Integer numberOfAppearances[] = {0,0,0};
        numberOfAppearances[0] = Utils.countNames(txtFile1,name);
        numberOfAppearances[1] = Utils.countNames(txtFile2,name);
        numberOfAppearances[2] = Utils.countNames(txtFile3,name);
        Name currentName = new Name(name,numberOfAppearances);
        allNames.add(currentName);
    }

    public static void generateLettersList( List <Character> firstLetters, List<Name> allNames, ArrayList<Letter> lettersList){
        for(Character c : firstLetters){            //generuje liste z obiektami letter, które maja tylko wpisane same litery
            Letter l = new Letter(c);
            lettersList.add(l);
        }

        for(Name n : allNames){
            Character c = n.name.charAt(0);
            for(Letter l : lettersList){
                if(l.letter == c){
                    l.letterNamesList.add(n);
                }
            }
        }
    }

    public static void printingLettersList(ArrayList <Letter> lettersList){
        for(Letter l : lettersList){
            System.out.println("Imiona na: " + l.letter);
            for(Name n : l.letterNamesList){
                int sum = n.numberOfAppearance[0] + n.numberOfAppearance[1] + n.numberOfAppearance[2];
                System.out.print(n.name + " pojawia sie w pliku |nr1: "+ n.numberOfAppearance[0] + "| nr2: " + n.numberOfAppearance[1] + "| nr3: " +n.numberOfAppearance[2] +" || RAZEM: " + sum +"|\n");
            }
            System.out.println();
        }
    }

}
