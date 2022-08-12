package design;

public class MyHashSetTest {

	public static void main(String[] args) {
		MyHashSet myHashSet = new MyHashSet();
		
		
		
		System.out.println(myHashSet.contains(72));
		myHashSet.remove(91);
		myHashSet.add(48);
		myHashSet.add(41);
		System.out.println(myHashSet.contains(96));
		myHashSet.remove(87);
		System.out.println(myHashSet.contains(48));
		System.out.println(myHashSet.contains(49));
		myHashSet.add(84);
		myHashSet.add(82);
		myHashSet.add(24);
		myHashSet.add(7);
		myHashSet.remove(56);
		myHashSet.add(87);
		myHashSet.add(81);
		myHashSet.add(55);
		myHashSet.add(19);
		myHashSet.add(40);
		myHashSet.add(68);
		myHashSet.add(23);
		myHashSet.add(80);
		myHashSet.add(53);
		myHashSet.add(76);
		System.out.println(myHashSet.contains(93));
		myHashSet.add(95);
		System.out.println(myHashSet.contains(95));
		myHashSet.add(67);
		myHashSet.add(31);
		System.out.println(myHashSet.contains(80));
		myHashSet.add(62);
		myHashSet.add(73);
	}
}
