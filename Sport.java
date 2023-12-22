abstract class Sport {
    private String sportName;
    private int numberOfPlayers;
    private boolean isTeamSport;

    Sport() {
        this.sportName = "Unknown";
        this.numberOfPlayers = 0;
        this.isTeamSport = false;
    }

    String getSportName() {
        return sportName;
    }

    void setSportName(String sportName) {
        this.sportName = sportName;
    }

    int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers > 0) {
            this.numberOfPlayers = numberOfPlayers;
        }
    }

    boolean isTeamSport() {
        return isTeamSport;
    }

    void setTeamSport(boolean teamSport) {
        isTeamSport = teamSport;
    }

    void doubleNumberOfPlayers() {
        this.numberOfPlayers *= 2;
    }

    // Метод для виведення інформації
    abstract void displayInfo();
}

