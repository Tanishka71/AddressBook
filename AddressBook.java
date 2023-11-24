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
    public void addAddress(Contact contact){
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
		        
		        Contact newContact = new  Contact(fname, lname, addressStr, city, state, zip, phone, email);
		        address.addAddress(newContact);
		        address.display();
		    }
	}

