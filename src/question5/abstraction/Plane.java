package question5.abstraction;

abstract public class Plane {
    abstract public void fly();
    abstract public void takeoff();

    public void landing(){
        System.out.println("plane is landing");
    }
}
class CargoPlane extends Plane{

    public void fly() {
        System.out.println("Cargo Plane flies at lower height");
    }
    public void takeoff() {
        System.out.println("Cargo Plane is taking off");
    }
}
class FighterPlane extends Plane{

    public void fly(){
        System.out.println("Fighter Plane flies at higher height");
    }

    public void takeoff(){
        System.out.println("Fighter Plane takes off at higher speed");
    }

}
class Airport{

    public void permit(Plane p){
        p.fly();
        p.takeoff();
        p.landing();
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
