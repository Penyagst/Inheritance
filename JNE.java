class JNE {
	protected String penerima,pengirim,alamat,noHp,asal,tujuan,noPemesanan;
	protected int totBerat;
	
	protected JNE( String penerima, String pengirim, String alamat, String noHp, String asal, String tujuan, int totBerat, String noPemesanan){
		this.penerima=penerima;
		this.pengirim = pengirim;
		this.alamat = alamat;
		this.noHp = noHp;
		this.asal = asal;
		this.tujuan = tujuan;
		this.totBerat = totBerat;
		this.noPemesanan=noPemesanan;
	}
	public String getPenerima(){
		return penerima;
	}
	public String getPengirim(){
		return pengirim;
	}
	public String getAlamat(){
		return alamat;
	}
	public String getNoHp(){
		return noHp;
	}
	public String getAsal(){
		return asal;
	}
	public String getTujuan(){
		return tujuan;
	}
	public int getTotBerat(){
		return totBerat;
	}
	public String getNoPemesanan(){
		return noPemesanan;
	}
}