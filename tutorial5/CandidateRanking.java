import java.util.*;

class Candidate {
    int Candidate_Id;
    String name;
    int aptitude;
    int technical;
    int communication;

    Candidate(int Candidate_Id, String name, int aptitude,
              int technical, int communication) {

        this.Candidate_Id = Candidate_Id;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    int getTotalScore() {
        return aptitude + technical + communication;
    }
}

public class CandidateRanking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Candidate[] candidates = new Candidate[N];

        for (int i = 0; i < N; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            int aptitude = sc.nextInt();
            int technical = sc.nextInt();
            int communication = sc.nextInt();

            candidates[i] = new Candidate(
                    id,
                    name,
                    aptitude,
                    technical,
                    communication
            );
        }

        Arrays.sort(candidates, new Comparator<Candidate>() {

            public int compare(Candidate c1, Candidate c2) {

                // Higher score first
                if (c1.getTotalScore() != c2.getTotalScore()) {
                    return c2.getTotalScore() - c1.getTotalScore();
                }

                // Smaller ID first
                return c1.Candidate_Id - c2.Candidate_Id;
            }
        });

        for (int i = 0; i < K; i++) {

            System.out.println(
                    candidates[i].Candidate_Id + " " +
                    candidates[i].name + " " +
                    candidates[i].getTotalScore()
            );
        }

        sc.close();
    }
}