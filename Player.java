public class Player {
    String namePlayer = "Vayee";
    int x;
    int y;
    int health = 100;
    int speed = 1;
    int attack = 2;
    int defense = 10;
    int dash = 5;
    boolean firstSkill = true;
    boolean secondSkill = true;
    boolean ultimateSkill = true;

    public void GetInfoPlayer(){
        System.out.println("informasiplayer \nNickname : " + namePlayer + "\nposisi player" + "\nX : " + x + "Y : " + y + "\nHealth: " + health + "\nSpeed : " + speed + "\nAttack : " + attack + "\nDefense: " + defense + "\nFirst Skill : " + firstskill + "\nSecond Skill : " + secondskill + "\nUltimate Skill : " + ultimateskill + "");
    }
    public void moveRight(){
        x = x + speed;
        System.out.println(namePlayer + " Move to the right : " + x );
    }
    public void moveLeft(){
        x = x - speed;
        System.out.println(namePlayer + " Move to the left : " + x );
    }
    public void moveUp(){
        y = y + speed;
        System.out.println(namePlayer + " Move to the left : " + y );
    }
    public void moveDown(){
        y = y - speed;
        System.out.println(namePlayer + " Move to the left : " + y );
    }
    public void getPower(){
        attack = attack + 5;
        System.out.println(namePlayer + " Player get power, attack:" + attack);
    }
    public void getDamage(){
        health = health - 2;
        defense = defense - 1;
        System.out.println(namePlayer + " Player get damage, health: " + health + "defense" + defense );
    }
    public int attack(){
        System.out.println(namePlayer + " player use damage : " + attack );
        return attack * 2;
    }
    public void dash(){
        speed = speed + dash;
        System.out.println(namePlayer + " Player use dash: " + dash);
    }
    public void isDead(){
        health = 0;
        System.out.println(namePlayer + " Player get killed, health: " + health );
    }
    public void isRespawn(){
        health = 100;
        System.out.println(namePlayer + " Player get respawn, health: " + health );
    }
    public void firstSkill(){
        attack = 4;
        System.out.println(namePlayer + " Player use first skill: " + firstSkill + ", attack = " + attack);
    }
    public void secondSkill(){
        attack = 7;
        System.out.println(namePlayer + " Player use second skill: " + secondSkill + ", attack = " + attack);
    }
    public void ultimateSkill(){
        attack = 10;
        System.out.println(namePlayer + " Player use ultimate skill: " + ultimateSkill + ", attack = " + attack);
    }
}
