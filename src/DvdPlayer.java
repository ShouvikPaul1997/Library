
public class DvdPlayer implements Library {
	int dvdId;
	String dvdName;
	String dvdPubName;
	int price;
	public DvdPlayer(int dvdId, String dvdName, String dvdPubName, int price) {
		super();
		this.dvdId = dvdId;
		this.dvdName = dvdName;
		this.dvdPubName = dvdPubName;
		this.price = price;
	}
	
	public void rent(int day) {
		System.out.println("Your dvd name: "+dvdName);
		System.out.println("Your dvd id: "+dvdId);
		System.out.println("Your dvd publisher: "+dvdPubName);
		System.out.println("Your dvd per day price: "+price);
		System.out.println("Item total: "+ price*day +"rs ");
	}
}
