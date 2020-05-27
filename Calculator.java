import java.awt.*;
import java.awt.event.ActionListener;
import java.text.*;
import java.awt.event.ActionEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Calculator {

    private static int buttonWidth = 40;
    private static int buttonHeight = 40;
    private static Frame frame = new Frame("Calculator");
    private static Button addButton = new Button("+");
    private static Button subButton = new Button("-");
    private static Button multButton = new Button("x");
    private static Button divButton = new Button("/");
    private static Button eqButton = new Button("=");
    private static Button one = new Button("1");
    private static Button two = new Button("2");
    private static Button three = new Button("3");
    private static Button four = new Button("4");
    private static Button five = new Button("5");
    private static Button six = new Button("6");
    private static Button seven = new Button("7");
    private static Button eight = new Button("8");
    private static Button nine = new Button("9");
    private static Button zero = new Button("0");
    private static Button decimal = new Button(".");
    private static Button negative = new Button("-");
    private static Button delete = new Button("<-");
    private static TextField input = new TextField("", 380);

    public static void main(String[] args) {
        // how to use object arrays?
        ArrayList<Number> numbers = new ArrayList<Number>();
        ArrayList<Button> buttons = new ArrayList<Button>();

        addButton.setBounds(350, 200, buttonWidth, buttonHeight);
        subButton.setBounds(350, 240, buttonWidth, buttonHeight);
        multButton.setBounds(350, 280, buttonWidth, buttonHeight);
        divButton.setBounds(350, 320, buttonWidth, buttonHeight);
        eqButton.setBounds(270, 360, buttonWidth * 3, buttonHeight);
        one.setBounds(230, 200, buttonWidth, buttonHeight);
        two.setBounds(270, 200, buttonWidth, buttonHeight);
        three.setBounds(310, 200, buttonWidth, buttonHeight);
        four.setBounds(230, 240, buttonWidth, buttonHeight);
        five.setBounds(270, 240, buttonWidth, buttonHeight);
        six.setBounds(310, 240, buttonWidth, buttonHeight);
        seven.setBounds(230, 280, buttonWidth, buttonHeight);
        eight.setBounds(270, 280, buttonWidth, buttonHeight);
        nine.setBounds(310, 280, buttonWidth, buttonHeight);
        zero.setBounds(270, 320, buttonWidth, buttonHeight);
        decimal.setBounds(230, 320, buttonWidth, buttonHeight);
        negative.setBounds(310, 320, buttonWidth, buttonHeight);
        delete.setBounds(230, 360, buttonWidth, buttonHeight);

        // addButton.setActionCommand("+");
        // subButton.setActionCommand("-");
        // multButton.setActionCommand("*");
        // divButton.setActionCommand("/");
        // one.setActionCommand("1");
        // two.setActionCommand("2");
        // three.setActionCommand("3");
        // four.setActionCommand("4");
        // five.setActionCommand("5");
        // six.setActionCommand("6");
        // seven.setActionCommand("7");
        // eight.setActionCommand("8");
        // nine.setActionCommand("9");
        // zero.setActionCommand("0");

        buttons.add(addButton);
        buttons.add(subButton);
        buttons.add(multButton);
        buttons.add(divButton);
        buttons.add(eqButton);
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(seven);
        buttons.add(eight);
        buttons.add(nine);
        buttons.add(zero);
        buttons.add(decimal);
        buttons.add(negative);
        buttons.add(delete);

        for (Button but : buttons) {
            if(but.getActionCommand() != "=") {
                but.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(e.getActionCommand());
                        input.setText(input.getText() + e.getActionCommand());
                    }
                });
            }

            frame.add(but);
        }

        eqButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String symbols = "/D";
                Pattern symbolsPattern = Pattern.compile(symbols);

                Matcher symbolsMatched = symbolsPattern.matcher(input.getText());

                if(symbolsMatched.find()) {
                    System.out.println(symbolsMatched.group(0));
                    System.out.println("worked");
                } else {
                    System.out.println(input.getText());
                }
            }
        });

        input.setBounds(10, 170, 380, 30);

        frame.add(input);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}