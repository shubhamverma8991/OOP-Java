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

//3
public class Point2D {
    //initialize x & y coordinates
    private int x,y;
    
    // 3.1 parameterized constructor
    Point2D(int x , int y)
    {
        this.x=x;                // this : current object reference
        this.y=y;               // used to un hide instance var from method local var

    }
    
    //3.2 Display
    String getDetails()
    {
        return "X"+this.x+" Y "+this.y;
    }
    
    //3.3 method (API) to check equality of 3 boxes
    boolean isEqual(Point2D anotherPoint)   //anotherpoint = variable name ;  point2d =p1, anotherpoint =p2
    {
        return this.x==anotherPoint.x && this.y==anotherPoint.y;
    }

    //3.4 newpoint for offset values
    Point2D createNewPoint(int xoff,int yoff)
    {
        Point2D newPoint =new Point2D(this.x + xoff, this.y + yoff);
        return newPoint;
    }

    //3.5 calculate distance
    double calclulateDistance(Point2D anotherpoint)                   //distance formula = root of ((x2-x1)^2 + (y2-y1)^2)
    {                                               
        double diffx = anotherpoint.x - this.x;
        double diffy = anotherpoint.y-this.y;
        double powx = Math.pow(diffx, 2);
        double powy = Math.pow(diffy,2);
        double sum = powx + powy;
        double distance = Math.sqrt(sum);
        return distance;
        
    }



}
