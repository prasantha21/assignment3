package assignment3;

public class giftcardTest {
	public void GiftCardTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiftCard giftCard=new GiftCard(100, 0.0, true);
		giftCard.rechargeCard(2000);
		System.out.println("new balance"+giftCard.getBalance());
		giftCard.swipeCard(400);
		System.out.println("new balance"+giftCard.getBalance());
		giftCard.swipeCard(500);
		System.out.println("new balance"+giftCard.getBalance());

		GiftCard dxc=new GiftCard();
		dxc.setActive(true);
		dxc.rechargeCard(2000);
		dxc.swipeCard(100);
		dxc.swipeCard(200);
		System.out.println(dxc.getBalance());

	}
}
