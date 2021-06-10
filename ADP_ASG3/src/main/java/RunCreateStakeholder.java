
import java.io.FileNotFoundException;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Ethan George
 * student number 
 */
public class RunCreateStakeholder {

    public static void main(String[] args) throws FileNotFoundException {
       
     try {
            FileInputStream fileIn = new FileInputStream("stakeholder.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object e = null;
            ;
            while ((e = in.readObject()) != null) {
                    
                if ((e instanceof Customer)) {
                    
                   
                    ArrayList<Customer> customer = new ArrayList<Customer>();
                    
                 
                     customer.add((Customer)e);
                    

                    for (int i = 0; i < customer.size(); i++) {
                        System.out.println(customer.get(i));
                        
                        
                    }
                   // else(!customer.isEmpty()){
                            // Collections.sort(customer,(Customer cus1 , Customer cus2) -> cus1.getStHolderId().compareTo(cus2.getStHolderId()));
                            
                          //  }
                  

                } else if ((e instanceof Supplier)) {

                    ArrayList<Supplier> supplier = new ArrayList<Supplier>();
                  
                    supplier.add((Supplier)e);
                    
                    for (int i = 0; i < supplier.size(); i++) {
                        System.out.println(supplier.get(i));
                    }

                    System.out.println("");
                    System.out.println(((Supplier) e).toString());

                }

            }

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Customer class not found");
            c.printStackTrace();
            return;
        }
    }
}
//     ReadSerilaized obj = new ReadSerilaized(); 
//  obj.openFile();
//  obj.readObject();
            //   obj.closeFile();