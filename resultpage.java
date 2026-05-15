import javax.swing.*;

public class ResultPage extends JFrame {

    ResultPage() {

        setTitle("Voting Results");

        JLabel title = new JLabel("RESULT PAGE");
        title.setBounds(120, 20, 200, 30);

        JLabel result1 = new JLabel(
                "Candidate A Votes : " + VotingPage.candidateA
        );

        JLabel result2 = new JLabel(
                "Candidate B Votes : " + VotingPage.candidateB
        );

        result1.setBounds(70, 80, 250, 30);
        result2.setBounds(70, 130, 250, 30);

        add(title);
        add(result1);
        add(result2);

        setSize(400, 250);
        setLayout(null);
        setVisible(true);
    }
}