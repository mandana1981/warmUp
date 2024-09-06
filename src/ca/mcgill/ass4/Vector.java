package ca.mcgill.ass4;
/*Write a class Vector. A Vector should consist of three private properties of type double: x, y, and z. You
should add to your class a constructor which takes as input 3 doubles. These doubles should be assigned
to x, y, and z. You should then write methods getX(), getY(), getZ(), setX(), setY(), and setZ() which allow
you to get and set the values of the vector. Should this method be static or non-static?*/

public class Vector {
    private double x;
    private double y;
    private double z;
    public Vector(double x, double y, double z) {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    /*Add to your Vector class a method calculateMagnitude which returns a double representing the
magnitude of the vector. Should this method be static or non-static? */
    public double CalculateMagnitude(double x, double y, double z) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

    }
}
