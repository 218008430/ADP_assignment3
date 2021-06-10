import java.io.FileWriter;  
import java.io.IOException;

/**
 *
 * @author Ethan
 */
public class WriteSerialized {
    
    public static void main(String[] args){
        
  try{
    FileWriter myWriter = new FileWriter("stakeholder.ser");
      myWriter.write("");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
}
}
