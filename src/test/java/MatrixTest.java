import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {

    Matrix idmat = new Matrix(3, 3);
    Matrix randomMat = new Matrix(3,3):


    @BeforeAll
    void setup() {
       for(int i = 0; i<idmat.matrix.length; i++){
           idmat.matrix[i][i] = 1;
           for(int j = 0; i<idmat.matrix.length; j++) {
               randomMat.matrix[i][j] = 7;
           }

       }

    }





    @Test
    void testMult(){
        idmat.multiplyBy();
    }
}
