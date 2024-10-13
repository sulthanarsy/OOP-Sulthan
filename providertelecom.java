import java.time.LocalDateTime;

public class providertelecom {
    String name;
    int mobilebalance;
    int mobiledata;
    LocalDateTime expiremobilebalance;
    LocalDateTime expiremobiledata;
    
    public void GetInfo() {
        this.name = "cahiogaming";
        System.out.println("Berikut ini adalah informasi kartumu \nprovider :" + name + "pulsa anda");
    }
    public void tambahpulsa(int a){
        mobilebalance = a;
        System.out.println("pulsa anda ditambah " + a + " Rupiah");
    
    }
    public void kurangipulsa(int a){
        System.out.println("pulsa anda dikurangi " + a +  " Rupiah");
        mobilebalance =mobilebalance - a;
        System.out.println("sisa pulsa anda " + mobilebalance + " Rupiah");

    }
    public void tambahkuota(int a){
        mobiledata = a;
        System.out.println("kuota anda ditambah " + a + " MB");
    
    }
    public void kurangikuota(int a){
        System.out.println("kuota anda dikurangi " + a +  " MB");
        mobiledata =mobiledata - a;
        System.out.println("sisa kuota anda " + mobiledata + " MB");
    }
    
}
