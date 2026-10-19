import java.util.ArrayList;

public class GameSystem{

    Game[] games;
    Player[] players;

    int gameCount;
    int playerCount;

    public GameSystem(int maxGames, int maxPlayers){
        games = new Game[maxGames];
        players = new Player[maxPlayers];
        gameCount = 0;
        playerCount = 0;
    }

    void addGame (Game game){
        if(gameCount == games.length){
            System.out.println("No more room for games");
        }
        else if(gameCount > games.length){
            System.out.println("Something went very wrong... More games than possible");
        }
        else{
            games[gameCount] = game;
            gameCount++;
        }

    }
    void addPlayer (Player player){

        if(playerCount == players.length){
            System.out.println("No more room for players");
        }
        else if(playerCount > players.length){
            System.out.println("Something went very wrong... More players than possible");
        }
        else {
            players[playerCount] = player;
            playerCount++;
        }
    }
    void displayAllGames(){
        for (int i = 0; i < gameCount; i++) {
           games[i].displayDetails();
        }
    }
    void displayAllPlayers(){
        for (int i = 0; i < playerCount; i++) {
            players[i].displayDetails();
        }
    }

    void updatePlayerScore(int playerId, double newScore){
        Player player = findPlayerById(playerId);
        player.setScore(newScore);
    }
    Game findGameById(int gameId){
        for (int i = 0; i < gameCount; i++) {   // ikke games[gameId]
            if (games[i].getGameId() == gameId) return games[i];
        }
        return null;
    }

    Player findPlayerById(int playerId){
        for (int i = 0; i < playerCount; i++) {
            if (players[i].getPlayerId() == playerId) return players[i];
        }
        return null;
    }
    double calculateTotalRevenue(){
        double totalRevenue = 0;
        for (int i = 0; i < gameCount; i++) {
            totalRevenue += games[i].getPrice();
        }
        return totalRevenue;
    }
    Player findTopScoringPlayer(){
        Player topScorer = players[0];
        for (int i = 1; i < playerCount; i++) {
            if (players[i].getScore() > topScorer.getScore()) {
                topScorer = players[i];
            }
        }
        return topScorer;
    }
}

