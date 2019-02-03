import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    Scanner reader;
    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;


    public UI() {
        reader = new Scanner(System.in);
        airplanes = new ArrayList<Airplane>();
        flights = new ArrayList<Flight>();

    }

    public void start(){
        airportPanel();
        flightService();
    }

    public void airportPanel(){
        System.out.print("Airport panel\n" +
                "--------------------\n");
        String command;
        int command2;
        while (true){
            System.out.print("Choose operation:\n" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[x] Exit\n" +
                    "> ");
            command = reader.nextLine();
            if(command.equals("1")){
                System.out.print("Give plane ID: ");
                command = reader.nextLine();
                System.out.print("Give plane capacity: ");
                command2 = Integer.parseInt(reader.nextLine());
                Airplane airplane = new Airplane(command, command2);
                addAirplane(airplane);
            }else if(command.equals("2")){
                String departCode, destCode;
                System.out.print("Give plane ID: ");
                command = reader.nextLine();
                System.out.print("Give departure airport code: ");
                departCode = reader.nextLine();
                System.out.print("Give destination airport code: ");
                destCode = reader.nextLine();
                addFlight(getPlane(command),departCode, destCode);
            }else if(command.equals("x")){
                break;
            }
        }
    }

    public void flightService(){
        System.out.print("Flight service\n" +
                "------------");
        String command;
        while (true){
            System.out.print("Choose operation:\n" +
                    "[1] Print planes\n" +
                    "[2] Print flights\n" +
                    "[3] Print plane info\n" +
                    "[x] Quit\n" +
                    "> ");
            command = reader.nextLine();
            if(command.equals("1")){
                printPlanes();
            }else if (command.equals("2")){
                printFlights();
            }else if (command.equals("3")){
                System.out.print("Give plane ID: ");
                command = reader.nextLine();
                printPlaneInfo(command);
            }else if (command.equals("x")){
                break;
            }
        }

    }

    public void addAirplane(Airplane airplane){
        airplanes.add(airplane);
    }

    public void printPlanes(){
        for (Airplane a : airplanes){
            System.out.println(a);
        }
    }

    public Airplane getPlane(String id){
        for(Airplane a : airplanes){
            if(a.getPlaneId().equals(id)){
                return a;
            }

        }
        return null;
    }

    public void printPlaneInfo(String id){
        System.out.println(getPlane(id));
    }

    public void addFlight(Airplane airplane, String departCode, String destCode){
        Flight flight = new Flight(getPlane(airplane.getPlaneId()), departCode, destCode);
        flights.add(flight);
    }

    public void printFlights(){
        for(Flight f : flights){
            System.out.println(f.toString());
        }
        System.out.println("");
    }
}