import java.sql.SQLOutput;
import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> addresses;
    private Map<String, List<String>> numbers;

    public PhoneBook() {
        this.addresses = new HashMap<String, List<String>>();
        this.numbers = new HashMap<String, List<String>>();
    }

    public void addNumber(String name, String number) {
        if (this.numbers.containsKey(name) && this.numbers.get(name).contains(number)) {

        } else if (this.numbers.containsKey(name) && !this.numbers.get(name).contains(number)) {
            this.numbers.get(name).add(number);
        } else {
            this.numbers.put(name, new ArrayList<String>());
            this.numbers.get(name).add(number);
        }
    }

    public void searchForANumber(String name) {
        if (this.numbers.containsKey(name)) {
            System.out.println("  phone numbers: \n" + this.numbers.get(name).toString().replace("[", "").
                    replace(", ", "\n").replace("]", ""));
        } else
            System.out.println("  phone number not found");
    }

    public String searchForAPersonByPhoneNumber(String number) {
        String name = "";
        for (String s : this.numbers.keySet()) {
            if (this.numbers.get(s).contains(number)) {
                return name = s;
            }
        }
        if (name.isEmpty()) {
            return "  not found";
        } else
            return name;
    }

    public void addAnAddress(String name, String street, String city) {
        String address = street + " " + city;
        if (this.addresses.containsKey(name)) {
            this.addresses.get(name).add(address);
        } else {
            this.addresses.put(name, new ArrayList<String>());
            this.addresses.get(name).add(address);
        }

    }

    public void searchForPersonalInformation(String name) {
        if (!this.addresses.containsKey(name) && !this.numbers.containsKey(name)) {
            System.out.println("  not found");
        } else if (this.addresses.containsKey(name)) {
            System.out.println("  address: " + this.addresses.get(name).toString().replace("[", "").
                    replace("]", ""));
            searchForANumber(name);
        } else {
            System.out.println("  address unknown");
            searchForANumber(name);
        }

    }

    public void deletePersonalInformation(String name) {
        if (this.addresses.containsKey(name)) {
            this.addresses.remove(name);
        }
        if (this.numbers.containsKey(name)) {
            this.numbers.remove(name);
        }
    }

    public void filteredListing(String word) {
        List<String> sortedList = new ArrayList<String>();

        for (String s : this.numbers.keySet()) {
            if (word.isEmpty() || s.contains(word)) {
                sortedList.add(s);
            }
        }

        for (String s : this.addresses.keySet()) {

            if (word.isEmpty() || s.contains(word)) {
                sortedList.add(s);
            }
            for (int i = 0; i < this.addresses.get(s).size(); i++) {
                if (this.addresses.get(s).get(i).contains(word)) {
                    sortedList.add(s);
                }
            }
        }

        if (sortedList.isEmpty()) {
            System.out.println("  not found");
        } else {

            Collections.sort(sortedList);

            for (String s : sortedList) {
                System.out.println(" " + s);
                searchForPersonalInformation(s);
            }
        }

    }


}
