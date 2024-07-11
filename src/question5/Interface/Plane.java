package question5.Interface;

public interface Plane {

    void fly();
    void takeoff();
    static void landing()
    {
        System.out.println("plane is landing");
    }
}
class CargoPlane implements Plane {

    @Override
    public void fly() {
        System.out.println("Cargo Plane flies at lower height");
    }

    @Override
    public void takeoff() {
        System.out.println("Cargo Plane is taking off");
    }

    public void landing()
    {
        Plane.landing();
    }
}
class FighterPlane implements Plane{

    @Override
    public void fly() {
        System.out.println("Fighter Plane flies at higher height");
    }

    @Override
    public void takeoff() {
        System.out.println("Fighter Plane takes off at higher speed");
    }
    public void landing()
    {
        Plane.landing();
    }
}
class Airport{

    public void permit(Plane p){
        p.fly();
        p.takeoff();
        Plane.landing();
    }
}
class LaunchPlane{
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.permit(cp);
        a.permit(fp);
    }
}
