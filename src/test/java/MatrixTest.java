import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MatrixTest {


    /*
    É NECESSARIO FAZER TESTES DIREITINHOS!!!!!

     */

    Matrix idmat = new Matrix(3, 3);
    Matrix randomMat = new Matrix(3,3);


    void setup() {
       for(int i = 0; i<idmat.matrix.length; i++) {
           idmat.matrix[i][i] = 2;
       }

        for(int i = 0; i<randomMat.getLines(); i++){
            for (int j = 0; j<randomMat.getColumns(); j++){
                randomMat.matrix[i][j]=i+1;
            }
        }
    }

    @Test
    void testMult(){
        setup();
        System.out.print(randomMat.toString());
        randomMat = idmat.multiplyBy(randomMat);
        System.out.print(randomMat.toString());
        System.out.print(idmat.toString());
        idmat = idmat.multiplyBy(3);
        System.out.print(idmat.toString());

    }
}
