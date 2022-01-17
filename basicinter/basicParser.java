// Generated from basic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class basicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, NUMBER=5, SPACE=6;
	public static final int
		RULE_parse = 0, RULE_intExpr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "intExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULT", "DIV", "NUMBER", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "basic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public basicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(basicParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basicListener ) ((basicListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basicListener ) ((basicListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			intExpr(0);
			setState(5);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntExprContext extends ParserRuleContext {
		public Exp<Integer> val;
		public IntExprContext left;
		public Token NUMBER;
		public IntExprContext right;
		public TerminalNode NUMBER() { return getToken(basicParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(basicParser.PLUS, 0); }
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(basicParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(basicParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(basicParser.DIV, 0); }
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basicListener ) ((basicListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basicListener ) ((basicListener)listener).exitIntExpr(this);
		}
	}

	public final IntExprContext intExpr() throws RecognitionException {
		return intExpr(0);
	}

	private IntExprContext intExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntExprContext _localctx = new IntExprContext(_ctx, _parentState);
		IntExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_intExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(8);
			((IntExprContext)_localctx).NUMBER = match(NUMBER);
			 ((IntExprContext)_localctx).val =  new Number(Integer.parseInt((((IntExprContext)_localctx).NUMBER!=null?((IntExprContext)_localctx).NUMBER.getText():null))); 
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(31);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(11);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(12);
						match(PLUS);
						setState(13);
						((IntExprContext)_localctx).right = intExpr(6);
						 ((IntExprContext)_localctx).val =  new BasicOp(ArithOp.ADD, ((IntExprContext)_localctx).left.val, ((IntExprContext)_localctx).right.val); 
						}
						break;
					case 2:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(16);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(17);
						match(MINUS);
						setState(18);
						((IntExprContext)_localctx).right = intExpr(5);
						 ((IntExprContext)_localctx).val =  new BasicOp(ArithOp.SUBTRACT, ((IntExprContext)_localctx).left.val, ((IntExprContext)_localctx).right.val); 
						}
						break;
					case 3:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(21);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(22);
						match(MULT);
						setState(23);
						((IntExprContext)_localctx).right = intExpr(4);
						 ((IntExprContext)_localctx).val =  new BasicOp(ArithOp.MULTIPLY, ((IntExprContext)_localctx).left.val, ((IntExprContext)_localctx).right.val); 
						}
						break;
					case 4:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(26);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(27);
						match(DIV);
						setState(28);
						((IntExprContext)_localctx).right = intExpr(3);
						 ((IntExprContext)_localctx).val =  new BasicOp(ArithOp.DIVIDE, ((IntExprContext)_localctx).left.val, ((IntExprContext)_localctx).right.val); 
						}
						break;
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return intExpr_sempred((IntExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intExpr_sempred(IntExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\'\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%\13\3\3\3"+
		"\2\3\4\4\2\4\2\2\2(\2\6\3\2\2\2\4\t\3\2\2\2\6\7\5\4\3\2\7\b\7\2\2\3\b"+
		"\3\3\2\2\2\t\n\b\3\1\2\n\13\7\7\2\2\13\f\b\3\1\2\f#\3\2\2\2\r\16\f\7\2"+
		"\2\16\17\7\3\2\2\17\20\5\4\3\b\20\21\b\3\1\2\21\"\3\2\2\2\22\23\f\6\2"+
		"\2\23\24\7\4\2\2\24\25\5\4\3\7\25\26\b\3\1\2\26\"\3\2\2\2\27\30\f\5\2"+
		"\2\30\31\7\5\2\2\31\32\5\4\3\6\32\33\b\3\1\2\33\"\3\2\2\2\34\35\f\4\2"+
		"\2\35\36\7\6\2\2\36\37\5\4\3\5\37 \b\3\1\2 \"\3\2\2\2!\r\3\2\2\2!\22\3"+
		"\2\2\2!\27\3\2\2\2!\34\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2"+
		"\2%#\3\2\2\2\4!#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}