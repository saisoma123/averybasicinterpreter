import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.*;
public class Driver {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromString("123*-213");
        basicLexer lexer = new basicLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        basicParser parser = new basicParser(tokens);
        System.out.println(parser.intExpr().val);
    }
}