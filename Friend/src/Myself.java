
public class Myself {
	public static void main(String[] args){
		Friend friend = new Friend();
		System.out.println("---友達とのやりとり---");
		friend.borrow();
		friend.talk();

		Friend taro = new Friend();
		System.out.println("---太郎さんとのやりとり---");
		taro.play();
	}
}
