class PersegiPanjang{
   private double panjang;
   private double lebar;
    
   PersegiPanjang(double panjang, double lebar){
    this.panjang = panjang;
    this.lebar = lebar;
   }

   double getKelilingPPanjang(){
    return 2*panjang + 2*lebar;
   }

   void setLuasPPanjang(double panjang, double lebar){
    this.panjang = panjang;
    this.lebar = lebar;
   }

   double getLuasPPanjang(){
    return panjang * lebar;
   }
}

public class main {

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(3, 6);
        System.out.println("Jadi keliling Persegi Panjangnya adalah : " + persegiPanjang.getKelilingPPanjang());

        persegiPanjang.setLuasPPanjang(5, 4);
        System.out.println("Jadi luas dari setter yang didapatkan : " + persegiPanjang.getLuasPPanjang());
    }
}
