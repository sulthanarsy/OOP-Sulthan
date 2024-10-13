public class Main {
    public static void main(String[] args) {
        providertelecom provider = new providertelecom();
        //provider.GetInfo();
       // provider.tambahpulsa(90000);
        //provider.kurangipulsa(10000);
       // provider.tambahkuota(2000);
        //provider.kurangikuota(1000);
        Player player = new Player();
        player.GetInfoPlayer();
        player.moveRight();    
        player.moveLeft();
        player.moveUp();
        player.moveDown();  
        player.getDamage();     
        player.getPower();
        player.attack();
        player.dash();
        player.isDead();
        player.isRespawn();
        player.firstSkill();
        player.secondSKill();
        player.ultimateSkill();
        aqza bugil
    }
}