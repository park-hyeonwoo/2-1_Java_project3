package friend;
public class AutoTest {
	public static void main(String[] args) {
		
		FriendList friendsList = FriendList.friendListGenerator();
		FriendListFile flf = new FriendListFile();
		flf.readFileToList("C:\\Users\\phw\\eclipse-workspace\\project3\\friendlist-norm.data");
		
		friendsList.friends[0].print();
		friendsList.getFriend(1).print();
		friendsList.getFriend(2).print();
		System.out.println(friendsList.numFriends());
	}
}