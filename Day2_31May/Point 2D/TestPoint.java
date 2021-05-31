// Create Point class Point2D   : for representing a point in x-y co-ordinate system.
// 3.1 Create a parameterized constructor to accept x & y co-ords.
// 3.2 Add public String getDetails()) --to return string form point's x & y co-ords
// 3.3 Add isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise. 
// 3.4 Add a method to Point2D class -- to create and return new point having given x & y offset.
// eg : Point2D p1=new Point2D(10,20);
// Point2d p3=p1.createNewPoint(5,-2);//p3 : 15,18
// If user supplies offset of (5, -2) : your method should return a new point object placed at (15,18)
// eg : Point2D createNewPoint(int xOff,iny yOff){...}
// 3.5 Add calculateDistance method to calculate distance between current point & specified point & return the distance to the caller.
// (eg double  calcDistance(Point2D p2))
// Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
// 3.6 Write TestPoint class , under "com.app.tester" package with a main method
// Accept co ordinates of 2 points from user (Scanner) --p1 & p2
// 3.7 Use getDetails method to display point details.(p1's details & p2's details)
// 3.8 Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)
// 3.9 Create new point p3 , with the dimensions offset from p1.
// I/P --x offset & y offset
//3.10 Display distance between 2 points.(between p1 & p2)


import java.util.Scanner;
public class TestPoint {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //3.6 P1
        System.out.println("Enter X & Y Coordinates for Point 1");
        Point2D p1 =new Point2D(sc.nextInt(), sc.nextInt());     //p1 initalization 
        //3.7 P1
        System.out.println("Point1 "+p1.getDetails());
        
        //3.6 P2
        System.out.println("Enter X & Y Coordinates for Point 2");
        Point2D p2 =new Point2D(sc.nextInt(),sc.nextInt());        //p2 initalization 
        //3.7 P2
        System.out.println("Point2 "+p2.getDetails());
        
        //3.8 same or not check
        System.out.println(p1.isEqual(p2));     
        
        //3.9 Offset dimensions
        System.out.println("Enter the offset details According to Point 1");  
        Point2D p3 = p1.createNewPoint(sc.nextInt(),sc.nextInt());   //new p3
        System.out.println(p3.getDetails());
    
        //3.10 distance calculate
        System.out.println("Distance "+p1.calclulateDistance(p2));
        sc.close();
    }
    
}
