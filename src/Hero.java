import java.security.PublicKey;

public class Hero {

    int health;
    int damage;
    String superpower;


    public Hero(int health,int damage,String superpower){
        System.out.println(this);
this.health = health;
this.damage = damage;
this.superpower = superpower;

    }

public Hero(int health,int damage){
        this.health = health;
        this.damage = damage;

}

public int gethealth(){
        return this.health;
}
    public int getDamage(){
        return this.damage;
    }

    public String getsuperpower() {
        return this.superpower;
    }







}
