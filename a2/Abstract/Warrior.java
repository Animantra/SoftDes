<<<<<<< HEAD
public class Warrior implements Character {
    private String name;
    private String characterClass;
    private String skill;

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }


    public void setSkill(String skill) {
        this.skill = skill;
    }

     
    public String getName() {
        return name;
       
      }

    public String getCharacterClass() {
        return characterClass;
        
      }

    public String getSkill() {
        return skill;
        
      }



      @Override
    public String toString() {
         return "Name: " + this.name + 
                " Class: " + this.characterClass + 
                " Skill: " + this.skill;
                
    }
}
=======
public class Warrior implements Character {
    private String name;
    private String characterClass;
    private String skill;

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }


    public void setSkill(String skill) {
        this.skill = skill;
    }

     
    public String getName() {
        return name;
       
      }

    public String getCharacterClass() {
        return characterClass;
        
      }

    public String getSkill() {
        return skill;
        
      }

    public String toString() {
         return "Name: " + this.name + 
                " Class: " + this.characterClass + 
                " Skill: " + this.skill;
                
    }
}
>>>>>>> 0fad5e642926447f12959c3a83bd6ec52c9de4de
