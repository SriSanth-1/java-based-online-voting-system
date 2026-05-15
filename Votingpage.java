import javax.swing.*;
import java.awt.event.*;

public class VotingPage extends JFrame implements ActionListener {

    JButton voteA;
    JButton voteB;
    JButton resultButton;

    static int candidateA = 0;
    static int candidateB = 0;

    VotingPage() {

        setTitle("Java Voting System");

        JLabel title = new JLabel("ONLINE VOTING SYSTEM");
        title.setBounds(90, 20, 250, 30);

        voteA = new JButton("Vote Candidate A");
        voteB = new JButton("Vote Candidate B");
        resultButton = new JButton("Show Results");

        voteA.setBounds(80, 80, 220, 40);
        voteB.setBounds(80, 150, 220, 40);
        resultButton.setBounds(80, 220, 220, 40);

        add(title);
        add(voteA);
        add(voteB);
        add(resultButton);

        voteA.addActionListener(this);
        voteB.addActionListener(this);
        resultButton.addActionListener(this);

        setSize(400, 350);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == voteA) {

            candidateA++;

            JOptionPane.showMessageDialog(
                    this,
                    "Vote Added to Candidate A"
            );

        } else if (e.getSource() == voteB) {

            candidateB++;

            JOptionPane.showMessageDialog(
                    this,
                    "Vote Added to Candidate B"
            );

        } else if (e.getSource() == resultButton) {

            new ResultPage();
        }
    }
}