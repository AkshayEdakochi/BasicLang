import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.Scanner;

import java.io.InputStream;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*; 


public class Calc extends JTextArea {

 public static JTextArea Calc (final InputStream out, final PrintWriter in) {
    final JTextArea area = new JTextArea();
        new SwingWorker<Void, String>() {
        @Override protected Void doInBackground() throws Exception {
            Scanner s = new Scanner(out);
            while (s.hasNextLine()) publish(s.nextLine() + "\n");
            return null;
        }
        @Override protected void process(List<String> chunks) {
            for (String line : chunks) area.append(line);
        }
    }.execute();
    area.addKeyListener(new KeyAdapter() {
        private StringBuffer line = new StringBuffer();
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (c == KeyEvent.VK_ENTER) {
                in.println(line);
                line.setLength(0); 
            } else if (c == KeyEvent.VK_BACK_SPACE) { 
                line.setLength(line.length() - 1); 
            } else if (!Character.isISOControl(c)) {
                line.append(e.getKeyChar());
            }
        }
    });
    area.setFont(new Font("Verdana", Font.PLAIN, 18));
    //area.setForeground(Color.BLUE);
    Color color = new Color(225,223,230);
    area.setBackground(color);


    return area;
}
public static void main(String[] args) throws IOException {
    PipedInputStream inPipe = new PipedInputStream();
    PipedInputStream outPipe = new PipedInputStream();
    System.setIn(inPipe);
    System.setOut(new PrintStream(new PipedOutputStream(outPipe), true));

    PrintWriter inWriter = new PrintWriter(new PipedOutputStream(inPipe), true);

    JFrame frame = new JFrame("കിളിവാതില്‍");

    JScrollPane jsp = new JScrollPane(Calc(outPipe, inWriter));
    jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    frame.getContentPane().add(jsp);
    frame.setSize(900, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

   // my code from Calc
    String inputFile = null;
	if(args.length>0) inputFile = args[0];
    InputStream is = System.in;
	if(inputFile != null) is = new FileInputStream(inputFile);
	CharStream input = CharStreams.fromStream(is);

    //if(inputFile != null)
    //System.out.println("ഇപ്പോള്‍ run ചെയ്യുന്ന പ്രോഗ്രാം" + args[0]);
    
    BasicLangLexer lexer = new BasicLangLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    BasicLangParser parser = new BasicLangParser(tokens);
    ParseTree tree = parser.parse();
    EvalVisitor visitor = new EvalVisitor();
    visitor.visit(tree);


  }
}