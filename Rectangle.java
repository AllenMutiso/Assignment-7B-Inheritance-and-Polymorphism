/*
* Allen Mutiso
* MTSALL002
* 24-September-2026
* Child of VectorObject
* Specializaation properties: xSide(length), ySide(width)
* Draws rectangles based on a starting point, length and width using asterisks(*)
*/

public class Rectangle extends VectorObject{
    private int xSide;
    private int ySide;

    public Rectangle(int id, int x, int y, int xSide, int ySide) {
        super(id, x, y);
        this.xSide = xSide;
        this.ySide = ySide;
    }

    @Override
    public void draw (char [][] matrix) {
        for (int j = y; j < (y + ySide); j ++) {
            for (int i = x; i < (x + xSide); i ++) {
                matrix[j][i] = '*';
            }
        }
    }
}
