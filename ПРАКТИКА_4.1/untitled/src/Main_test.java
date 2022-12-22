public class Main_test
{
    public static void main(String[] args)
    {
        Car car = new Car();
        Plane plane = new Plane();
        Train train = new Train();
        Ship ship = new Ship();

        //Car
        //passenger
        car.setPTime(350);
        car.setPPrice(4800);

        //cargo
        car.setWTime(440);
        car.setWPrice(3500);


        //Plane
        //passenger
        plane.setPTime(150);
        plane.setPPrice(10250);

        //cargo
        plane.setWTime(180);
        plane.setWPrice(8300);


        //Train
        //passenger
        train.setPTime(280);
        train.setPPrice(7000);

        //cargo
        train.setWTime(320);
        train.setWPrice(5500);

        //Ship
        //passenger
        ship.setPTime(500);
        ship.setPPrice(3200);

        //cargo
        ship.setWTime(500);
        ship.setWPrice(2300);


        System.out.println("Car: ");
        System.out.println("Passenger time: " + car.getPTime());
        System.out.println("Passenger price: " + car.getPPrice());

        System.out.println("--------------------------------------");

        System.out.println("Cargo time: " + car.getWTime());
        System.out.println("Cargo price: " + car.getWPrice());

        System.out.println();
        System.out.println("Plane: ");
        System.out.println("Passenger time: " + plane.getPTime());
        System.out.println("Passenger price: " + plane.getPPrice());

        System.out.println("--------------------------------------");

        System.out.println("Cargo time: " + plane.getWTime());
        System.out.println("Cargo price: " + plane.getWPrice());

        System.out.println();
        System.out.println("Train: ");
        System.out.println("Passenger time: " + train.getPTime());
        System.out.println("Passenger price: " + train.getPPrice());

        System.out.println("--------------------------------------");

        System.out.println("Cargo time: " + train.getWTime());
        System.out.println("Cargo price: " + train.getWPrice());

        System.out.println();
        System.out.println("Ship: ");
        System.out.println("Passenger time: " + ship.getPTime());
        System.out.println("Passenger price: " + ship.getPPrice());

        System.out.println("--------------------------------------");

        System.out.println("Cargo time: " + ship.getWTime());
        System.out.println("Cargo price: " + ship.getWPrice());
    }

}