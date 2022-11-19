public class Name {

    String name;
    Integer numberOfAppearance;
    Integer fileNumber;

    Name (String name, Integer NumberOfAppearance, Integer fileNumber){
        this.name = name;
        this.fileNumber = fileNumber;
        this.numberOfAppearance = NumberOfAppearance;
    }

    public String toString(){
        return "Imie: " + name + " pojawia sie w pliku " + fileNumber + " - " + numberOfAppearance+ " razy.";
    }

}
