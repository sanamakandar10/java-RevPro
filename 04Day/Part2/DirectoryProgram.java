/*4. Write a program to create a directory that contains the following information.
(a) Name of a person
(b) Address
(c) Telephone Number (if available with STD code)
(d) Mobile Number (if available)
(e) Head of the family
(f) Unique ID No.
The program will support the following menu based activities:
(a) Create a database entry (The Unique ID number must be unique for every entry, the telephone numbers of two or more persons can be same if and only if the head of family is same)
(b) Edit an entry (Must be identified by only the Unique ID number)
(c) Search by keyword (Any keyword may not be complete; even if the keyword matches partially with any field, the corresponding information must be displayed)   complete java code for this*/

import java.util.*;
class DirectoryEntry {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String uniqueID;

    public DirectoryEntry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setHeadOfFamily(String headOfFamily) {
        this.headOfFamily = headOfFamily;
    }
}

class Directory {
    private Map<String, DirectoryEntry> entries;

    public Directory() {
        this.entries = new HashMap<>();
    }

    public void addEntry(DirectoryEntry entry) {
        entries.put(entry.getUniqueID(), entry);
    }

    public DirectoryEntry getEntry(String uniqueID) {
        return entries.get(uniqueID);
    }

    public void editEntry(String uniqueID, String address, String telephoneNumber, String mobileNumber, String headOfFamily) {
        DirectoryEntry entry = entries.get(uniqueID);
        if (entry != null) {
            entry.setAddress(address);
            entry.setTelephoneNumber(telephoneNumber);
            entry.setMobileNumber(mobileNumber);
            entry.setHeadOfFamily(headOfFamily);
            System.out.println("Entry edited successfully.");
        } else {
            System.out.println("Entry not found.");
        }
    }

    public List<DirectoryEntry> search(String keyword) {
        List<DirectoryEntry> result = new ArrayList<>();
        for (DirectoryEntry entry : entries.values()) {
            if (entry.getName().contains(keyword) ||
                    entry.getAddress().contains(keyword) ||
                    (entry.getTelephoneNumber() != null && entry.getTelephoneNumber().contains(keyword)) ||
                    (entry.getMobileNumber() != null && entry.getMobileNumber().contains(keyword)) ||
                    entry.getHeadOfFamily().contains(keyword) ||
                    entry.getUniqueID().contains(keyword)) {
                result.add(entry);
            }
        }
        return result;
    }
}

public class DirectoryProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory directory = new Directory();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter telephone number (if available with STD code): ");
                    String telephoneNumber = scanner.nextLine();
                    System.out.print("Enter mobile number (if available): ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter head of family: ");
                    String headOfFamily = scanner.nextLine();
                    System.out.print("Enter unique ID number: ");
                    String uniqueID = scanner.nextLine();

                    DirectoryEntry newEntry = new DirectoryEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
                    directory.addEntry(newEntry);
                    System.out.println("Entry added successfully.");
                    break;

                case 2:
                    System.out.print("Enter unique ID number to edit: ");
                    String idToEdit = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter new telephone number: ");
                    String newTelephoneNumber = scanner.nextLine();
                    System.out.print("Enter new mobile number: ");
                    String newMobileNumber = scanner.nextLine();
                    System.out.print("Enter new head of family: ");
                    String newHeadOfFamily = scanner.nextLine();
                    directory.editEntry(idToEdit, newAddress, newTelephoneNumber, newMobileNumber, newHeadOfFamily);
                    break;

                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    List<DirectoryEntry> searchResult = directory.search(keyword);
                    System.out.println("Search results:");
                    for (DirectoryEntry entry : searchResult) {
                        System.out.println("Name: " + entry.getName());
                        System.out.println("Address: " + entry.getAddress());
                        System.out.println("Telephone Number: " + entry.getTelephoneNumber());
                        System.out.println("Mobile Number: " + entry.getMobileNumber());
                        System.out.println("Head of Family: " + entry.getHeadOfFamily());
                        System.out.println("Unique ID: " + entry.getUniqueID());
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
        }
     }
  }
}
