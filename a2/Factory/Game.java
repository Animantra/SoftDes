
public class Game {
    public static void main(String[] args){
     
        CharacterFactory Wfactory = new WarriorFactory();
        Character warrior = Wfactory.createCharacter();

    
        System.out.println(warrior);

        CharacterFactory Mfactory = new WarriorFactory();
        Character mage = Mfactory.createCharacter();

        System.out.println(mage);
    }
}
