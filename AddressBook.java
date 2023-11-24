package com.address;
import java.util.ArrayList;
import java.util.Scanner;

/*@desc:to get the contact details of the user
@params:fname,lname,address,city,zip,state,phone,email
@methods:parameterized contstructor, getFname, getLname,getAddress,getCity, getState */
class Contact {
    private String fname;
    private String lname;
    private String address;
    private String city;
    private String zip;
    private String state;
    private String phone;
    private String email;

    /*@desc:to get the contact details of the user
    @params:fname,lname,address,city,zip,state,phone,email
    @return:none */
    public Contact(String fname, String lname, String address, String city, String state, String zip, String phone,
            String email) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.phone = phone;
        this.email = email;
    }

    
	/*
	 * @desc: to get info
	 * @params:none
	 * @return:String
	 */
    public String getFname() {
        return fname;
    }

	/*
	 * @desc: to get info
	 * @params:none
	 * @return:String
	 */
    public String getLname() {
        return lname;
    }

	/*
	 * @desc: to get info
	 * @params:none
	 * @return:String
	 */
    public String getAddress() {
        return address;
    }

	/*
	 * @desc: to get info
	 * @params:none
	 * @return:String
	 */
    public String getCity() {
        return city;
    }

	/*
	 * @desc: to get info
	 * @params:none
	 * @return:String
	 */
    public String getState() {
        return zip;
    }

	/*
	 * @desc: to get info
	 * @params:none
	 * @return:String
	 */
    public String getZip() {
        return zip;
    }

	/*
	 * @desc: to get info
	 * @params:none
	 * @return:String
	 */
    public String getPhone() {
        return phone;
    }

	/*
	 * @desc: to get info
	 * @params:none
	 * @return:String
	 */
    public String getEmail() {
        return email;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


	/*
	 * @desc: to return in string format
	 * @params:none
	 * @return:String
	 */
    public String toString() {
        return String.format(
                "NAME : %s %s\nADDRESS : %s\nCITY : %s\nSTATE :%s\nZIP : %s\nPHONE NUMBER : %s\nEMAIL : %s\n",
                fname, lname, address, city, state, zip, phone, email);
    }

}



/*@desc:stores the contacts in arrayList and displays it
@params:ArrayList(Contacts)
@methods:non-parameterized contstructor, getFname, getLname,getAddress,getCity, getState */
class Address{

    private ArrayList<Contact> contacts;

    public Address(){
        contacts = new ArrayList<Contact>();
    }
    
	/*
	 * @desc: to add individual conatcts in  ArrayList
	 * @params:Object Contact
	 * @return:none
	 */
    public void addContact(Contact contact){
        contacts.add(contact);
        System.out.println("Contact added successfully");
    
    }
    
    
	/*
	 * @desc: to display individual conatcts in  ArrayList
	 * @params:none
	 * @return:none
	 */
    public void display() {
        if(contacts.isEmpty()){
            System.out.println("No contacts in the address book");
        }else{
            System.out.println("Address book updated\n");
            for(Contact c : contacts){
                System.out.println(c);
                System.out.println();    
        }
        }  
    }
    
    
    public Contact findContactByName(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFname().equalsIgnoreCase(firstName) && contact.getLname().equalsIgnoreCase(lastName)) {
                return contact;
            }
        }
        return null; // Contact not found
    }
   

    public void editExistingContact(Scanner scanner) {
        System.out.print("Enter the first name of the contact to edit: ");
        String firstNameToEdit = scanner.nextLine();

        System.out.print("Enter the last name of the contact to edit: ");
        String lastNameToEdit = scanner.nextLine();

        Contact existingContact = findContactByName(firstNameToEdit, lastNameToEdit);

        if (existingContact != null) {
            System.out.println("Existing Contact Details:");
            System.out.println(existingContact);
            boolean updateMore = true;
            while (updateMore) {
            // Get updated information
            System.out.println("Enter the information to update (address/city/state/zip/phone/email): ");
            String infoToUpdate = scanner.nextLine();   
            switch (infoToUpdate.toLowerCase()) {
                case "address":
                    System.out.print("Enter updated address: ");
                    existingContact.setAddress(scanner.nextLine());
                    break;
                case "city":
                    System.out.print("Enter updated city: ");
                    existingContact.setCity(scanner.nextLine());
                    break;
                case "state":
                    System.out.print("Enter updated state: ");
                    existingContact.setState(scanner.nextLine());
                    break;
                case "zip":
                    System.out.print("Enter updated ZIP Code: ");
                    existingContact.setZip(scanner.nextLine());
                    break;
                case "phone":
                    System.out.print("Enter updated phone number: ");
                    existingContact.setPhone(scanner.nextLine());
                    break;
                case "email":
                    System.out.print("Enter updated email: ");
                    existingContact.setEmail(scanner.nextLine());
                    break;
                default:
                    System.out.println("Invalid information type. No updates performed.");
            }

            System.out.print("Do you want to update anything more for this contact? (yes/no): ");
            String updateMoreOption = scanner.nextLine();
            updateMore = updateMoreOption.equalsIgnoreCase("yes");
        }

            System.out.println("Contact updated successfully");
        } else {
            System.out.println("Contact not found");
        }
    }
}


/*@desc:the base class originally*/
public class AddressBook {
	
	
	/*
	 * @desc:Displays the contacts
	 * @params:none
	 * @retrun:none
	 */
	public static void main(String []args) {
		System.out.println("WELCOME TO ADDRESS BOOK!!");
		

		        Address address = new Address();

		        Scanner scanner = new Scanner(System.in);
		        
		        boolean addMoreContacts = true;

		        while (addMoreContacts) {
		        System.out.print("Enter first name: ");
		        String fname = scanner.nextLine();

		        System.out.print("Enter last name: ");
		        String lname = scanner.nextLine();

		        System.out.print("Enter address: ");
		        String addressStr = scanner.nextLine();

		        System.out.print("Enter city: ");
		        String city = scanner.nextLine();

		        System.out.print("Enter state: ");
		        String state = scanner.nextLine();

		        System.out.print("Enter zip: ");
		        String zip = scanner.nextLine();

		        System.out.print("Enter phone number: ");
		        String phone = scanner.nextLine();

		        System.out.print("Enter email: ");
		        String email = scanner.nextLine();
		        
		        Contact newContact = new Contact(fname, lname, addressStr, city, state, zip, phone, email);
		        address.addContact(newContact);

	            System.out.print("Do you want to add another contact? (yes/no): ");
	            String addAnother = scanner.nextLine();

	            addMoreContacts = addAnother.equalsIgnoreCase("yes");
		        }

		        // Option to edit an existing contact
		        System.out.print("Do you want to edit an existing contact? (yes/no): ");
		        String editOption = scanner.nextLine();

		        if (editOption.equalsIgnoreCase("yes")) {
		            address.editExistingContact(scanner);
		        }

		        address.display();
		        scanner.close();
	}
 

	}

