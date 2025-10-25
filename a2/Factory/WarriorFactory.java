<<<<<<< HEAD
public class WarriorFactory implements CharacterFactory{

    @Override
    public Character createCharacter() {
        Warrior w = new Warrior();
        w.setCharacterClass("Warrior");
        w.setSkill("Sword Mastery");
        return w;
        
    }
}
=======
public class WarriorFactory implements CharacterFactory{

    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}
>>>>>>> 0fad5e642926447f12959c3a83bd6ec52c9de4de
