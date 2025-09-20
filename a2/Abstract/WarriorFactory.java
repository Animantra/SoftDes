public class WarriorFactory implements CharacterFactory{

    public Character createCharacter() {
        return new Warrior();
    }

    public Weapon createWeapon() {
        return new Sword();
    }

    public Armor createArmor() {
        return new Shield();
    }


}