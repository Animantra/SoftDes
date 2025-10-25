<<<<<<< HEAD

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
=======

public class Game {
    public static void main(String[] args){
     
        CharacterFactory Wfactory = new WarriorFactory();
        Character warrior = Wfactory.createCharacter();
        warrior.setName("Conan");

    
        System.out.println(warrior);

        CharacterFactory Mfactory = new WarriorFactory();
        Character mage = Mfactory.createCharacter();
        mage.setName("Mia");

        System.out.println(mage);





    }
}
>>>>>>> 0fad5e642926447f12959c3a83bd6ec52c9de4de
