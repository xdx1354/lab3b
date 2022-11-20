public class Name {

    String name;
    Integer[] numberOfAppearance;
    ///Integer fileNumber;

    Name (String name, Integer []numberOfAppearance){
        this.name = name;
        //this.fileNumber = fileNumber;
        this.numberOfAppearance = numberOfAppearance;
    }

    public String toString(){
        return "Imie: " + name + " pojawia sie w pliku 1: " + numberOfAppearance[0] + " pliku 2: " + numberOfAppearance[1] + " pliku 3: " + numberOfAppearance[2] + "\n";
    }

}
