package assignment.hashtable;

class Contact {
    long phone;
    String email;
    Contact (long phone,String email) {

	    this.phone = phone;
	    this.email = email;
    }
    public String toString(){
        return "  Phone NUmber : "+phone+"  "+" Email id: "+email;
    }
    }
