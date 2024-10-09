package lotr;


public abstract class Character {
    protected int power;
    protected int hp;

    public abstract void kick(Character c);
    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}



// public class Character {
//     private int hp;
//     private int power;
//     public Character(int hp, int power){
//         this.hp = hp;
//         this.power = power;
//     }
//     public void kick(Character c){

//     }
//     public boolean isAlive(){
//         return hp > 0;
//     }
// }