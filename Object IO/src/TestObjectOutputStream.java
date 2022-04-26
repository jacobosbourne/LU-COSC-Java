/** 
 * Description: Copy demo object video
 * Created by: Jacob Osbourne
 * Date: 4/10/2022
 * Version:1.0
 */

import java.io.*;

public class TestObjectOutputStream {
  public static void main(String[] args) throws IOException {
    try ( 
      ObjectOutputStream output =
        new ObjectOutputStream(new FileOutputStream("object.dat"));
    ) {
      
      output.writeUTF("John");
      output.writeDouble(85.5);
      output.writeObject(new java.util.Date());
    }
  }
}
