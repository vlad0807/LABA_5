public class Main {
    public static void main(String[] args) {
        Football football = new Football("Football", 11, true, "Premier League");
        Basketball basketball = new Basketball("Basketball", 5, true, 305);

        SportsComplex sportsComplex = new SportsComplex("SportsCenter");

        sportsComplex.displaySportsInfo(football, basketball);

        // Виклик методу для динамічної диспетчеризації
        sportsComplex.dynamicDispatchDemo(football, basketball);
    }
}