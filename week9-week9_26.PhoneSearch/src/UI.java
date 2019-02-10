import java.util.Scanner;

public class UI {
    private Scanner reader;
    private PhoneBook phoneBook;

    public UI() {
        this.reader = new Scanner(System.in);
        phoneBook = new PhoneBook();
    }

    public void start(){
        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit");
        String command1 = "";
        String command2 = "";
        String command3 = "";
        while (true){
            System.out.print("command: ");
            command1 = reader.nextLine();
            if(command1.equals("1")){
                System.out.print("whose number: ");
                command1 = reader.nextLine();
                System.out.print("number: ");
                command2 = reader.nextLine();
                phoneBook.addNumber(command1, command2);

            }else if(command1.equals("2")){
                System.out.print("whose number: ");
                command1 = reader.nextLine();
                phoneBook.searchForANumber(command1);

            }else if(command1.equals("3")){
                System.out.print("number: ");
                command1 = reader.nextLine();
                System.out.println(phoneBook.searchForAPersonByPhoneNumber(command1));

            }else if(command1.equals("4")){
                System.out.print("whose address: ");
                command1 = reader.nextLine();
                System.out.print("street: ");
                command2 = reader.nextLine();
                System.out.print("city: ");
                command3 = reader.nextLine();
                phoneBook.addAnAddress(command1, command2, command3);

            }else if(command1.equals("5")){
                System.out.print("whose information: ");
                command1 = reader.nextLine();
                phoneBook.searchForPersonalInformation(command1);

            }else if(command1.equals("6")){
                System.out.print("whose information: ");
                command1 = reader.nextLine();
                phoneBook.deletePersonalInformation(command1);

            }else if(command1.equals("7")){
                System.out.print("keyword (if empty, all listed): ");
                command1 = reader.nextLine();
                phoneBook.filteredListing(command1);
            }else if(command1.equals("x")){
                break;
            }
        }
    }
}
