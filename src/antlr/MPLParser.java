// Generated from src\antlr\MPL.g4 by ANTLR 4.1

    package mpl.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MPLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, TONE=9, 
		WS=10, ID=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'_'", "'#'", "'''", "':'", "'['", "';'", "'|'", "']'", "TONE", 
		"WS", "ID"
	};
	public static final int
		RULE_goal = 0, RULE_header = 1, RULE_attribute = 2, RULE_attrKey = 3, 
		RULE_attrVal = 4, RULE_body = 5, RULE_expr = 6, RULE_measure = 7, RULE_notes = 8, 
		RULE_note = 9, RULE_repeat = 10;
	public static final String[] ruleNames = {
		"goal", "header", "attribute", "attrKey", "attrVal", "body", "expr", "measure", 
		"notes", "note", "repeat"
	};

	@Override
	public String getGrammarFileName() { return "MPL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MPLParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); header();
			setState(23); body();
			setState(24); match(EOF);
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

	public static class HeaderContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(26); attribute();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AttributeContext extends ParserRuleContext {
		public AttrKeyContext attrKey() {
			return getRuleContext(AttrKeyContext.class,0);
		}
		public AttrValContext attrVal() {
			return getRuleContext(AttrValContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); attrKey();
			setState(33); match(4);
			setState(34); attrVal();
			setState(35); match(6);
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

	public static class AttrKeyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MPLParser.ID, 0); }
		public AttrKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterAttrKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitAttrKey(this);
		}
	}

	public final AttrKeyContext attrKey() throws RecognitionException {
		AttrKeyContext _localctx = new AttrKeyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attrKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(ID);
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

	public static class AttrValContext extends ParserRuleContext {
		public AttrValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterAttrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitAttrVal(this);
		}
	}

	public final AttrValContext attrVal() throws RecognitionException {
		AttrValContext _localctx = new AttrValContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attrVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 7) | (1L << 8) | (1L << TONE) | (1L << WS) | (1L << ID))) != 0)) {
				{
				{
				setState(39);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==6) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class BodyContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5 || _la==7) {
				{
				{
				setState(45); expr();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ExprContext extends ParserRuleContext {
		public MeasureContext measure() {
			return getRuleContext(MeasureContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(53);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); measure();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); repeat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MeasureContext extends ParserRuleContext {
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitMeasure(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_measure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(7);
			setState(56); notes();
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

	public static class NotesContext extends ParserRuleContext {
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public NotesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterNotes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitNotes(this);
		}
	}

	public final NotesContext notes() throws RecognitionException {
		NotesContext _localctx = new NotesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_notes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58); note();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << TONE))) != 0) );
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

	public static class NoteContext extends ParserRuleContext {
		public TerminalNode TONE() { return getToken(MPLParser.TONE, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1 || _la==2) {
				{
				{
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==1 || _la==2) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69); match(TONE);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(70); match(3);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class RepeatContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MPLListener ) ((MPLListener)listener).exitRepeat(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(5);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5 || _la==7) {
				{
				{
				setState(77); expr();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83); match(8);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\rX\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\7\6+\n\6\f\6\16\6.\13\6\3\7\7\7\61\n\7\f\7\16\7\64\13\7"+
		"\3\b\3\b\5\b8\n\b\3\t\3\t\3\t\3\n\6\n>\n\n\r\n\16\n?\3\13\7\13C\n\13\f"+
		"\13\16\13F\13\13\3\13\3\13\7\13J\n\13\f\13\16\13M\13\13\3\f\3\f\7\fQ\n"+
		"\f\f\f\16\fT\13\f\3\f\3\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\b"+
		"\b\3\2\3\4T\2\30\3\2\2\2\4\37\3\2\2\2\6\"\3\2\2\2\b\'\3\2\2\2\n,\3\2\2"+
		"\2\f\62\3\2\2\2\16\67\3\2\2\2\209\3\2\2\2\22=\3\2\2\2\24D\3\2\2\2\26N"+
		"\3\2\2\2\30\31\5\4\3\2\31\32\5\f\7\2\32\33\7\2\2\3\33\3\3\2\2\2\34\36"+
		"\5\6\4\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2"+
		"\2!\37\3\2\2\2\"#\5\b\5\2#$\7\6\2\2$%\5\n\6\2%&\7\b\2\2&\7\3\2\2\2\'("+
		"\7\r\2\2(\t\3\2\2\2)+\n\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2"+
		"-\13\3\2\2\2.,\3\2\2\2/\61\5\16\b\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3"+
		"\2\2\2\62\63\3\2\2\2\63\r\3\2\2\2\64\62\3\2\2\2\658\5\20\t\2\668\5\26"+
		"\f\2\67\65\3\2\2\2\67\66\3\2\2\28\17\3\2\2\29:\7\t\2\2:;\5\22\n\2;\21"+
		"\3\2\2\2<>\5\24\13\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\23\3\2\2"+
		"\2AC\t\3\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2"+
		"\2GK\7\13\2\2HJ\7\5\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\25\3"+
		"\2\2\2MK\3\2\2\2NR\7\7\2\2OQ\5\16\b\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS"+
		"\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\n\2\2V\27\3\2\2\2\n\37,\62\67?DKR";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}