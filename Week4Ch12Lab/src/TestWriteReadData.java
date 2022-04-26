/** 
 * Description: Call the WriteDataWithAutoClose and ReadData.java
 * Created by: Jacob Osbourne
 * Date: 2/11/2022
 * Version:1.0
 */

public class TestWriteReadData {
        public static void main(String[] args) {
            // create object of WriteDataWithAutoClose
                WriteDataWithAutoClose writeObj = new WriteDataWithAutoClose();
                // create object ReadData
                ReadData readObj = new ReadData();
                
                try {
                    // call main method of writeObj
                    writeObj.main(null);
                    // call main method of readObj
                    readObj.main(null);
                }
                catch(Exception e) {
                    System.out.println(e);
                }
                
        }
}