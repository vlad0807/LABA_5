class Basketball extends Sport {
    private int basketHeight;

    Basketball(String sportName, int numberOfPlayers, boolean hasReferee, int basketHeight) {
        setSportName(sportName);
        setNumberOfPlayers(numberOfPlayers);
        setTeamSport(hasReferee);
        this.basketHeight = basketHeight;
    }

    @Override
    void displayInfo() {
        System.out.println("Basketball Info:");
        System.out.println("Sport Name: " + getSportName());
        System.out.println("Number of Players: " + getNumberOfPlayers());
        System.out.println("Is Team Sport: " + isTeamSport());
        System.out.println("Basket Height: " + basketHeight + " cm");
    }
}