import java.awt.*;
import java.util.Arrays;

public class Calculator {

    private static int buttonWidth = 40;
    private static int buttonHeight = 40;
    public static void main(String[] args) {
        // how to use object arrays?
        // Object[] buttons;

        Frame frame = new Frame("Calculator");
        Button addButton = new Button("+");
        Button subButton = new Button("-");
        Button multButton = new Button("x");
        Button divButton = new Button("/");
        Button eqButton = new Button("=");

        TextField input = new TextField("", 250);

        addButton.setBounds(350, 200, buttonWidth, buttonHeight);
        subButton.setBounds(350, 240, buttonWidth, buttonHeight);
        multButton.setBounds(350, 280, buttonWidth, buttonHeight);
        divButton.setBounds(350, 320, buttonWidth, buttonHeight);
        eqButton.setBounds(350, 360, buttonWidth, buttonHeight);
        // buttons.push(addButton);

        input.setBounds(50, 200, 150, 30);

        frame.add(addButton);
        frame.add(subButton);
        frame.add(multButton);
        frame.add(divButton);
        frame.add(eqButton);
        frame.add(input);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}