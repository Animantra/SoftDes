<<<<<<< HEAD

public class Game {
    public static void main(String[] args){
     
        CharacterFactory Wfactory = new WarriorFactory();
        Character warrior = Wfactory.createCharacter();
        
        Weapon sword=Wfactory.createWeapon();
        Armor shield =Wfactory.createArmor();

    
        System.out.println(warrior);

        CharacterFactory Mfactory = new WarriorFactory();
        Character mage = Mfactory.createCharacter();

        System.out.println(mage);

        sword.attack();
        shield.defence();

    }
}
=======

public class Game {
    public static void main(String[] args){
     
        CharacterFactory Wfactory = new WarriorFactory();
        Character warrior = Wfactory.createCharacter();
        warrior.setName("Conan");
        Weapon sword=Wfactory.createWeapon();
        Armor shield =Wfactory.createArmor();

    
        System.out.println(warrior);

        CharacterFactory Mfactory = new WarriorFactory();
        Character mage = Mfactory.createCharacter();
        mage.setName("Mia");

        System.out.println(mage);

        sword.attack();
        shield.defence();

    }
}
>>>>>>> 0fad5e642926447f12959c3a83bd6ec52c9de4de
