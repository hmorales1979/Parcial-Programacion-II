
package primerparcial;


public class User {
    
     String id;
     String name;
     String email;
     String address;
     String phoneNumer;
    
 // Constructor al que se le pasa los datos

    public User(String id, String name, String email, String address, String phoneNumer) {
    this.id=id;
    this.name=name;
    this.email=email;
    this.address=address;
    this.phoneNumer=phoneNumer;
    }    
   public String getId(){
        return id;
    } 
   
   public String getName(){
        return name;
    } 
      
   public String getEmail(){
        return email;
    } 
         
   public String getAddress(){
        return address;
    } 
            
  public  String getPhoneNumer(){
        return phoneNumer;
    } 
    
}
