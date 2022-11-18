public class Boss {

    private int health;
    private int damage;
    private String protectionType;



    public int gethealth(){
        return this.health;
    }
    public int getDamage(){
        return this.damage;
    }

    public String getProtectionType() {
        return this.protectionType;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setProtectionType(String protectionType){
        this.protectionType = protectionType;}
    
}
