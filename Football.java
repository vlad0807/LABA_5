class Football extends Sport {
    private boolean hasReferee;
    private String leagueName;

    Football(String sportName, int numberOfPlayers, boolean hasReferee, String leagueName) {
        setSportName(sportName);
        setNumberOfPlayers(numberOfPlayers);
        setTeamSport(hasReferee);
        this.leagueName = leagueName;
    }

    @Override
    void displayInfo() {
        System.out.println("Football Info:");
        System.out.println("League Name: " + leagueName);
    }
}
