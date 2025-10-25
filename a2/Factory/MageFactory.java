<<<<<<< HEAD
public class MageFactory implements CharacterFactory{

    @Override
    public Character createCharacter() {
        Mage m = new Mage();
        m.setCharacterClass("Mage");
        m.setSkill("Fireball");
        return m;
        }
=======
public class MageFactory implements CharacterFactory{

    @Override
    public Character createCharacter() {
        return new Mage();
    }
>>>>>>> 0fad5e642926447f12959c3a83bd6ec52c9de4de
}