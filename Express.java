public class Express extends JNE{
	private String noPemesanan;
	private String jenis_Express;
	
	Express(String penerima, String pengirim, String alamat, String noHp, String asal,  int totBerat,String tujuan, String noPemesanan,String jenis_Express)
	{
		super(penerima,pengirim,alamat,noHp,asal,tujuan,totBerat,noPemesanan);
		this.noPemesanan = noPemesanan;
		this.jenis_Express=jenis_Express;
	}
	
	public  String getJenis_express()
	{
		return jenis_Express;
	}
	public String getnoPemesanan()
	{
		return noPemesanan;
	}
	public String run1()
	{
		return ("Penerima : "+getPenerima()+" \nPengirim		: "+getPengirim()+"\nAlamat		: "+getAlamat()+" \nNo HP	: "+getNoHp()+" \nAsal :"+getAsal()+"\n Tujuan : "+getTujuan()+"\nTotal Berat :"+getTotBerat()+"\nNo Pemesanan : "+getNoPemesanan()+"Jenis Pemesanan : "+getJenis_express());
	}
	}
	
	//+" \nPengirim		: "+getPengirim()+"\nAlamat		: "+getAlamat()+" \nNo HP	: "+getNoHp()+" \nAsal :"+getAsal()+"\n Tujuan : "+getTujuan()+"\nTotal Berat :"+getTotBerat()+"\nNo Pemesanan : "+getNoPemesanan()+"Jenis Pemesanan : "+getJenis_Express()