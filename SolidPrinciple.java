import java.util.Scanner;
import java.lang.*;
class Rectangle
{
    int m_width;
    int m_height;
    
    //Rectangle class constructor
    public Rectangle(int width, int height)
    {
        m_width = width;
        m_height = height;
    }
    public void setWidth(int width)
    {
        m_width = width;
    }
    public void setHeight(int height)
    {
        m_height = height;
    }
    public int getWidth()
    {
        return m_width;
    }
    public int getHeight()
    {
        return m_height;
    }
    public int getArea()
    {
        return m_width * m_height;
    }
}
//Square class extends the Rectangle class to find the area of square
class Square extends Rectangle
{
    //Square class constructor
    public Square(int side)
    {
        super(side, side);
    }
}

class Area
{
    public static int findArea(Rectangle dimensions)
    {
        return dimensions.getArea();
    }

    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("Enter 1 to find the area of rectangle: ");
            System.out.println("Enter 2 to find the area of square: ");
            System.out.println("Enter 3 to Exit");
            System.out.println("Enter your choice");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter length of Rectangle: ");
                    Scanner rectangleLength = new Scanner(System.in);
                    int length = rectangleLength.nextInt();
                    System.out.println("Enter breadth of Rectangle: ");
                    Scanner rectangleBreadth = new Scanner(System.in);
                    int breadth = rectangleBreadth.nextInt();
                    Rectangle rectangleObject = new Rectangle(length, breadth);
                    System.out.println("Area of Rectangle = " + findArea(rectangleObject));
                    break;
                case 2:
                    System.out.println("Enter length of side of Square: ");
                    Scanner squareSide = new Scanner(System.in);
                    int side = squareSide.nextInt();
                    Square squareObject = new Square(side);
                    System.out.println("Area of Square = " + findArea(squareObject));
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("!!! Please choose either 1 or 2 !!!");
                    break;
            }
        }
    }
}
