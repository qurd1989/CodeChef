package contest;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
public class RangeMinimze {
    private JPanel loadingPanel;
    private Timer timer;
    private double time = 0;

    public RangeMinimze() {
        JFrame form = new JFrame("Loading Animation");
        form.setTitle("Loading Animation");
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setSize(400, 400);
        form.setLayout(new BorderLayout());

        loadingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawLoadingAnimation(g);
            }
        };

        form.add(loadingPanel, BorderLayout.CENTER);
        form.setLocationRelativeTo(null);

         timer = new Timer(50, e -> {
             time += 0.5;
             loadingPanel.repaint();
            });

         timer.start();
         form.setVisible(true);
    }
    private void drawLoadingAnimation(Graphics g){
        int width = 100;
        int height = 100;
        int x = (loadingPanel.getWidth() - width)/2;
        int y = (loadingPanel.getHeight() - height)/2;

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, loadingPanel.getWidth(), loadingPanel.getHeight());
        g2d.setColor(Color.WHITE);
        for (int i = 0; i < 5; i++) {
             int xPosition = x + i * 20;
             int yPosition = (int) (y + Math.sin(time + i) * 10);
             drawArrow(g2d, xPosition, yPosition, 10-1);

        }

        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("Loading...", x + 15, y + height/2);
    }
    private  void drawArrow(Graphics g, int x, int y, int size){
       int[] xPoints = {x, x+size, x + size * 2};
       int [] yPoints = {y, y - size, y};
       g.fillPolygon(xPoints, yPoints, 3);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{ new RangeMinimze();});

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t--> 0) {
//            int n = sc.nextInt();
//            int A[] = new int[n];
//
//            // Read the array
//            for (int i = 0; i < n; i++) {
//                A[i] = sc.nextInt();
//            }
//            System.out.println("A: "+Arrays.toString(A));
//
//            Arrays.sort(A);
//            System.out.println("A: "+Arrays.toString(A));
//
//            if (n <= 3) {
//                System.out.println(0);
//                System.out.println("A: "+Arrays.toString(A));
//                continue;
//            }
//
//            int option1 = A[n-1] - A[2];
//            // Remove the largest two elements (keep elements from A[0] to A[N-3])
//            int option2 = A[n-3] - A[0];
//            System.out.println("option2: "+option2);
//            // Remove the smallest one and the largest one (keep elements from A[1] to A[N-2])
//            int option3 = A[n-2] - A[1];
//            System.out.println("option1: "+option1);
//
//            // Find the minimum of the three options
//            int result = Math.min(option1, Math.min(option2, option3));
//
//            // Output the result
//            System.out.println(result);
//        }
    }
}