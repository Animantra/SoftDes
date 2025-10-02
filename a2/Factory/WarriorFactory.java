public class WarriorFactory implements CharacterFactory{

    @Override
    public Character createCharacter() {
        Warrior w = new Warrior();
        w.setCharacterClass("Warrior");
        w.setSkill("Sword Mastery");
        return w;
        
    }
}
