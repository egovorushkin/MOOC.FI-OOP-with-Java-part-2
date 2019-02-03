import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> plates;

    public VehicleRegister() {
        plates = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if(plates.get(plate) == null){
            this.plates.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate){
        if(this.plates.containsKey(plate)){
            return plates.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate){
        if(this.plates.get(plate) == null){
            return  false;
        }
        this.plates.remove(plate);
        return true;
    }

    public void printRegistrationPlates(){
        for(RegistrationPlate plate : this.plates.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners(){
        ArrayList<String> printedOwners = new ArrayList<String>();
        for(String owner : this.plates.values()) {
            if (!printedOwners.contains(owner))
                System.out.println(owner);
            printedOwners.add(owner);
        }
    }
}