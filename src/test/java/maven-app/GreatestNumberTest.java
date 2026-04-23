
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GreatestNumberTest {
GreatestNumber g=new GreatestNumber(); 
    
    public void greatestone(){
        int result=g.greatest(3,5);
		assertEquals(5,result);
    }
}
