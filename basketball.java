import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class basketball {

    private static String[] Firstname = new String[10];
    private static String[] Lastname = new String[10];
    private static int[] shotAttempt = new int[10];
    private static int[] shotMade = new int[10];
    private static double[] shotPercentage = new double[10];
    private static int[] defRb = new int[10];
    private static int[] offRb = new int[10];
    private static int[] ftAttempts = new int[10];
    private static int[] ftMade = new int[10];
    private static double[] ftPercent = new double[10];
    private static int[] assists = new int[10];
    private static int[] turnovers = new int[10];
    private static int[] totalPoint = new int[10];
    public static void main(String args[]) {
        Frame body = new Frame("Basketball");
        body.setSize(400, 400);
        body.setLayout(null);
        body.setVisible(true);

        Scanner reader = new Scanner(System.in);

        for(var i = 0; i < 1; i += 1) {
            for(var k = 0; k < 10; k += 1) {
                if(k == 0) {
                    System.out.println("First name: ");
                    Firstname[i] = reader.nextLine();
                }
                if(k == 1) {
                    System.out.println("Last Name: ");
                    Lastname[i] = reader.nextLine();
                }
                if(k == 2) {
                    System.out.println("Shot Attempts: ");
                    shotAttempt[i] = reader.nextInt();
                }
                if(k == 3) {
                    System.out.println("Shot Makes: ");
                    shotMade[i] = reader.nextInt();
                }
                if(k == 4) {
                    System.out.println("Defensive Rebounds: ");
                    defRb[i] = reader.nextInt();
                }
                if(k == 5) {
                    System.out.println("Offensive Rebounds: ");
                    offRb[i] = reader.nextInt();
                }
                if(k == 6) {
                    System.out.println("Free Throw Attempt: ");
                    ftAttempts[i] = reader.nextInt();
                }
                if(k == 7) {
                    System.out.println("Free Throw Made: ");
                    ftMade[i] = reader.nextInt();
                }
                if(k == 8) {
                    System.out.println("Assists: ");
                    assists[i] = reader.nextInt();
                }
                if(k == 9) {
                    System.out.println("Turnovers: ");
                    turnovers[i] = reader.nextInt();
                }
            }
        }

        for(var i = 0; i < 10; i += 1) {
            shotPercentage[i] = divide(shotMade[i], shotAttempt[i]);
            System.out.println(shotPercentage[i]);
        }

        int totalShotAttempt = sum(shotAttempt);
        int totalShotMade = sum(shotMade);
        int totalDefRb = sum(defRb);
        int totalOffRb = sum(offRb);
        int totalFtAttempts = sum(ftAttempts);
        int totalFtMade = sum(ftMade);
        int totalAssists = sum(assists);
        int totalTurnovers = sum(turnovers);
        int totalTeamPoints = sum(totalPoint);

        System.out.println(Arrays.toString(Firstname));
        System.out.println(shotMade);
        System.out.println(Arrays.toString(shotMade));
    }

    public static int sum(int[] array) {
        int calc = 0;
        for(var i : array) {
            calc += i;
        }
        return calc;
    }

    public static double divide(double made, double attempt) {
        double calc = (double) made / (double) attempt;
        return calc;
    }
}