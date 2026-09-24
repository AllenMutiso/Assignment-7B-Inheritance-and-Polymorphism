/*
* Allen Mutiso
* MTSALL002
* 24-September-2026
* Child of VectorObject
* Specialization properties: finalXPoint, finalYPoint (final co-ordinates)
* Defines lines based on a starting co-ordinate and a final co-ordinate.
* Implements the Bresenham's Line Drawing Algorithim: https://en.wikipedia.org/wiki/Bresenham%27s_line_algorithm
*/

public class PtLine extends VectorObject{
    private int finalXPoint;
    private int finalYPoint;

    public PtLine (int id, int x, int y, int finalXPoint, int finalYPoint) {
        super(id, x, y);
        this.finalXPoint = finalXPoint;
        this.finalYPoint = finalYPoint;
    }

    public void draw (char [][] matrix) {
        int currX = this.x;
        int currY = this.y;
        int currFinalX = this.finalXPoint;
        int currFianlY = this.finalYPoint;

        boolean steep = Math.abs(currFianlY- currY) > Math.abs(currFinalX - currX);
        //Gradient greater than 45_degrees.
        if (steep) {
            //swap(x, y)
            int tempx = currX;
            currX = currY;
            currY = tempx;

            //swap(finalXPoint, finalYPoint)
            int tempFinalXPoint = currFinalX;
            currFinalX = currFianlY;
            currFianlY = tempFinalXPoint;
        } 
        //if the initial x co-ordinate is greater than the final x co_ordinate 
        if (currX > currFinalX) {
            // swap(x, finalXPoint)
            int tempX = currX;
            currX = currFinalX;
            currFinalX = tempX;

            // swap(y, finalYPoint)
            int tempY = currY;
            currY = currFianlY;
            currFianlY = tempY;
        }

        int ys;
        // If the current Y co-ordinate comes before the final Y co-ordinate,
        // then the step is positive else it is negative
        if (currY < currFianlY) {
            ys = 1;
        } else {
            ys = -1;
        }

        double gradient = (double)Math.abs(currFianlY - currY)/(currFinalX - currX);
        double error = 0;

        for (int i = currX; i <= currFinalX; i ++) {
            if (steep) {
                matrix[i][currY] = '*';
            } else {
                matrix[currY][i] = '*';
            }

            error = error + gradient;
            if (error  > 0.5) {
                currY = currY + ys;
                error = error - 1;
            }
        }
    }
}
