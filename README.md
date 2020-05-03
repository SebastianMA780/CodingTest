# Coding Test
Code test for The Public Group

The program was built using Java 8 and Maven.
Junit 4 was used for unit tests.

# Description:

The exercise consists on  writing a simple console
version of a drawing program. The program should works
as follows :

```
Command 		Description

C w h           Create a new canvas of width w and height h.

L x1 y1 x2 y2   Create a new line of 'x' from (x1,y1) to (x2,y2). Only support 
                horizontal or vertical lines.
                
R x1 y1 x2 y2   Create a new rectangle, (x1,y1) is upper left corner & (x2,y2) is 
                lower right corner.
                
B x y c         Fill the entire area around (x,y) with "colour" c.
                Same as that of the "bucket fill" tool in paint programs.
                
Q               Quit.
``` 

# example
```
enter command: C 20 4
----------------------
|                    |
|                    |
|                    |
|                    |
----------------------

enter command: L 1 2 6 2
----------------------
|                    |
|xxxxxx              |
|                    |
|                    |
----------------------

enter command: L 6 3 6 4
----------------------
|                    |
|xxxxxx              |
|     x              |
|     x              |
----------------------

enter command: R 16 1 20 3
----------------------
|              xxxxx |
|xxxxxx        x   x |
|     x        xxxxx |
|     x              |
----------------------

enter command: B 10 3 o
----------------------
|oooooooooooooooxxxxx|
|xxxxxxooooooooox   x|
|     xoooooooooxxxxx|
|     xoooooooooooooo|
----------------------
```
