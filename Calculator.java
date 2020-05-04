import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        Frame frame = new Frame("Calculator");
        Button button = new Button("+");
        TextField input = new TextField("", 250);

        button.setBounds(50,100,150,30);
        input.setBounds(50, 200, 150, 30);
        frame.add(button);
        frame.add(input);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}