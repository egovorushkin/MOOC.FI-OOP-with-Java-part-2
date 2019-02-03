public class Main {
    public static void main(String[] args) {
        CivilService v = new CivilService();
        v.work();
        System.out.println(v.getDaysLeft());

        MilitaryService m = new MilitaryService(180);
    }
}
