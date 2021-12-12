package com.company;

class Basketball {
    private final String firstTeam;
    private final String secondTeam;
    private int firstTeamScore;
    private int secondTeamScore;
    private String gameStatus;

    Basketball(String firstTeam, String secondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamScore = 0;
        this.secondTeamScore = 0;
        this.gameStatus = "In progress...";
    }

    public void onePoint(String team) {
        if (gameStatus.equals("In progress..."))
            if (team.equals(firstTeam))
                firstTeamScore++;
            else
                secondTeamScore++;
    }

    public void twoPoint(String team) {
        if (gameStatus.equals("In progress..."))
            if (team.equals(firstTeam))
                firstTeamScore += 2;
            else
                secondTeamScore += 2;
    }

    public void threePoint(String team) {
        if (gameStatus.equals("In progress..."))
            if (team.equals(firstTeam))
                firstTeamScore += 3;
            else
                secondTeamScore += 3;
    }

    public void changeGameStatus() {
        gameStatus = "Finished";
    }

    public int teamScore(String team) {
            return team.equals(firstTeam) ? firstTeamScore : secondTeamScore;
    }

    public String winningTeam() {
        return firstTeamScore > secondTeamScore ? firstTeam : secondTeam;
    }

    public void scoreSheet() {
        System.out.printf("\t\tFirst Team\tSecond Team\nName\t%-10s\t%s\nScore\t%-10d\t%d\nStatus\t%s\n", firstTeam, secondTeam,firstTeamScore,secondTeamScore, gameStatus);
    }
}

public class Main {

    public static void main(String[] args) {
        Basketball basketball = new Basketball("Dogs", "Cats");
        basketball.scoreSheet();
        basketball.threePoint("Cats");
        basketball.scoreSheet();
        basketball.changeGameStatus();
        basketball.scoreSheet();
    }
}