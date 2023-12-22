class SportsComplex {
    private String name;

    SportsComplex(String name) {
        this.name = name;
    }

    void displaySportsInfo(Sport sport1, Sport sport2) {
        System.out.println("Sports Complex Name: " + name);
        System.out.println("Sports Information:");
        sport1.displayInfo();
        sport2.displayInfo();
    }

    // Метод для тестування динамічної диспетчеризації
    void dynamicDispatchDemo(Sport sport1, Sport sport2) {
        sport1.displayInfo();
        sport2.displayInfo();
    }
}