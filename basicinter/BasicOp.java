public class BasicOp implements Exp<Integer>
{

   ArithOp op;
   Exp<Integer> a, b;
   public BasicOp(ArithOp op, Exp<Integer> a, Exp<Integer> b)
   {
      this.op = op;
      this.a = a;
      this.b = b;
   }

	public Integer eval()
	{
		Integer x = 0;
      switch(op)
      {
         case ADD:
            x = a.eval() + b.eval();
            break;
            
         case SUBTRACT:
            x = a.eval() - b.eval();
            break;
         
         case MULTIPLY:
            x = a.eval() * b.eval();
            break;
            
         case DIVIDE:
            x = a.eval() / b.eval();
            break;
      }
      return x;
	}
   public String toString()
   {
      return " " + eval();
   }
}