/*
* Allen Mutiso
* MTSALL002
* 24-September-2026
* Child of VectorObject
* Specialization properties: hLength(height)
* Draws a horizontal line from a starting co-ordinate and a specified length.
*/

public class HLine extends VectorObject {
    private int hLength;

    public HLine(int id, int x, int y,int hLength) {
        super (id, x, y);
        this.hLength = hLength;
    }

    @Override 
    public void draw(char [][] matrix) {
        for (int i = x; i < (x + hLength); i ++) {
            matrix[y][i] = '*';
        }
    }
}
