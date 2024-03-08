/*8. Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object. The Matrix class has the following information:
1 - number of rows of matrix
2 - number of columns of matrix
3 - elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
5 - multiplying the two matrices*/
public class Matrix {
    private int[][] elements;
    private int rows;
    private int columns;
    
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
}
    
    public int getRows() {
        return rows;
}
    
    public int getColumns() {
        return columns;
}
    
    public void setElement(int row, int column, int value) {
        elements[row][column] = value;
}
    
    public Matrix add(Matrix matrix) {
        if (this.rows != matrix.getRows() || this.columns != matrix.getColumns()) {
            System.out.println("Matrices cannot be added");
            return null;
        }
        
        Matrix result = new Matrix(rows, columns);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.setElement(i, j, this.elements[i][j] + matrix.elements[i][j]);
   }
}
        
        return result;
    }
    
    public Matrix multiply(Matrix matrix) {
        if (this.columns != matrix.getRows()) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }
        
        Matrix result = new Matrix(this.rows, matrix.getColumns());
        
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                int sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.elements[i][k] * matrix.elements[k][j];
                }
                result.setElement(i, j, sum);
            }
        }
        
        return result;
    }
}