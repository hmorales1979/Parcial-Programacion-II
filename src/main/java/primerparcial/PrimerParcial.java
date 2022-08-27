package primerparcial;
import java.util.Scanner; 
import java.util.ArrayList;


public class PrimerParcial {
    
    static String  Menu(){
     Scanner entradaEscaner = new Scanner (System.in); 

     System.out.println("======================");
     System.out.println("1) Registrar Enfermera");
     System.out.println("2) Registrar Doctor");
     System.out.println("3) Registrar Paciente"); 
     System.out.println("4) salir");
     System.out.println("======================");
     String  opcion = entradaEscaner.nextLine (); 

     return opcion;1
    }
    
     static  void LlenaArray() {
        ArrayList <Nurse> arrayPersonas= new ArrayList <> ( ); 
        String id, name, email, address, phoneNumber, speciality  ;
         
        //Nurse[] arrayNurseDoctor = new Nurse[10]; 
     
        
        Scanner entradaEscaner = new Scanner (System.in); 
        String answer;
        
        for(int i = 0 ; i <= 11; i = i ++)
        {
            
    
 
            System.out.println ("Id "         );   id = (entradaEscaner.nextLine ()); 
            System.out.println ("Name "       );   name = entradaEscaner.nextLine (); 
            System.out.println ("Email "      );   email = entradaEscaner.nextLine (); 
            System.out.println ("Address"     );   address  = entradaEscaner.nextLine (); 
            System.out.println ("PhoneNumber ");   phoneNumber= entradaEscaner.nextLine (); 
            System.out.println ("speciality ");    speciality = entradaEscaner.nextLine (); 
            
          
            String  miPersona[] =   {id, name, email, address, phoneNumber, speciality};
           
            
            arrayPersonas.add(new Nurse (miPersona));
           
            
            
            
           
            do {
                System.out.println ("would you like to enter another profile? y/continue, n/exit");
                answer = entradaEscaner.nextLine (); 

                if (answer.equals("n")) 
                { 
                   i=10;
                } else if (answer.equals("n")){
                    continue;              
                } else {
                     System.out.println ("the option is invalid, you can choose 'n' or 'y'"); 
                }
            } while (answer.equals("n"));    
                
        }
        
      
    
    }   
    

    public static void main(String[] args) {
        
      
         switch (Menu()) 
         {
             
            case "1" :
            // Declaraciones
                 
                 LlenaArray();
                break; // break es opcional
            case "2" :
            // Declaraciones
                 LlenaArray();
                
                break; // break es opcional
            case "3" :
            // Declaraciones
                 LlenaArray();
                
                break; // break es opcional
               
            case "4" :
            // Declaraciones
                 LlenaArray();
                
                break; // break es opcional
             
         }
         
      
         
        
        
        
    }
}
