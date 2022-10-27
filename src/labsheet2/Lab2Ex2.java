package labsheet2;

import javax.swing.JOptionPane;

public class Lab2Ex2 {
    public static void main(String[] args) {

        String decision;
        int p=0, c=0, draw=0, pScore, cScore, pWin=0, cWin=0, gamesPlayed=0;

        //QUESTION TO ASK IF PLAYER WANTS TO PLAY THE GAME
        decision = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no");

        while(decision.equalsIgnoreCase("yes"))
        {
            //USING METHOD TO ROLL THE RANDOM NUMBER
            cScore = rollTheDice(c);

            JOptionPane.showMessageDialog(null, "The computer roll generated the value "+cScore + "\n.... now hit return to see the player roll","Computer Roll",JOptionPane.INFORMATION_MESSAGE);

            pScore = rollTheDice(p);

            JOptionPane.showMessageDialog(null,"The player roll generated the value "+pScore,"Player roll",JOptionPane.INFORMATION_MESSAGE);

            //IF STATEMENTS TO CHECK FOR WHO WON
            if(pScore > cScore)
                pWin++;
            else if(cScore > pScore)
                cWin++;
            else
                draw++;

            //GAME INFO PRINT OUT
            JOptionPane.showMessageDialog(null, "Games played: "+(gamesPlayed+1)+"\nComputer Wins: "+cWin+"\nPlayer Wins: "+pWin+"\nDraws: "+draw,"Game info",JOptionPane.INFORMATION_MESSAGE);

            decision = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no");
            //GAMES PLAYED COUNTER
            gamesPlayed++;
        }

        while(decision.equalsIgnoreCase("no"))
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing the game!","Farewell",JOptionPane.INFORMATION_MESSAGE);
            break;

        }


    }
    public static int rollTheDice(int random)
    {

        random = (int)(Math.random()*(12-2+1)+2);

        return random;
    }
}
