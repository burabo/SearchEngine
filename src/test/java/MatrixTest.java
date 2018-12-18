import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestInstance;

import javax.activation.UnsupportedDataTypeException;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MatrixTest {


    /*
    É NECESSARIO FAZER TESTES DIREITINHOS!!!!!

     */

    Matrix idmat = new Matrix(3, 3);
    Matrix randomMat = new Matrix(3,3);
    Matrix newMat;

    @BeforeEach
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

        int[][] data = {
                {1,2,3,10,30},
                {4,5,6, 5, 5},
                {7,8,9, 7, 0}
        };
        try {
            newMat = new Matrix(data);
        } catch (UnsupportedDataTypeException e) {
            e.printStackTrace();
        }
        System.out.print(newMat.toString());
    }
}
