interface Weapon{
    public void attack();
}
interface Armor {
    void defence();

}

class Sword implements Weapon {
    public void attack() {
        System.out.println("SWORD");
    }
}

class Staff implements Weapon {
    public void attack() {
        System.out.println("Fireball!");
    }
}

class Shield implements Armor {
    
    public void defence() {
        System.out.println("Shield!");
    }
}

class Robe implements Armor {
    
    public void defence() {
        System.out.println("Magic barrier");
    }
}