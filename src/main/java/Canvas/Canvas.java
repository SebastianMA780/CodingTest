package Canvas;
public class Canvas {
    /*
     + the matrix that represents the canvas will have 3 possible values
     + 0 --> Free space
     + 1 --> Inner space from a figure
     + 2 --> Figure's borders */
    private int width;
    private int height;
    private int[][] canvas ;
    /*
    Constructor sets the matrix with values = 0, the increment
    is to make the canvas better visible in the console
     */
    public Canvas(int width , int height) {
        int increment = 2;
        setHeight(height + increment);
        setWidth(width + increment);
        canvas =  new int[getHeight()][getWidth()];
        for ( int i = 0; i < height  ; i++) {
            for (int j = 0 ; j < width  ; j++) {
                canvas[i][j] = 0;
            }
        }
    }
    /*
    printCanvas method draw the canvas by verifying the value of the matrix to print
    a specific character
    */
    public void printCanvas(char color) {
            for ( int i = 0; i < getHeight(); i++) {
                for ( int j = 0; j < getWidth(); j++) {
                    if ( i == 0 || i == getHeight() - 1 ) {
                        canvas[i][j] = 2;
                        System.out.print("-");
                    } else {
                        if (j == 0 || j == getWidth() - 1 ) {
                            canvas[i][j] = 2;
                            System.out.print("|");
                        } else
                            if ( canvas[i][j] == 1 )
                                System.out.print(color);
                            else
                                System.out.print(canvas[i][j] == 2  ? "x" : " ");
                    }
                }
                System.out.println();
            }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[][] getCanvas() {
        return canvas;
    }

    public void setCanvas(int[][] canvas) {
        this.canvas = canvas;
    }
}
