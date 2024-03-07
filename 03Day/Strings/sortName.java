/*6. Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.(HINT : USE the compareTo methid of String)*/
public class sortName {
    public static void main(String[] args) {
        String[] friends = {"Sana", "Alina", "Lucky", "Vaseem", "Poonam", "Allen", "Rani", "Imran", "Mary", "Chaitra"};
        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (friends[i].compareTo(friends[j]) > 0) {
                    String temp = friends[i];
                    friends[i] = friends[j];
                    friends[j] = temp;
                }
            }
        }
        System.out.println("Sorted friend names:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
