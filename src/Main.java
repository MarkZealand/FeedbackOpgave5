
void main() {
    GameSystem system = new GameSystem(10, 10);

    addGames(system);
    addPlayers(system);
    showSystemDetails(system);
    updatePlayer(system);
    findShowTopScorer(system);
    findGame(system);
}

private static void findGame(GameSystem system) {
    // Find et spil
    Game g = system.findGameById(2);
    System.out.println("\nSpil med ID 2: " + g.getTitle());
}

private static void findShowTopScorer(GameSystem system) {
    // Find top-scorer
    Player top = system.findTopScoringPlayer();
    System.out.println("\nTop-scorer: " + top.getName() + " med " + top.getScore());
}

private static void updatePlayer(GameSystem system) {
    // Opdater en score
    system.updatePlayerScore(101, 2800);
    System.out.println("\nAnna's nye score:");
    system.findPlayerById(101).displayDetails();
}

private static void showSystemDetails(GameSystem system) {
    // Vis alt
    System.out.println("--- SPIL ---");
    system.displayAllGames();

    System.out.println("\n--- SPILLERE ---");
    system.displayAllPlayers();

    // Samlet indtjening
    System.out.println("\n--- SAMLET SALG ---");
    System.out.println("\nTotal salg: " + system.calculateTotalRevenue());
}

private static void addPlayers(GameSystem system) {
    // Tilføj spillere
    system.addPlayer(new Player(101, "Ava", 22, 1500));
    system.addPlayer(new Player(102, "Bilbo", 25, 2300));
    system.addPlayer(new Player(103, "Callum", 59, 1800));
}

private static void addGames(GameSystem system) {
    // Tilføj spil
    system.addGame(new Game(1, "Zealand Student Simulator", "Sandbox", 399.95));
    system.addGame(new Game(2, "Zealand Table Tennis Manager", "Sports", 449.95));
    system.addGame(new Game(3, "Zealand Parking Lot", "Racing", 199.95));
}