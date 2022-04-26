/** 
 * Description: Copy IntegerMatrix from textbook
 * Created by: Jacob Osbourne
 * Date: 4/25/2022
 * Version:1.0
 */

public class IntegerMatrix extends GenericMatrix<Integer> {
  @Override 
  protected Integer add(Integer o1, Integer o2) {
    return o1 + o2;
  }

  @Override 
  protected Integer multiply(Integer o1, Integer o2) {
    return o1 * o2;
  }

  @Override
  protected Integer zero() {
    return 0;
  }
}