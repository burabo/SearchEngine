public class Matrix {
    public int[][] matrix;

    public Matrix(int lines, int column) {
        matrix = new int[lines][column];
    }

    int getLines(){
        return matrix.length;
    }
    int getColumns(){
        return matrix[0].length;
    }



    Matrix multiplyBy(Matrix otherMatrix){

        if(getColumns()!=otherMatrix.getLines()){
            throw new UnsupportedOperationException();
        }

        Matrix product = new Matrix(getColumns(),otherMatrix.getLines());

        for(int i = 0; i < getLines(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < getColumns(); k++) {
                    product.matrix[i][j] += matrix[i][k] * otherMatrix.matrix[k][j];
                }
            }
        }
        return product;
    }

    public String toString(){
        String string = "";

        for(int i = 0; i<getLines(); i++){
            for (int j = 0; j < getColumns(); j++){
                string+= matrix[i][j];
                string+="\t";
            }
            string += "\n";
        }

        string+="\n";
        return string;
    }



}
