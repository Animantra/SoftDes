<<<<<<< HEAD
public class SchoolTeamPlayer implements iStudent {
    private String name;
    private String role="Team player";

    public SchoolTeamPlayer(String name){
        this.name=name;
    }

    @Override
    public String getDescription() {
        return name;

    }

    @Override
    public String getRole() {
        return role;
    }
    
    @Override
    public void setRole(String role){
        this.role=role;
    }
}
=======
public class SchoolTeamPlayer implements iStudent {
    private String name;
    private String role="Team player";

    public SchoolTeamPlayer(String name){
        this.name=name;
    }

    @Override
    public String getDescription() {
        return name;

    }

    @Override
    public String getRole() {
        return role;
    }
    
    @Override
    public void setRole(String role){
        this.role=role;
    }
}
>>>>>>> 0fad5e642926447f12959c3a83bd6ec52c9de4de
