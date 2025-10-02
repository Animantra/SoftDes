public class MageFactory implements CharacterFactory{

    @Override
    public Character createCharacter() {
        Mage m = new Mage();
        m.setCharacterClass("Mage");
        m.setSkill("Fireball");
        return m;
        }
}