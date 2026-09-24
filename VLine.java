/*
* Allen Mutiso
* MTSALL002
* 24-September-2026
* Child of VectorObject
* Specialization properties: vLength(height)
* Draws a vertical line from a starting co-ordinate and a specified height.
*/

public class VLine extends VectorObject {
    private int vLength;

    public VLine(int id, int x, int y,int vLength) {
        super (id, x, y);
        this.vLength = vLength;
    }

    @Override 
    public void draw(char [][] matrix) {
        for (int j = y; j < (y + vLength); j ++) {
            matrix[j][x] = '*';
        }
    }
}
