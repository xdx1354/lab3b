import java.util.ArrayList;
import java.util.List;

public class Letter {
    Character letter;
    Name name;
    List <Name> letterNamesList = new ArrayList<>();

    Letter (Character letter, Name name){
        this.letter = letter;
        letterNamesList.add(name);
    }

    Letter(Character letter){
        this.letter = letter;
    }

    public String toString(){
        return "Imiona zaczynajace sie na: " + letter + ": " + letterNamesList.toString() +" \n";
    }
}
