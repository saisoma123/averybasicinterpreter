grammar basic;


@parse::header {
    import basicinter.Exp;
    import basicinter.ArithOp;
    import basicinter.BasicOp;
    import basicinter.Number;
}
//@parse::members {
//    BasicOp oper = new BasicOp(ArithOp.ADD, $left.val, $right.val);
//}


parse
 : intExpr EOF
 ;
/*
 * Parser Rules
 */
intExpr returns [Exp<Integer> val] // int val
        : left=intExpr PLUS right=intExpr { $val = new BasicOp(ArithOp.ADD, $left.val, $right.val); } // new ArithExpr(ArithOp.PLUS, $left.val, $right.val) $val = $left.val + $right.val;
        | left=intExpr MINUS right=intExpr{ $val = new BasicOp(ArithOp.SUBTRACT, $left.val, $right.val); } // $val = $left.val - $right.val;
        | left=intExpr MULT right=intExpr{ $val = new BasicOp(ArithOp.MULTIPLY, $left.val, $right.val); } //$val = $left.val * $right.val;
        | left=intExpr DIV right=intExpr{ $val = new BasicOp(ArithOp.DIVIDE, $left.val, $right.val); } //$val = $left.val / $right.val;
        | NUMBER { $val = new Number(Integer.parseInt($NUMBER.text)); } //new IntegerLiteral(Integer.parseInt($NUMBER.text)) $val = Integer.parseInt($NUMBER.text);
        ;

/*
 * Lexer Rules
 */
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';

NUMBER     : [0-9]+ ;

SPACE
 : [ \t\r\n] -> skip
 ;