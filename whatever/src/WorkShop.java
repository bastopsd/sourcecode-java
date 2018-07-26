class Space3D{
    double คำนวนระยะทางระหว่างจุด(Point3D startPoint, Point3D endpoint) {
        int exponent = 2;
        double x =Math.pow((startPoint.x-endpoint.x), exponent);
        double y =Math.pow((startPoint.y-endpoint.y), exponent);
        double z =Math.pow((startPoint.z-endpoint.z), exponent);
        double distance = Math.sqrt(x+y+z);
       return distance; 
    }
}

class Point3D{
    
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    int x;
    int y;
    int z;
}

public class WorkShop {

    public static void main(String[] args) {
    
    int x1 = 2, x2 = 0;
    int y1 = 1, y2 = 0;
    int z1 = 3, z2 = 6;
    Space3D space3d = new Space3D();
    Point3D startPoint = new Point3D(2, 1, 3);
    Point3D endpoint = new Point3D(0, 0, 6);
    double distance = space3d.คำนวนระยะทางระหว่างจุด(startPoint, endpoint);
    System.out.println(distance);
   
    }

}
