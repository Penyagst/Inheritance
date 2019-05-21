public class main{
	
	public static void main(String[] args)
	{
		//instance off class
		System.out.println();
		System.out.println();
//Express(String penerima, String pengirim, String alamat, String noHp, String asal,  int totBerat,String tujuan, String noPemesanan,String jenis_Express)
		Express gar=new Express("PENY","ikaShop","bandung","085232332342","jakarta",1,"bandung","132sc","express pisan");
		System.out.println(gar.run1());
	}
}
