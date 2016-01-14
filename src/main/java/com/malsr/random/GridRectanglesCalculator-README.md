Given a grid of size m x n, calculate the total number of rectangles contained in this
rectangle. All integer sizes and positions are counted.

Examples:

numberOfRectangles(3, 2) == 18
numberOfRectangles(4, 4) == 100

Another interesting article I found about calculating rectangles in a grid
http://www.mathblog.dk/project-euler-85-rectangles-rectangular-grid/

See Link also from CodeKata
http://www.codewars.com/kata/number-of-rectangles-in-a-grid/java

Here is how the 3x2 grid works (Thanks to GiacomoSorbi for the idea):

1 rectangle of size 3x2:

[][][]
[][][]

2 rectangles of size 3x1:

[][][]

4 rectangles of size 2x1:

[][]

2 rectangles of size 2x2

[][]
[][]

3 rectangles of size 1x2:

[]
[]

6 rectangles of size 1x1:

[]