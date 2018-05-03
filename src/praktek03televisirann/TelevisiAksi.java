package praktek03televisirann;
public class TelevisiAksi {
    public static void main(String[] args) {
        Televisi t = new Televisi();
        
        t.setMerek("Sharp");
        t.setWarna("Putin");
        t.setHarga(3500);
        
        t.cetakInfo();
        
        System.out.print("Mereknya \t: ");
        System.out.println(t.getMerek());
        System.out.print("Warnanya \t: ");
        System.out.println(t.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(t.getHarga());
        
        Speaker s = new Speaker();
        s.setMerek("Baomba");
        s.setWarna("Silver");
        s.setHarga(1500);
        s.setJenisSpeaker("Protable");
        s.cetakInfo();
        System.out.println("Jenis \t:"+s.getJenisSpeaker());
        s.throttle();
    }
 
}
