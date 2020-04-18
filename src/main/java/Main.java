import Canvas.Canvas;
import Figures.Line;
import Figures.Point;
import Figures.Rectangle;
import java.util.Scanner;

public class Main {
     static Scanner keyBoard = new Scanner(System.in);

     static Canvas createCanvas() {
         int width;
         int height;

         System.out.print("enter command:C ");
         width = keyBoard.nextInt();
         height = keyBoard.nextInt();
        Canvas canvas = new Canvas(width, height);
        canvas.printCanvas();
        return canvas;
     }

      public static void main(String[] args) {
            char option = 'a';
            Canvas canvas = createCanvas();
            do {
                int xStart;
                int xEnd;
                int yStart;
                int yEnd;
                Point pointStart;
                Point pointEnd;

                System.out.print("enter command:");
                option = keyBoard.next().charAt(0);
                switch (option) {
                    case 'L':
                        xStart = keyBoard.nextInt();
                        yStart = keyBoard.nextInt();
                        xEnd = keyBoard.nextInt();
                        yEnd = keyBoard.nextInt();

                         pointStart = new Point(xStart,yStart);
                         pointEnd = new Point(xEnd,yEnd);
                         Line line = new Line(pointStart,pointEnd);
                         line.draw(canvas.getCanvas());
                         canvas.printCanvas();
                         break;
                    case 'R':
                        xStart = keyBoard.nextInt();
                        yStart = keyBoard.nextInt();
                        xEnd = keyBoard.nextInt();
                        yEnd = keyBoard.nextInt();

                         pointStart = new Point(xStart,yStart);
                         pointEnd = new Point(xEnd,yEnd);
                         Rectangle rectangle = new Rectangle(pointStart,pointEnd);
                         rectangle.draw(canvas.getCanvas());
                         canvas.printCanvas();
                         break;
                    case 'B':
                        char color;
                        xStart = keyBoard.nextInt();
                        yStart = keyBoard.nextInt();
                        color = keyBoard.next().charAt(0);
                        System.out.println("H");
                        break;
                    default:
                        break;

                }

            } while ( option != 'Q' );
    }
}
