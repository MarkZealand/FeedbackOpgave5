# Feedbackopgave 5 - Klasser
### Infinite Loopers:
- Mark
- Sarah
- Niklas

# Hvad projektet går ud på

Projektet fungerer som et simpelt system til at administrere computerspil og spillere.
Systemet kan tilføje spil og spillere, vise detaljer, opdatere scores, finde spil og spillere på deres ID, samt beregne samlet indtjening og finde den bedste spiller.

## Hvordan programmet køres

Programmet køres gennem IntelliJ ved at trykke på "RUN" knappen eller Shift+F10. 

Main metoden opretter et `GameSystem`, tilføjer spil og spillere, viser detaljer, opdaterer en score, finder top-scoreren og finder et spil ud fra dets ID. Alt output vises i konsollen.

## Hvordan programmet er opdelt i metoder

Programmet er opdelt i følgende klasser og metoder:

**Game**
- Konstruktør
- Gettere og settere for alle attributter
- `displayDetails()` – viser spillets detaljer

**Player**
- Konstruktør
- Gettere og settere for alle attributter
- `displayDetails()` – viser spillerens detaljer
- `updateScore(double newScore)` – opdaterer spillerens score

**GameSystem**
- Konstruktør
- `addGame(Game game)` – tilføjer et spil til systemet
- `addPlayer(Player player)` – tilføjer en spiller til systemet
- `displayAllGames()` – viser alle spil
- `displayAllPlayers()` – viser alle spillere
- `updatePlayerScore(int playerId, double newScore)` – opdaterer en spillers score
- `findGameById(int gameId)` – finder et spil på dets ID
- `findPlayerById(int playerId)` – finder en spiller på deres ID
- `calculateTotalRevenue()` – beregner samlet indtjening
- `findTopScoringPlayer()` – finder spilleren med højeste score

**Main**
- `addGames(GameSystem system)` – tilføjer testspil
- `addPlayers(GameSystem system)` – tilføjer testspillere
- `showSystemDetails(GameSystem system)` – viser spil, spillere og samlet salg
- `updatePlayer(GameSystem system)` – opdaterer og viser en spillers score
- `findShowTopScorer(GameSystem system)` – finder og viser top-scoreren
- `findGame(GameSystem system)` – finder og viser et spil på dets ID

## Hvorfor denne opdeling

Hver metode har én enkelt opgave, så koden er lettere at læse og vedligeholde. `Main` er holdt overskuelig ved at flytte logik ud i hjælpemetoder, og `GameSystem` samler al administration af spil og spillere ét sted.

## Eksempel på en metode med parameter

`findGameById(int gameId)` tager et gameId som parameter og returnerer det matchende `Game`-objekt, eller `null` hvis det ikke findes.

## Eksempel på en metode med returværdi

`calculateTotalRevenue()` returnerer en `double` med den samlede pris for alle spil i systemet. `findTopScoringPlayer()` returnerer et objekt i form af `Player`, baseret på hvilken spiller der har den højeste score.

## Hvilke løkker bruges, og hvorfor

Vi bruger FOR løkker til at oprette arrays for både spil og spillere. Det passer godt, fordi vi kender antallet af elementer via `gameCount` og `playerCount`. Løkkerne bruges bl.a. i `displayAllGames()`, `displayAllPlayers()`, `findGameById()`, `findPlayerById()` og `findTopScoringPlayer()`.

## Ting vi har testet
* At tilføje flere spil og spillere til systemet
* At opdatere en spillers score og vise den opdaterede score
* At finde et spil og en spiller ud fra deres ID
* At beregne den samlede indtjening fra alle spil
* At finde den spiller med højeste score

## En fejl eller udfordring vi stødte på
Til at starte med, prøvede vi // at finde en spiller ved bare at matche playerId til arrayets indeks, i stedet for at søge igennem arrayet. Det virkede ikke, da spillerne ikke nødvendigvis er i rækkefølge efter deres ID. Vi løste det ved at implementere en simpel FOR løkke, der gennemgår arrayet og sammenligner ID'erne.

## Hvad vi har lært om klasser
Ligesom en metode er effektiv til at dele ansvar op i små bidder, så er klasser effektive til at organisere kode i logiske enheder. 
Vi har lært, hvordan man kan bruge klasser til at repræsentere objekter som spil og spillere, og hvordan man kan bruge metoder til at manipulere disse objekter. 
Vi har også lært om konstruktorer, gettere og settere, samt hvordan man kan bruge arrays til at holde styr på flere objekter af samme type.

## Spørgsmål
I `addGame` og `addPlayer` har laver vi et tjek `gameCount > games.length`, som reelt aldrig kan blive sandt, fordi vi allerede stopper ved `==`. 
- Er det god skik at beholde det som en slags forebyggende kode, eller er det bedre at fjerne det, så det ikke forvirrer/fylder? Hvad er best practice her?