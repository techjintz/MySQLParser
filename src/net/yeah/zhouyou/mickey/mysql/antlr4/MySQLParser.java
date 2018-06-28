// Generated from src/net/yeah/zhouyou/mickey/mysql/antlr4/MySQL.g4 by ANTLR 4.5.3
package net.yeah.zhouyou.mickey.mysql.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PLACEHOLDER=2, SELECT=3, INSERT=4, INTO=5, VALUES=6, DELETE=7, 
		FROM=8, WHERE=9, LIMIT=10, NULL=11, IS=12, IN=13, BETWEEN=14, EXISTS=15, 
		TRUE=16, FALSE=17, XOR=18, DEFAULT=19, UPDATE=20, SET=21, ORDER=22, GROUP=23, 
		BY=24, FOR=25, LIKE=26, HAVING=27, AS=28, INNER=29, OUTER=30, JOIN=31, 
		LEFT=32, RIGHT=33, ON=34, DISTINCT=35, OFFSET=36, ASC=37, DESC=38, CROSS=39, 
		USING=40, DATE=41, TIME=42, TIMESTAMP=43, ALL=44, ANY=45, SOME=46, UNION=47, 
		UNKNOWN=48, LOCK=49, SHARE=50, MODE=51, COMMIT=52, ROLLBACK=53, CASE=54, 
		WHEN=55, THEN=56, ELSE=57, END=58, ROW=59, BINARY=60, AND=61, OR=62, NOT=63, 
		DIV=64, MOD=65, PLUS=66, MINUS=67, VERTBAR=68, BITAND=69, SHIFT_LEFT=70, 
		SHIFT_RIGHT=71, ASTERISK=72, POWER_OP=73, INT=74, DECIMAL=75, STRING=76, 
		ID=77, COLUMN_REL=78, REGEXP=79, NEGATION=80, ESCAPE=81, RPAREN=82, LPAREN=83, 
		RBRACK=84, LBRACK=85, COLON=86, ALL_FIELDS=87, EQ=88, LTH=89, GTH=90, 
		NOT_EQ=91, LET=92, GET=93, SEMI=94, COMMA=95, DOT=96, COLLATE=97, INDEX=98, 
		KEY=99, USE=100, IGNORE=101, PARTITION=102, STRAIGHT_JOIN=103, NATURAL=104, 
		OJ=105, NEWLINE=106, WS=107, COMMENT1=108, COMMENT2=109, USER_VAR=110;
	public static final int
		RULE_stat = 0, RULE_transcationStat = 1, RULE_commit = 2, RULE_rollback = 3, 
		RULE_insertStat = 4, RULE_columnNames = 5, RULE_valueList = 6, RULE_selectStat = 7, 
		RULE_selectInner = 8, RULE_selectPrefix = 9, RULE_selectSuffix = 10, RULE_selectUnionSuffix = 11, 
		RULE_selectExprs = 12, RULE_selectExprsSuffix = 13, RULE_tables = 14, 
		RULE_tableSuffix = 15, RULE_tableRel = 16, RULE_tableFactor = 17, RULE_tableSubQuery = 18, 
		RULE_tableRecu = 19, RULE_tableJoin = 20, RULE_tableJoinSuffix = 21, RULE_tableJoinMod = 22, 
		RULE_joinCondition = 23, RULE_gbobExprs = 24, RULE_gbobExprSuffix = 25, 
		RULE_updateStat = 26, RULE_updateSingleTable = 27, RULE_updateMultipleTable = 28, 
		RULE_setExprs = 29, RULE_setExprSuffix = 30, RULE_setExpr = 31, RULE_deleteStat = 32, 
		RULE_tableNameAndAlias = 33, RULE_tableNameAndAliases = 34, RULE_tableNameAndAliasSuffix = 35, 
		RULE_whereCondition = 36, RULE_whereCondSub = 37, RULE_whereCondOp = 38, 
		RULE_expression = 39, RULE_exprRelational = 40, RULE_exprBetweenAnd = 41, 
		RULE_exprIsOrIsNotNull = 42, RULE_exprInSelect = 43, RULE_exprInValues = 44, 
		RULE_exprExists = 45, RULE_exprNot = 46, RULE_exprLike = 47, RULE_element = 48, 
		RULE_elementOpFactory = 49, RULE_elementText = 50, RULE_elementTextParam = 51, 
		RULE_elementDate = 52, RULE_elementSubQuery = 53, RULE_elementWapperBkt = 54, 
		RULE_elementListFactor = 55, RULE_elementList = 56, RULE_elementListSuffix = 57, 
		RULE_elementOpEle = 58, RULE_elementOpEleSuffix = 59, RULE_elementCase = 60, 
		RULE_caseWhenPart = 61, RULE_elementWithPrefix = 62, RULE_elementRow = 63, 
		RULE_funCall = 64, RULE_paramList = 65, RULE_paramSuffix = 66;
	public static final String[] ruleNames = {
		"stat", "transcationStat", "commit", "rollback", "insertStat", "columnNames", 
		"valueList", "selectStat", "selectInner", "selectPrefix", "selectSuffix", 
		"selectUnionSuffix", "selectExprs", "selectExprsSuffix", "tables", "tableSuffix", 
		"tableRel", "tableFactor", "tableSubQuery", "tableRecu", "tableJoin", 
		"tableJoinSuffix", "tableJoinMod", "joinCondition", "gbobExprs", "gbobExprSuffix", 
		"updateStat", "updateSingleTable", "updateMultipleTable", "setExprs", 
		"setExprSuffix", "setExpr", "deleteStat", "tableNameAndAlias", "tableNameAndAliases", 
		"tableNameAndAliasSuffix", "whereCondition", "whereCondSub", "whereCondOp", 
		"expression", "exprRelational", "exprBetweenAnd", "exprIsOrIsNotNull", 
		"exprInSelect", "exprInValues", "exprExists", "exprNot", "exprLike", "element", 
		"elementOpFactory", "elementText", "elementTextParam", "elementDate", 
		"elementSubQuery", "elementWapperBkt", "elementListFactor", "elementList", 
		"elementListSuffix", "elementOpEle", "elementOpEleSuffix", "elementCase", 
		"caseWhenPart", "elementWithPrefix", "elementRow", "funCall", "paramList", 
		"paramSuffix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'+'", "'-'", "'|'", "'&'", "'<<'", 
		"'>>'", "'*'", "'^'", null, null, null, null, null, "'regexp'", "'~'", 
		"'escape'", "')'", "'('", "']'", "'['", "':'", "'.*'", "'='", "'<'", "'>'", 
		"'!='", "'<='", "'>='", "';'", "','", "'.'", "'collate'", "'index'", "'key'", 
		"'use'", "'ignore'", "'partition'", "'straight_join'", "'natural'", "'oj'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PLACEHOLDER", "SELECT", "INSERT", "INTO", "VALUES", "DELETE", 
		"FROM", "WHERE", "LIMIT", "NULL", "IS", "IN", "BETWEEN", "EXISTS", "TRUE", 
		"FALSE", "XOR", "DEFAULT", "UPDATE", "SET", "ORDER", "GROUP", "BY", "FOR", 
		"LIKE", "HAVING", "AS", "INNER", "OUTER", "JOIN", "LEFT", "RIGHT", "ON", 
		"DISTINCT", "OFFSET", "ASC", "DESC", "CROSS", "USING", "DATE", "TIME", 
		"TIMESTAMP", "ALL", "ANY", "SOME", "UNION", "UNKNOWN", "LOCK", "SHARE", 
		"MODE", "COMMIT", "ROLLBACK", "CASE", "WHEN", "THEN", "ELSE", "END", "ROW", 
		"BINARY", "AND", "OR", "NOT", "DIV", "MOD", "PLUS", "MINUS", "VERTBAR", 
		"BITAND", "SHIFT_LEFT", "SHIFT_RIGHT", "ASTERISK", "POWER_OP", "INT", 
		"DECIMAL", "STRING", "ID", "COLUMN_REL", "REGEXP", "NEGATION", "ESCAPE", 
		"RPAREN", "LPAREN", "RBRACK", "LBRACK", "COLON", "ALL_FIELDS", "EQ", "LTH", 
		"GTH", "NOT_EQ", "LET", "GET", "SEMI", "COMMA", "DOT", "COLLATE", "INDEX", 
		"KEY", "USE", "IGNORE", "PARTITION", "STRAIGHT_JOIN", "NATURAL", "OJ", 
		"NEWLINE", "WS", "COMMENT1", "COMMENT2", "USER_VAR"
	};
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
	public String getGrammarFileName() { return "MySQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public InsertStatContext insertStat() {
			return getRuleContext(InsertStatContext.class,0);
		}
		public UpdateStatContext updateStat() {
			return getRuleContext(UpdateStatContext.class,0);
		}
		public DeleteStatContext deleteStat() {
			return getRuleContext(DeleteStatContext.class,0);
		}
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TranscationStatContext transcationStat() {
			return getRuleContext(TranscationStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				insertStat();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				updateStat();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				deleteStat();
				}
				break;
			case SELECT:
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				selectStat();
				}
				break;
			case COMMIT:
			case ROLLBACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				transcationStat();
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

	public static class TranscationStatContext extends ParserRuleContext {
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public TranscationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transcationStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTranscationStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTranscationStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTranscationStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranscationStatContext transcationStat() throws RecognitionException {
		TranscationStatContext _localctx = new TranscationStatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_transcationStat);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case COMMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				commit();
				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				rollback();
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(MySQLParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(COMMIT);
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

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(MySQLParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ROLLBACK);
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

	public static class InsertStatContext extends ParserRuleContext {
		public Token tableName;
		public TerminalNode INSERT() { return getToken(MySQLParser.INSERT, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode INTO() { return getToken(MySQLParser.INTO, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySQLParser.VALUES, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public InsertStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterInsertStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitInsertStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitInsertStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatContext insertStat() throws RecognitionException {
		InsertStatContext _localctx = new InsertStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insertStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(INSERT);
			setState(151);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(150);
				match(INTO);
				}
			}

			setState(153);
			((InsertStatContext)_localctx).tableName = match(ID);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(154);
				match(LPAREN);
				setState(155);
				columnNames();
				setState(156);
				match(RPAREN);
				}
				break;
			}
			setState(166);
			switch (_input.LA(1)) {
			case VALUES:
				{
				{
				setState(160);
				match(VALUES);
				setState(161);
				match(LPAREN);
				setState(162);
				valueList();
				setState(163);
				match(RPAREN);
				}
				}
				break;
			case SELECT:
			case LPAREN:
				{
				setState(165);
				selectStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MySQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLParser.ID, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnNames);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					match(ID);
					setState(169);
					match(COMMA);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(175);
			match(ID);
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

	public static class ValueListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					element();
					setState(178);
					match(COMMA);
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(185);
			element();
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

	public static class SelectStatContext extends ParserRuleContext {
		public SelectInnerContext selectInner() {
			return getRuleContext(SelectInnerContext.class,0);
		}
		public SelectUnionSuffixContext selectUnionSuffix() {
			return getRuleContext(SelectUnionSuffixContext.class,0);
		}
		public SelectStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatContext selectStat() throws RecognitionException {
		SelectStatContext _localctx = new SelectStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(187);
				match(LPAREN);
				setState(188);
				selectInner();
				setState(189);
				match(RPAREN);
				}
				break;
			case SELECT:
				{
				setState(191);
				selectInner();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			_la = _input.LA(1);
			if (_la==UNION) {
				{
				setState(194);
				selectUnionSuffix();
				}
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

	public static class SelectInnerContext extends ParserRuleContext {
		public SelectPrefixContext selectPrefix() {
			return getRuleContext(SelectPrefixContext.class,0);
		}
		public SelectSuffixContext selectSuffix() {
			return getRuleContext(SelectSuffixContext.class,0);
		}
		public SelectInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectInnerContext selectInner() throws RecognitionException {
		SelectInnerContext _localctx = new SelectInnerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectInner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			selectPrefix();
			setState(198);
			selectSuffix();
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

	public static class SelectPrefixContext extends ParserRuleContext {
		public Token distinct;
		public WhereConditionContext where;
		public GbobExprsContext groupByExprs;
		public WhereConditionContext having;
		public TerminalNode SELECT() { return getToken(MySQLParser.SELECT, 0); }
		public SelectExprsContext selectExprs() {
			return getRuleContext(SelectExprsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(MySQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MySQLParser.BY, 0); }
		public TerminalNode HAVING() { return getToken(MySQLParser.HAVING, 0); }
		public TerminalNode DISTINCT() { return getToken(MySQLParser.DISTINCT, 0); }
		public List<WhereConditionContext> whereCondition() {
			return getRuleContexts(WhereConditionContext.class);
		}
		public WhereConditionContext whereCondition(int i) {
			return getRuleContext(WhereConditionContext.class,i);
		}
		public GbobExprsContext gbobExprs() {
			return getRuleContext(GbobExprsContext.class,0);
		}
		public SelectPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectPrefixContext selectPrefix() throws RecognitionException {
		SelectPrefixContext _localctx = new SelectPrefixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(SELECT);
			setState(202);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(201);
				((SelectPrefixContext)_localctx).distinct = match(DISTINCT);
				}
			}

			setState(204);
			selectExprs();
			setState(207);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(205);
				match(FROM);
				setState(206);
				tables();
				}
			}

			setState(211);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(209);
				match(WHERE);
				setState(210);
				((SelectPrefixContext)_localctx).where = whereCondition();
				}
			}

			setState(216);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(213);
				match(GROUP);
				setState(214);
				match(BY);
				setState(215);
				((SelectPrefixContext)_localctx).groupByExprs = gbobExprs();
				}
			}

			setState(220);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(218);
				match(HAVING);
				setState(219);
				((SelectPrefixContext)_localctx).having = whereCondition();
				}
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

	public static class SelectSuffixContext extends ParserRuleContext {
		public GbobExprsContext orderByExprs;
		public Token offset;
		public Token rowCount;
		public Token lock;
		public TerminalNode ORDER() { return getToken(MySQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLParser.BY, 0); }
		public TerminalNode LIMIT() { return getToken(MySQLParser.LIMIT, 0); }
		public GbobExprsContext gbobExprs() {
			return getRuleContext(GbobExprsContext.class,0);
		}
		public TerminalNode FOR() { return getToken(MySQLParser.FOR, 0); }
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public TerminalNode SHARE() { return getToken(MySQLParser.SHARE, 0); }
		public TerminalNode MODE() { return getToken(MySQLParser.MODE, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLParser.UPDATE, 0); }
		public TerminalNode LOCK() { return getToken(MySQLParser.LOCK, 0); }
		public TerminalNode OFFSET() { return getToken(MySQLParser.OFFSET, 0); }
		public List<TerminalNode> INT() { return getTokens(MySQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MySQLParser.INT, i);
		}
		public List<TerminalNode> PLACEHOLDER() { return getTokens(MySQLParser.PLACEHOLDER); }
		public TerminalNode PLACEHOLDER(int i) {
			return getToken(MySQLParser.PLACEHOLDER, i);
		}
		public SelectSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSuffixContext selectSuffix() throws RecognitionException {
		SelectSuffixContext _localctx = new SelectSuffixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(222);
				match(ORDER);
				setState(223);
				match(BY);
				setState(224);
				((SelectSuffixContext)_localctx).orderByExprs = gbobExprs();
				}
				break;
			}
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(227);
				match(LIMIT);
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(228);
						((SelectSuffixContext)_localctx).offset = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLACEHOLDER || _la==INT) ) {
							((SelectSuffixContext)_localctx).offset = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(229);
						match(COMMA);
						}
						break;
					}
					setState(232);
					((SelectSuffixContext)_localctx).rowCount = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLACEHOLDER || _la==INT) ) {
						((SelectSuffixContext)_localctx).rowCount = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				case 2:
					{
					{
					setState(233);
					((SelectSuffixContext)_localctx).rowCount = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLACEHOLDER || _la==INT) ) {
						((SelectSuffixContext)_localctx).rowCount = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(234);
					match(OFFSET);
					setState(235);
					((SelectSuffixContext)_localctx).offset = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLACEHOLDER || _la==INT) ) {
						((SelectSuffixContext)_localctx).offset = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				}
				}
				break;
			}
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				{
				setState(240);
				match(FOR);
				setState(241);
				((SelectSuffixContext)_localctx).lock = match(UPDATE);
				}
				}
				break;
			case 2:
				{
				{
				setState(242);
				((SelectSuffixContext)_localctx).lock = match(LOCK);
				setState(243);
				match(IN);
				setState(244);
				match(SHARE);
				setState(245);
				match(MODE);
				}
				}
				break;
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

	public static class SelectUnionSuffixContext extends ParserRuleContext {
		public Token method;
		public TerminalNode UNION() { return getToken(MySQLParser.UNION, 0); }
		public SelectSuffixContext selectSuffix() {
			return getRuleContext(SelectSuffixContext.class,0);
		}
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(MySQLParser.DISTINCT, 0); }
		public SelectUnionSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectUnionSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectUnionSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectUnionSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectUnionSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectUnionSuffixContext selectUnionSuffix() throws RecognitionException {
		SelectUnionSuffixContext _localctx = new SelectUnionSuffixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectUnionSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(UNION);
			setState(250);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(249);
				((SelectUnionSuffixContext)_localctx).method = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
					((SelectUnionSuffixContext)_localctx).method = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(252);
				match(LPAREN);
				setState(253);
				selectStat();
				setState(254);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(256);
				selectStat();
				}
				break;
			}
			setState(259);
			selectSuffix();
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

	public static class SelectExprsContext extends ParserRuleContext {
		public Token alias;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public SelectExprsSuffixContext selectExprsSuffix() {
			return getRuleContext(SelectExprsSuffixContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
		public SelectExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprsContext selectExprs() throws RecognitionException {
		SelectExprsContext _localctx = new SelectExprsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			element();
			setState(266);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(263);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(262);
					match(AS);
					}
				}

				setState(265);
				((SelectExprsContext)_localctx).alias = match(ID);
				}
			}

			setState(269);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(268);
				selectExprsSuffix();
				}
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

	public static class SelectExprsSuffixContext extends ParserRuleContext {
		public SelectExprsContext selectExprs() {
			return getRuleContext(SelectExprsContext.class,0);
		}
		public SelectExprsSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExprsSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectExprsSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectExprsSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectExprsSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprsSuffixContext selectExprsSuffix() throws RecognitionException {
		SelectExprsSuffixContext _localctx = new SelectExprsSuffixContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectExprsSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(COMMA);
			setState(272);
			selectExprs();
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

	public static class TablesContext extends ParserRuleContext {
		public TableRelContext tableRel() {
			return getRuleContext(TableRelContext.class,0);
		}
		public TableSuffixContext tableSuffix() {
			return getRuleContext(TableSuffixContext.class,0);
		}
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablesContext tables() throws RecognitionException {
		TablesContext _localctx = new TablesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			tableRel();
			setState(276);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(275);
				tableSuffix();
				}
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

	public static class TableSuffixContext extends ParserRuleContext {
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public TableSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSuffixContext tableSuffix() throws RecognitionException {
		TableSuffixContext _localctx = new TableSuffixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tableSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(COMMA);
			setState(279);
			tables();
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

	public static class TableRelContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public TableJoinContext tableJoin() {
			return getRuleContext(TableJoinContext.class,0);
		}
		public TableRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRelContext tableRel() throws RecognitionException {
		TableRelContext _localctx = new TableRelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableRel);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				tableFactor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				tableJoin();
				}
				break;
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

	public static class TableFactorContext extends ParserRuleContext {
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TableSubQueryContext tableSubQuery() {
			return getRuleContext(TableSubQueryContext.class,0);
		}
		public TableRecuContext tableRecu() {
			return getRuleContext(TableRecuContext.class,0);
		}
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tableFactor);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				tableNameAndAlias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				tableSubQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				tableRecu();
				}
				break;
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

	public static class TableSubQueryContext extends ParserRuleContext {
		public Token alias;
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
		public TableSubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSubQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableSubQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableSubQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSubQueryContext tableSubQuery() throws RecognitionException {
		TableSubQueryContext _localctx = new TableSubQueryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableSubQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(LPAREN);
			setState(291);
			selectStat();
			setState(292);
			match(RPAREN);
			setState(294);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(293);
				match(AS);
				}
			}

			setState(296);
			((TableSubQueryContext)_localctx).alias = match(ID);
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

	public static class TableRecuContext extends ParserRuleContext {
		public TableRelContext tableRel() {
			return getRuleContext(TableRelContext.class,0);
		}
		public TableRecuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRecu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableRecu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableRecu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableRecu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRecuContext tableRecu() throws RecognitionException {
		TableRecuContext _localctx = new TableRecuContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableRecu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(LPAREN);
			setState(299);
			tableRel();
			setState(300);
			match(RPAREN);
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

	public static class TableJoinContext extends ParserRuleContext {
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TableJoinSuffixContext tableJoinSuffix() {
			return getRuleContext(TableJoinSuffixContext.class,0);
		}
		public TableJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableJoinContext tableJoin() throws RecognitionException {
		TableJoinContext _localctx = new TableJoinContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			tableNameAndAlias();
			setState(303);
			tableJoinSuffix();
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

	public static class TableJoinSuffixContext extends ParserRuleContext {
		public TableJoinModContext tableJoinMod() {
			return getRuleContext(TableJoinModContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TableNameAndAliasesContext tableNameAndAliases() {
			return getRuleContext(TableNameAndAliasesContext.class,0);
		}
		public TableRecuContext tableRecu() {
			return getRuleContext(TableRecuContext.class,0);
		}
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public TableJoinSuffixContext tableJoinSuffix() {
			return getRuleContext(TableJoinSuffixContext.class,0);
		}
		public TableJoinSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableJoinSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableJoinSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableJoinSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableJoinSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableJoinSuffixContext tableJoinSuffix() throws RecognitionException {
		TableJoinSuffixContext _localctx = new TableJoinSuffixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableJoinSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			tableJoinMod();
			setState(306);
			match(JOIN);
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(307);
				tableNameAndAliases();
				}
				break;
			case 2:
				{
				setState(308);
				match(LPAREN);
				setState(309);
				tableNameAndAliases();
				setState(310);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(312);
				tableRecu();
				}
				break;
			}
			setState(316);
			_la = _input.LA(1);
			if (_la==ON || _la==USING) {
				{
				setState(315);
				joinCondition();
				}
			}

			setState(319);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INNER) | (1L << LEFT) | (1L << RIGHT) | (1L << CROSS))) != 0)) {
				{
				setState(318);
				tableJoinSuffix();
				}
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

	public static class TableJoinModContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(MySQLParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TableJoinModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableJoinMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableJoinMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableJoinMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableJoinMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableJoinModContext tableJoinMod() throws RecognitionException {
		TableJoinModContext _localctx = new TableJoinModContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableJoinMod);
		int _la;
		try {
			setState(331);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(INNER);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(CROSS);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(LEFT);
				setState(325);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(324);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				match(RIGHT);
				setState(329);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(328);
					match(OUTER);
					}
				}

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

	public static class JoinConditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
		public TerminalNode USING() { return getToken(MySQLParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterJoinCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitJoinCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_joinCondition);
		try {
			setState(340);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(ON);
				setState(334);
				whereCondition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(USING);
				setState(336);
				match(LPAREN);
				setState(337);
				columnNames();
				setState(338);
				match(RPAREN);
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

	public static class GbobExprsContext extends ParserRuleContext {
		public Token sc;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public GbobExprSuffixContext gbobExprSuffix() {
			return getRuleContext(GbobExprSuffixContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MySQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLParser.DESC, 0); }
		public GbobExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gbobExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterGbobExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitGbobExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitGbobExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GbobExprsContext gbobExprs() throws RecognitionException {
		GbobExprsContext _localctx = new GbobExprsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_gbobExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			element();
			setState(344);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(343);
				((GbobExprsContext)_localctx).sc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((GbobExprsContext)_localctx).sc = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(347);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(346);
				gbobExprSuffix();
				}
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

	public static class GbobExprSuffixContext extends ParserRuleContext {
		public GbobExprsContext gbobExprs() {
			return getRuleContext(GbobExprsContext.class,0);
		}
		public GbobExprSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gbobExprSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterGbobExprSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitGbobExprSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitGbobExprSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GbobExprSuffixContext gbobExprSuffix() throws RecognitionException {
		GbobExprSuffixContext _localctx = new GbobExprSuffixContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_gbobExprSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(COMMA);
			setState(350);
			gbobExprs();
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

	public static class UpdateStatContext extends ParserRuleContext {
		public UpdateSingleTableContext updateSingleTable() {
			return getRuleContext(UpdateSingleTableContext.class,0);
		}
		public UpdateMultipleTableContext updateMultipleTable() {
			return getRuleContext(UpdateMultipleTableContext.class,0);
		}
		public UpdateStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUpdateStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUpdateStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUpdateStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatContext updateStat() throws RecognitionException {
		UpdateStatContext _localctx = new UpdateStatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_updateStat);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				updateSingleTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				updateMultipleTable();
				}
				break;
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

	public static class UpdateSingleTableContext extends ParserRuleContext {
		public Token rowCount;
		public TerminalNode UPDATE() { return getToken(MySQLParser.UPDATE, 0); }
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TerminalNode SET() { return getToken(MySQLParser.SET, 0); }
		public SetExprsContext setExprs() {
			return getRuleContext(SetExprsContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(MySQLParser.LIMIT, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode PLACEHOLDER() { return getToken(MySQLParser.PLACEHOLDER, 0); }
		public UpdateSingleTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSingleTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUpdateSingleTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUpdateSingleTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUpdateSingleTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSingleTableContext updateSingleTable() throws RecognitionException {
		UpdateSingleTableContext _localctx = new UpdateSingleTableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_updateSingleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(UPDATE);
			setState(357);
			tableNameAndAlias();
			setState(358);
			match(SET);
			setState(359);
			setExprs();
			setState(362);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(360);
				match(WHERE);
				setState(361);
				whereCondition();
				}
			}

			setState(366);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(364);
				match(LIMIT);
				setState(365);
				((UpdateSingleTableContext)_localctx).rowCount = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLACEHOLDER || _la==INT) ) {
					((UpdateSingleTableContext)_localctx).rowCount = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
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

	public static class UpdateMultipleTableContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(MySQLParser.UPDATE, 0); }
		public TableNameAndAliasesContext tableNameAndAliases() {
			return getRuleContext(TableNameAndAliasesContext.class,0);
		}
		public TerminalNode SET() { return getToken(MySQLParser.SET, 0); }
		public SetExprsContext setExprs() {
			return getRuleContext(SetExprsContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
		public UpdateMultipleTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateMultipleTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUpdateMultipleTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUpdateMultipleTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUpdateMultipleTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateMultipleTableContext updateMultipleTable() throws RecognitionException {
		UpdateMultipleTableContext _localctx = new UpdateMultipleTableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_updateMultipleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(UPDATE);
			setState(369);
			tableNameAndAliases();
			setState(370);
			match(SET);
			setState(371);
			setExprs();
			setState(374);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(372);
				match(WHERE);
				setState(373);
				whereCondition();
				}
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

	public static class SetExprsContext extends ParserRuleContext {
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public SetExprSuffixContext setExprSuffix() {
			return getRuleContext(SetExprSuffixContext.class,0);
		}
		public SetExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSetExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSetExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSetExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprsContext setExprs() throws RecognitionException {
		SetExprsContext _localctx = new SetExprsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_setExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			setExpr();
			setState(378);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(377);
				setExprSuffix();
				}
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

	public static class SetExprSuffixContext extends ParserRuleContext {
		public SetExprsContext setExprs() {
			return getRuleContext(SetExprsContext.class,0);
		}
		public SetExprSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExprSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSetExprSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSetExprSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSetExprSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprSuffixContext setExprSuffix() throws RecognitionException {
		SetExprSuffixContext _localctx = new SetExprSuffixContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_setExprSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(COMMA);
			setState(381);
			setExprs();
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

	public static class SetExprContext extends ParserRuleContext {
		public ElementContext left;
		public ElementContext right;
		public Token rightDefault;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLParser.DEFAULT, 0); }
		public SetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprContext setExpr() throws RecognitionException {
		SetExprContext _localctx = new SetExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			((SetExprContext)_localctx).left = element();
			setState(384);
			match(EQ);
			setState(387);
			switch (_input.LA(1)) {
			case PLACEHOLDER:
			case NULL:
			case TRUE:
			case FALSE:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case ALL:
			case ANY:
			case SOME:
			case UNKNOWN:
			case CASE:
			case ROW:
			case BINARY:
			case ASTERISK:
			case INT:
			case DECIMAL:
			case STRING:
			case ID:
			case COLUMN_REL:
			case LPAREN:
				{
				setState(385);
				((SetExprContext)_localctx).right = element();
				}
				break;
			case DEFAULT:
				{
				setState(386);
				((SetExprContext)_localctx).rightDefault = match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeleteStatContext extends ParserRuleContext {
		public Token rowCount;
		public TerminalNode DELETE() { return getToken(MySQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(MySQLParser.LIMIT, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode PLACEHOLDER() { return getToken(MySQLParser.PLACEHOLDER, 0); }
		public DeleteStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDeleteStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDeleteStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDeleteStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatContext deleteStat() throws RecognitionException {
		DeleteStatContext _localctx = new DeleteStatContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_deleteStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(DELETE);
			setState(390);
			match(FROM);
			setState(391);
			tableNameAndAlias();
			setState(394);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(392);
				match(WHERE);
				setState(393);
				whereCondition();
				}
			}

			setState(398);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(396);
				match(LIMIT);
				setState(397);
				((DeleteStatContext)_localctx).rowCount = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLACEHOLDER || _la==INT) ) {
					((DeleteStatContext)_localctx).rowCount = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
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

	public static class TableNameAndAliasContext extends ParserRuleContext {
		public Token name;
		public Token alias;
		public List<TerminalNode> ID() { return getTokens(MySQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLParser.ID, i);
		}
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
		public TableNameAndAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameAndAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableNameAndAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableNameAndAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableNameAndAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameAndAliasContext tableNameAndAlias() throws RecognitionException {
		TableNameAndAliasContext _localctx = new TableNameAndAliasContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableNameAndAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			((TableNameAndAliasContext)_localctx).name = match(ID);
			setState(405);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(402);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(401);
					match(AS);
					}
				}

				setState(404);
				((TableNameAndAliasContext)_localctx).alias = match(ID);
				}
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

	public static class TableNameAndAliasesContext extends ParserRuleContext {
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TableNameAndAliasSuffixContext tableNameAndAliasSuffix() {
			return getRuleContext(TableNameAndAliasSuffixContext.class,0);
		}
		public TableNameAndAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameAndAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableNameAndAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableNameAndAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableNameAndAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameAndAliasesContext tableNameAndAliases() throws RecognitionException {
		TableNameAndAliasesContext _localctx = new TableNameAndAliasesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tableNameAndAliases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			tableNameAndAlias();
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(408);
				tableNameAndAliasSuffix();
				}
				break;
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

	public static class TableNameAndAliasSuffixContext extends ParserRuleContext {
		public TableNameAndAliasesContext tableNameAndAliases() {
			return getRuleContext(TableNameAndAliasesContext.class,0);
		}
		public TableNameAndAliasSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameAndAliasSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableNameAndAliasSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableNameAndAliasSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableNameAndAliasSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameAndAliasSuffixContext tableNameAndAliasSuffix() throws RecognitionException {
		TableNameAndAliasSuffixContext _localctx = new TableNameAndAliasSuffixContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableNameAndAliasSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(COMMA);
			setState(412);
			tableNameAndAliases();
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

	public static class WhereConditionContext extends ParserRuleContext {
		public WhereCondSubContext whereCondSub() {
			return getRuleContext(WhereCondSubContext.class,0);
		}
		public WhereCondOpContext whereCondOp() {
			return getRuleContext(WhereCondOpContext.class,0);
		}
		public WhereConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterWhereCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitWhereCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitWhereCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereConditionContext whereCondition() throws RecognitionException {
		WhereConditionContext _localctx = new WhereConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whereCondition);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				whereCondSub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				whereCondOp();
				}
				break;
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

	public static class WhereCondSubContext extends ParserRuleContext {
		public WhereConditionContext wc1;
		public Token expressionOperator;
		public WhereConditionContext wc2;
		public List<WhereConditionContext> whereCondition() {
			return getRuleContexts(WhereConditionContext.class);
		}
		public WhereConditionContext whereCondition(int i) {
			return getRuleContext(WhereConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(MySQLParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MySQLParser.OR, 0); }
		public WhereCondSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCondSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterWhereCondSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitWhereCondSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitWhereCondSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereCondSubContext whereCondSub() throws RecognitionException {
		WhereCondSubContext _localctx = new WhereCondSubContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whereCondSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(LPAREN);
			setState(419);
			((WhereCondSubContext)_localctx).wc1 = whereCondition();
			setState(420);
			match(RPAREN);
			setState(423);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) {
				{
				setState(421);
				((WhereCondSubContext)_localctx).expressionOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) ) {
					((WhereCondSubContext)_localctx).expressionOperator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(422);
				((WhereCondSubContext)_localctx).wc2 = whereCondition();
				}
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

	public static class WhereCondOpContext extends ParserRuleContext {
		public Token expressionOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(MySQLParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MySQLParser.OR, 0); }
		public WhereCondOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCondOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterWhereCondOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitWhereCondOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitWhereCondOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereCondOpContext whereCondOp() throws RecognitionException {
		WhereCondOpContext _localctx = new WhereCondOpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_whereCondOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			expression();
			setState(428);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) {
				{
				setState(426);
				((WhereCondOpContext)_localctx).expressionOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) ) {
					((WhereCondOpContext)_localctx).expressionOperator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(427);
				whereCondition();
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExprRelationalContext exprRelational() {
			return getRuleContext(ExprRelationalContext.class,0);
		}
		public ExprBetweenAndContext exprBetweenAnd() {
			return getRuleContext(ExprBetweenAndContext.class,0);
		}
		public ExprIsOrIsNotNullContext exprIsOrIsNotNull() {
			return getRuleContext(ExprIsOrIsNotNullContext.class,0);
		}
		public ExprInSelectContext exprInSelect() {
			return getRuleContext(ExprInSelectContext.class,0);
		}
		public ExprInValuesContext exprInValues() {
			return getRuleContext(ExprInValuesContext.class,0);
		}
		public ExprExistsContext exprExists() {
			return getRuleContext(ExprExistsContext.class,0);
		}
		public ExprNotContext exprNot() {
			return getRuleContext(ExprNotContext.class,0);
		}
		public ExprLikeContext exprLike() {
			return getRuleContext(ExprLikeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expression);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				exprRelational();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				exprBetweenAnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				exprIsOrIsNotNull();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				exprInSelect();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				exprInValues();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				exprExists();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(436);
				exprNot();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(437);
				exprLike();
				}
				break;
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

	public static class ExprRelationalContext extends ParserRuleContext {
		public ElementContext left;
		public Token relationalOp;
		public ElementContext right;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MySQLParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(MySQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(MySQLParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(MySQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(MySQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(MySQLParser.GET, 0); }
		public ExprRelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRelationalContext exprRelational() throws RecognitionException {
		ExprRelationalContext _localctx = new ExprRelationalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exprRelational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			((ExprRelationalContext)_localctx).left = element();
			setState(441);
			((ExprRelationalContext)_localctx).relationalOp = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (EQ - 88)) | (1L << (LTH - 88)) | (1L << (GTH - 88)) | (1L << (NOT_EQ - 88)) | (1L << (LET - 88)) | (1L << (GET - 88)))) != 0)) ) {
				((ExprRelationalContext)_localctx).relationalOp = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(442);
			((ExprRelationalContext)_localctx).right = element();
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

	public static class ExprBetweenAndContext extends ParserRuleContext {
		public ElementContext el;
		public Token not;
		public ElementContext left;
		public ElementContext right;
		public TerminalNode BETWEEN() { return getToken(MySQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprBetweenAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBetweenAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprBetweenAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprBetweenAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprBetweenAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBetweenAndContext exprBetweenAnd() throws RecognitionException {
		ExprBetweenAndContext _localctx = new ExprBetweenAndContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_exprBetweenAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			((ExprBetweenAndContext)_localctx).el = element();
			setState(446);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(445);
				((ExprBetweenAndContext)_localctx).not = match(NOT);
				}
			}

			setState(448);
			match(BETWEEN);
			setState(449);
			((ExprBetweenAndContext)_localctx).left = element();
			setState(450);
			match(AND);
			setState(451);
			((ExprBetweenAndContext)_localctx).right = element();
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

	public static class ExprIsOrIsNotNullContext extends ParserRuleContext {
		public Token not;
		public Token what;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IS() { return getToken(MySQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(MySQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLParser.UNKNOWN, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprIsOrIsNotNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprIsOrIsNotNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprIsOrIsNotNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprIsOrIsNotNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprIsOrIsNotNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprIsOrIsNotNullContext exprIsOrIsNotNull() throws RecognitionException {
		ExprIsOrIsNotNullContext _localctx = new ExprIsOrIsNotNullContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exprIsOrIsNotNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			element();
			setState(454);
			match(IS);
			setState(456);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(455);
				((ExprIsOrIsNotNullContext)_localctx).not = match(NOT);
				}
			}

			setState(458);
			((ExprIsOrIsNotNullContext)_localctx).what = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << UNKNOWN))) != 0)) ) {
				((ExprIsOrIsNotNullContext)_localctx).what = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ExprInSelectContext extends ParserRuleContext {
		public Token not;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprInSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprInSelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprInSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprInSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprInSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprInSelectContext exprInSelect() throws RecognitionException {
		ExprInSelectContext _localctx = new ExprInSelectContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exprInSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			element();
			setState(462);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(461);
				((ExprInSelectContext)_localctx).not = match(NOT);
				}
			}

			setState(464);
			match(IN);
			setState(465);
			match(LPAREN);
			setState(466);
			selectStat();
			setState(467);
			match(RPAREN);
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

	public static class ExprInValuesContext extends ParserRuleContext {
		public Token not;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprInValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprInValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprInValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprInValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprInValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprInValuesContext exprInValues() throws RecognitionException {
		ExprInValuesContext _localctx = new ExprInValuesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exprInValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			element();
			setState(471);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(470);
				((ExprInValuesContext)_localctx).not = match(NOT);
				}
			}

			setState(473);
			match(IN);
			setState(474);
			match(LPAREN);
			setState(475);
			valueList();
			setState(476);
			match(RPAREN);
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

	public static class ExprExistsContext extends ParserRuleContext {
		public Token not;
		public TerminalNode EXISTS() { return getToken(MySQLParser.EXISTS, 0); }
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprExistsContext exprExists() throws RecognitionException {
		ExprExistsContext _localctx = new ExprExistsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_exprExists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(478);
				((ExprExistsContext)_localctx).not = match(NOT);
				}
			}

			setState(481);
			match(EXISTS);
			setState(482);
			match(LPAREN);
			setState(483);
			selectStat();
			setState(484);
			match(RPAREN);
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

	public static class ExprNotContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNotContext exprNot() throws RecognitionException {
		ExprNotContext _localctx = new ExprNotContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_exprNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(487);
			expression();
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

	public static class ExprLikeContext extends ParserRuleContext {
		public ElementContext left;
		public Token not;
		public ElementContext right;
		public TerminalNode LIKE() { return getToken(MySQLParser.LIKE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprLikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLikeContext exprLike() throws RecognitionException {
		ExprLikeContext _localctx = new ExprLikeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_exprLike);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			((ExprLikeContext)_localctx).left = element();
			setState(491);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(490);
				((ExprLikeContext)_localctx).not = match(NOT);
				}
			}

			setState(493);
			match(LIKE);
			setState(494);
			((ExprLikeContext)_localctx).right = element();
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

	public static class ElementContext extends ParserRuleContext {
		public ElementOpFactoryContext elementOpFactory() {
			return getRuleContext(ElementOpFactoryContext.class,0);
		}
		public ElementListFactorContext elementListFactor() {
			return getRuleContext(ElementListFactorContext.class,0);
		}
		public ElementOpEleContext elementOpEle() {
			return getRuleContext(ElementOpEleContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_element);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				elementOpFactory();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				elementListFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				elementOpEle();
				}
				break;
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

	public static class ElementOpFactoryContext extends ParserRuleContext {
		public ElementTextContext elementText() {
			return getRuleContext(ElementTextContext.class,0);
		}
		public ElementTextParamContext elementTextParam() {
			return getRuleContext(ElementTextParamContext.class,0);
		}
		public ElementDateContext elementDate() {
			return getRuleContext(ElementDateContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public ElementSubQueryContext elementSubQuery() {
			return getRuleContext(ElementSubQueryContext.class,0);
		}
		public ElementCaseContext elementCase() {
			return getRuleContext(ElementCaseContext.class,0);
		}
		public ElementWapperBktContext elementWapperBkt() {
			return getRuleContext(ElementWapperBktContext.class,0);
		}
		public ElementWithPrefixContext elementWithPrefix() {
			return getRuleContext(ElementWithPrefixContext.class,0);
		}
		public ElementRowContext elementRow() {
			return getRuleContext(ElementRowContext.class,0);
		}
		public ElementOpFactoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOpFactory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementOpFactory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementOpFactory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementOpFactory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementOpFactoryContext elementOpFactory() throws RecognitionException {
		ElementOpFactoryContext _localctx = new ElementOpFactoryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_elementOpFactory);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				elementText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				elementTextParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				elementDate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				funCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(505);
				elementSubQuery();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(506);
				elementCase();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(507);
				elementWapperBkt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(508);
				elementWithPrefix();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(509);
				elementRow();
				}
				break;
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

	public static class ElementTextContext extends ParserRuleContext {
		public TerminalNode PLACEHOLDER() { return getToken(MySQLParser.PLACEHOLDER, 0); }
		public TerminalNode COLUMN_REL() { return getToken(MySQLParser.COLUMN_REL, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLParser.UNKNOWN, 0); }
		public ElementTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementTextContext elementText() throws RecognitionException {
		ElementTextContext _localctx = new ElementTextContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_elementText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << NULL) | (1L << UNKNOWN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASTERISK - 72)) | (1L << (ID - 72)) | (1L << (COLUMN_REL - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ElementTextParamContext extends ParserRuleContext {
		public List<TerminalNode> DECIMAL() { return getTokens(MySQLParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(MySQLParser.DECIMAL, i);
		}
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode TRUE() { return getToken(MySQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLParser.FALSE, 0); }
		public ElementTextParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementTextParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementTextParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementTextParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementTextParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementTextParamContext elementTextParam() throws RecognitionException {
		ElementTextParamContext _localctx = new ElementTextParamContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_elementTextParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !(((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (TRUE - 16)) | (1L << (FALSE - 16)) | (1L << (INT - 16)) | (1L << (DECIMAL - 16)) | (1L << (STRING - 16)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ElementDateContext extends ParserRuleContext {
		public Token dt;
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public TerminalNode DATE() { return getToken(MySQLParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(MySQLParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySQLParser.TIMESTAMP, 0); }
		public ElementDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementDateContext elementDate() throws RecognitionException {
		ElementDateContext _localctx = new ElementDateContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elementDate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			((ElementDateContext)_localctx).dt = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
				((ElementDateContext)_localctx).dt = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(517);
			match(STRING);
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

	public static class ElementSubQueryContext extends ParserRuleContext {
		public Token sqWith;
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode ANY() { return getToken(MySQLParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(MySQLParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(MySQLParser.ALL, 0); }
		public ElementSubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementSubQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementSubQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementSubQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementSubQueryContext elementSubQuery() throws RecognitionException {
		ElementSubQueryContext _localctx = new ElementSubQueryContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elementSubQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << SOME))) != 0)) {
				{
				setState(519);
				((ElementSubQueryContext)_localctx).sqWith = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << SOME))) != 0)) ) {
					((ElementSubQueryContext)_localctx).sqWith = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(522);
			match(LPAREN);
			setState(523);
			selectStat();
			setState(524);
			match(RPAREN);
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

	public static class ElementWapperBktContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementWapperBktContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementWapperBkt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementWapperBkt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementWapperBkt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementWapperBkt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementWapperBktContext elementWapperBkt() throws RecognitionException {
		ElementWapperBktContext _localctx = new ElementWapperBktContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementWapperBkt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(LPAREN);
			setState(527);
			element();
			setState(528);
			match(RPAREN);
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

	public static class ElementListFactorContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElementListFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementListFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementListFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementListFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementListFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListFactorContext elementListFactor() throws RecognitionException {
		ElementListFactorContext _localctx = new ElementListFactorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementListFactor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(LPAREN);
			setState(531);
			elementList();
			setState(532);
			match(RPAREN);
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

	public static class ElementListContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementListSuffixContext elementListSuffix() {
			return getRuleContext(ElementListSuffixContext.class,0);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			element();
			setState(536);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(535);
				elementListSuffix();
				}
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

	public static class ElementListSuffixContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElementListSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementListSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementListSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementListSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementListSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListSuffixContext elementListSuffix() throws RecognitionException {
		ElementListSuffixContext _localctx = new ElementListSuffixContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementListSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(COMMA);
			setState(539);
			elementList();
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

	public static class ElementOpEleContext extends ParserRuleContext {
		public ElementOpFactoryContext elementOpFactory() {
			return getRuleContext(ElementOpFactoryContext.class,0);
		}
		public ElementOpEleSuffixContext elementOpEleSuffix() {
			return getRuleContext(ElementOpEleSuffixContext.class,0);
		}
		public ElementOpEleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOpEle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementOpEle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementOpEle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementOpEle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementOpEleContext elementOpEle() throws RecognitionException {
		ElementOpEleContext _localctx = new ElementOpEleContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementOpEle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			elementOpFactory();
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(542);
				elementOpEleSuffix();
				}
				break;
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

	public static class ElementOpEleSuffixContext extends ParserRuleContext {
		public Token op;
		public ElementOpEleContext elementOpEle() {
			return getRuleContext(ElementOpEleContext.class,0);
		}
		public TerminalNode DIV() { return getToken(MySQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MySQLParser.MOD, 0); }
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
		public ElementOpEleSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOpEleSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementOpEleSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementOpEleSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementOpEleSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementOpEleSuffixContext elementOpEleSuffix() throws RecognitionException {
		ElementOpEleSuffixContext _localctx = new ElementOpEleSuffixContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementOpEleSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(545);
				((ElementOpEleSuffixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (AS - 28)) | (1L << (DIV - 28)) | (1L << (MOD - 28)) | (1L << (PLUS - 28)) | (1L << (MINUS - 28)) | (1L << (VERTBAR - 28)) | (1L << (BITAND - 28)) | (1L << (SHIFT_LEFT - 28)) | (1L << (SHIFT_RIGHT - 28)) | (1L << (ASTERISK - 28)) | (1L << (POWER_OP - 28)))) != 0)) ) {
					((ElementOpEleSuffixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(548);
			elementOpEle();
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

	public static class ElementCaseContext extends ParserRuleContext {
		public ElementContext value;
		public ElementContext elseEl;
		public TerminalNode CASE() { return getToken(MySQLParser.CASE, 0); }
		public CaseWhenPartContext caseWhenPart() {
			return getRuleContext(CaseWhenPartContext.class,0);
		}
		public TerminalNode END() { return getToken(MySQLParser.END, 0); }
		public TerminalNode ELSE() { return getToken(MySQLParser.ELSE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ElementCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementCaseContext elementCase() throws RecognitionException {
		ElementCaseContext _localctx = new ElementCaseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elementCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(CASE);
			setState(552);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << ALL) | (1L << ANY) | (1L << SOME) | (1L << UNKNOWN) | (1L << CASE) | (1L << ROW) | (1L << BINARY))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASTERISK - 72)) | (1L << (INT - 72)) | (1L << (DECIMAL - 72)) | (1L << (STRING - 72)) | (1L << (ID - 72)) | (1L << (COLUMN_REL - 72)) | (1L << (LPAREN - 72)))) != 0)) {
				{
				setState(551);
				((ElementCaseContext)_localctx).value = element();
				}
			}

			setState(554);
			caseWhenPart();
			setState(557);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(555);
				match(ELSE);
				setState(556);
				((ElementCaseContext)_localctx).elseEl = element();
				}
			}

			setState(559);
			match(END);
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

	public static class CaseWhenPartContext extends ParserRuleContext {
		public ElementContext whenEl;
		public ExprRelationalContext whenRe;
		public ElementContext then;
		public CaseWhenPartContext suffix;
		public TerminalNode WHEN() { return getToken(MySQLParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(MySQLParser.THEN, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ExprRelationalContext exprRelational() {
			return getRuleContext(ExprRelationalContext.class,0);
		}
		public CaseWhenPartContext caseWhenPart() {
			return getRuleContext(CaseWhenPartContext.class,0);
		}
		public CaseWhenPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhenPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCaseWhenPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCaseWhenPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCaseWhenPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhenPartContext caseWhenPart() throws RecognitionException {
		CaseWhenPartContext _localctx = new CaseWhenPartContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_caseWhenPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(WHEN);
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(562);
				((CaseWhenPartContext)_localctx).whenEl = element();
				}
				break;
			case 2:
				{
				setState(563);
				((CaseWhenPartContext)_localctx).whenRe = exprRelational();
				}
				break;
			}
			setState(566);
			match(THEN);
			setState(567);
			((CaseWhenPartContext)_localctx).then = element();
			setState(569);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(568);
				((CaseWhenPartContext)_localctx).suffix = caseWhenPart();
				}
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

	public static class ElementWithPrefixContext extends ParserRuleContext {
		public Token prefix;
		public ElementOpFactoryContext elementOpFactory() {
			return getRuleContext(ElementOpFactoryContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(MySQLParser.BINARY, 0); }
		public ElementWithPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementWithPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementWithPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementWithPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementWithPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementWithPrefixContext elementWithPrefix() throws RecognitionException {
		ElementWithPrefixContext _localctx = new ElementWithPrefixContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elementWithPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			((ElementWithPrefixContext)_localctx).prefix = match(BINARY);
			setState(572);
			elementOpFactory();
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

	public static class ElementRowContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(MySQLParser.ROW, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ElementRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementRowContext elementRow() throws RecognitionException {
		ElementRowContext _localctx = new ElementRowContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(ROW);
			setState(575);
			match(LPAREN);
			setState(576);
			paramList();
			setState(577);
			match(RPAREN);
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

	public static class FunCallContext extends ParserRuleContext {
		public Token funName;
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			((FunCallContext)_localctx).funName = match(ID);
			setState(580);
			match(LPAREN);
			setState(582);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << ALL) | (1L << ANY) | (1L << SOME) | (1L << UNKNOWN) | (1L << CASE) | (1L << ROW) | (1L << BINARY))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASTERISK - 72)) | (1L << (INT - 72)) | (1L << (DECIMAL - 72)) | (1L << (STRING - 72)) | (1L << (ID - 72)) | (1L << (COLUMN_REL - 72)) | (1L << (LPAREN - 72)))) != 0)) {
				{
				setState(581);
				paramList();
				}
			}

			setState(584);
			match(RPAREN);
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

	public static class ParamListContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ExprRelationalContext exprRelational() {
			return getRuleContext(ExprRelationalContext.class,0);
		}
		public ParamSuffixContext paramSuffix() {
			return getRuleContext(ParamSuffixContext.class,0);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(586);
				element();
				}
				break;
			case 2:
				{
				setState(587);
				exprRelational();
				}
				break;
			}
			setState(591);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(590);
				paramSuffix();
				}
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

	public static class ParamSuffixContext extends ParserRuleContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ParamSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterParamSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitParamSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitParamSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamSuffixContext paramSuffix() throws RecognitionException {
		ParamSuffixContext _localctx = new ParamSuffixContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_paramSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(COMMA);
			setState(594);
			paramList();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3p\u0257\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2\5\2\u008e"+
		"\n\2\3\3\3\3\5\3\u0092\n\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6\u009a\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00a1\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a9\n\6\3\7"+
		"\3\7\7\7\u00ad\n\7\f\7\16\7\u00b0\13\7\3\7\3\7\3\b\3\b\3\b\7\b\u00b7\n"+
		"\b\f\b\16\b\u00ba\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00c3\n\t\3\t\5"+
		"\t\u00c6\n\t\3\n\3\n\3\n\3\13\3\13\5\13\u00cd\n\13\3\13\3\13\3\13\5\13"+
		"\u00d2\n\13\3\13\3\13\5\13\u00d6\n\13\3\13\3\13\3\13\5\13\u00db\n\13\3"+
		"\13\3\13\5\13\u00df\n\13\3\f\3\f\3\f\5\f\u00e4\n\f\3\f\3\f\3\f\5\f\u00e9"+
		"\n\f\3\f\3\f\3\f\3\f\5\f\u00ef\n\f\5\f\u00f1\n\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00f9\n\f\3\r\3\r\5\r\u00fd\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0104\n"+
		"\r\3\r\3\r\3\16\3\16\5\16\u010a\n\16\3\16\5\16\u010d\n\16\3\16\5\16\u0110"+
		"\n\16\3\17\3\17\3\17\3\20\3\20\5\20\u0117\n\20\3\21\3\21\3\21\3\22\3\22"+
		"\5\22\u011e\n\22\3\23\3\23\3\23\5\23\u0123\n\23\3\24\3\24\3\24\3\24\5"+
		"\24\u0129\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013c\n\27\3\27\5\27\u013f\n\27\3"+
		"\27\5\27\u0142\n\27\3\30\3\30\3\30\3\30\5\30\u0148\n\30\3\30\3\30\5\30"+
		"\u014c\n\30\5\30\u014e\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0157"+
		"\n\31\3\32\3\32\5\32\u015b\n\32\3\32\5\32\u015e\n\32\3\33\3\33\3\33\3"+
		"\34\3\34\5\34\u0165\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u016d\n\35"+
		"\3\35\3\35\5\35\u0171\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0179\n"+
		"\36\3\37\3\37\5\37\u017d\n\37\3 \3 \3 \3!\3!\3!\3!\5!\u0186\n!\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u018d\n\"\3\"\3\"\5\"\u0191\n\"\3#\3#\5#\u0195\n#\3#"+
		"\5#\u0198\n#\3$\3$\5$\u019c\n$\3%\3%\3%\3&\3&\5&\u01a3\n&\3\'\3\'\3\'"+
		"\3\'\3\'\5\'\u01aa\n\'\3(\3(\3(\5(\u01af\n(\3)\3)\3)\3)\3)\3)\3)\3)\5"+
		")\u01b9\n)\3*\3*\3*\3*\3+\3+\5+\u01c1\n+\3+\3+\3+\3+\3+\3,\3,\3,\5,\u01cb"+
		"\n,\3,\3,\3-\3-\5-\u01d1\n-\3-\3-\3-\3-\3-\3.\3.\5.\u01da\n.\3.\3.\3."+
		"\3.\3.\3/\5/\u01e2\n/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\5\61\u01ee"+
		"\n\61\3\61\3\61\3\61\3\62\3\62\3\62\5\62\u01f6\n\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u0201\n\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\5\67\u020b\n\67\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\3"+
		"9\3:\3:\5:\u021b\n:\3;\3;\3;\3<\3<\5<\u0222\n<\3=\5=\u0225\n=\3=\3=\3"+
		">\3>\5>\u022b\n>\3>\3>\3>\5>\u0230\n>\3>\3>\3?\3?\3?\5?\u0237\n?\3?\3"+
		"?\3?\5?\u023c\n?\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\5B\u0249\nB\3B\3B\3"+
		"C\3C\5C\u024f\nC\3C\5C\u0252\nC\3D\3D\3D\3D\2\2E\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\2\16\4\2\4\4LL\4\2%%..\3\2\'(\4\2\24\24"+
		"?@\3\2Z_\5\2\r\r\22\23\62\62\4\2\3\3AA\7\2\4\4\r\r\62\62JJOP\4\2\22\23"+
		"LN\3\2+-\3\2.\60\4\2\36\36BK\u0270\2\u008d\3\2\2\2\4\u0091\3\2\2\2\6\u0093"+
		"\3\2\2\2\b\u0095\3\2\2\2\n\u0097\3\2\2\2\f\u00ae\3\2\2\2\16\u00b8\3\2"+
		"\2\2\20\u00c2\3\2\2\2\22\u00c7\3\2\2\2\24\u00ca\3\2\2\2\26\u00e3\3\2\2"+
		"\2\30\u00fa\3\2\2\2\32\u0107\3\2\2\2\34\u0111\3\2\2\2\36\u0114\3\2\2\2"+
		" \u0118\3\2\2\2\"\u011d\3\2\2\2$\u0122\3\2\2\2&\u0124\3\2\2\2(\u012c\3"+
		"\2\2\2*\u0130\3\2\2\2,\u0133\3\2\2\2.\u014d\3\2\2\2\60\u0156\3\2\2\2\62"+
		"\u0158\3\2\2\2\64\u015f\3\2\2\2\66\u0164\3\2\2\28\u0166\3\2\2\2:\u0172"+
		"\3\2\2\2<\u017a\3\2\2\2>\u017e\3\2\2\2@\u0181\3\2\2\2B\u0187\3\2\2\2D"+
		"\u0192\3\2\2\2F\u0199\3\2\2\2H\u019d\3\2\2\2J\u01a2\3\2\2\2L\u01a4\3\2"+
		"\2\2N\u01ab\3\2\2\2P\u01b8\3\2\2\2R\u01ba\3\2\2\2T\u01be\3\2\2\2V\u01c7"+
		"\3\2\2\2X\u01ce\3\2\2\2Z\u01d7\3\2\2\2\\\u01e1\3\2\2\2^\u01e8\3\2\2\2"+
		"`\u01eb\3\2\2\2b\u01f5\3\2\2\2d\u0200\3\2\2\2f\u0202\3\2\2\2h\u0204\3"+
		"\2\2\2j\u0206\3\2\2\2l\u020a\3\2\2\2n\u0210\3\2\2\2p\u0214\3\2\2\2r\u0218"+
		"\3\2\2\2t\u021c\3\2\2\2v\u021f\3\2\2\2x\u0224\3\2\2\2z\u0228\3\2\2\2|"+
		"\u0233\3\2\2\2~\u023d\3\2\2\2\u0080\u0240\3\2\2\2\u0082\u0245\3\2\2\2"+
		"\u0084\u024e\3\2\2\2\u0086\u0253\3\2\2\2\u0088\u008e\5\n\6\2\u0089\u008e"+
		"\5\66\34\2\u008a\u008e\5B\"\2\u008b\u008e\5\20\t\2\u008c\u008e\5\4\3\2"+
		"\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008c\3\2\2\2\u008e\3\3\2\2\2\u008f\u0092\5\6\4\2\u0090"+
		"\u0092\5\b\5\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\5\3\2\2\2"+
		"\u0093\u0094\7\66\2\2\u0094\7\3\2\2\2\u0095\u0096\7\67\2\2\u0096\t\3\2"+
		"\2\2\u0097\u0099\7\6\2\2\u0098\u009a\7\7\2\2\u0099\u0098\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a0\7O\2\2\u009c\u009d\7U\2"+
		"\2\u009d\u009e\5\f\7\2\u009e\u009f\7T\2\2\u009f\u00a1\3\2\2\2\u00a0\u009c"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a8\3\2\2\2\u00a2\u00a3\7\b\2\2\u00a3"+
		"\u00a4\7U\2\2\u00a4\u00a5\5\16\b\2\u00a5\u00a6\7T\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a9\5\20\t\2\u00a8\u00a2\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\13\3\2\2\2\u00aa\u00ab\7O\2\2\u00ab\u00ad\7a\2\2\u00ac\u00aa\3\2\2\2"+
		"\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7O\2\2\u00b2\r\3\2\2\2\u00b3"+
		"\u00b4\5b\62\2\u00b4\u00b5\7a\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b3\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\5b\62\2\u00bc\17\3\2\2"+
		"\2\u00bd\u00be\7U\2\2\u00be\u00bf\5\22\n\2\u00bf\u00c0\7T\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00c3\5\22\n\2\u00c2\u00bd\3\2\2\2\u00c2\u00c1\3\2\2\2"+
		"\u00c3\u00c5\3\2\2\2\u00c4\u00c6\5\30\r\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\21\3\2\2\2\u00c7\u00c8\5\24\13\2\u00c8\u00c9\5\26\f\2\u00c9"+
		"\23\3\2\2\2\u00ca\u00cc\7\5\2\2\u00cb\u00cd\7%\2\2\u00cc\u00cb\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\5\32\16\2\u00cf\u00d0"+
		"\7\n\2\2\u00d0\u00d2\5\36\20\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d5\3\2\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00d6\5J&\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d8\7\31\2\2"+
		"\u00d8\u00d9\7\32\2\2\u00d9\u00db\5\62\32\2\u00da\u00d7\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\7\35\2\2\u00dd\u00df\5"+
		"J&\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\25\3\2\2\2\u00e0\u00e1"+
		"\7\30\2\2\u00e1\u00e2\7\32\2\2\u00e2\u00e4\5\62\32\2\u00e3\u00e0\3\2\2"+
		"\2\u00e3\u00e4\3\2\2\2\u00e4\u00f0\3\2\2\2\u00e5\u00ee\7\f\2\2\u00e6\u00e7"+
		"\t\2\2\2\u00e7\u00e9\7a\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ef\t\2\2\2\u00eb\u00ec\t\2\2\2\u00ec\u00ed\7&"+
		"\2\2\u00ed\u00ef\t\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f8\3\2"+
		"\2\2\u00f2\u00f3\7\33\2\2\u00f3\u00f9\7\26\2\2\u00f4\u00f5\7\63\2\2\u00f5"+
		"\u00f6\7\17\2\2\u00f6\u00f7\7\64\2\2\u00f7\u00f9\7\65\2\2\u00f8\u00f2"+
		"\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\27\3\2\2\2\u00fa"+
		"\u00fc\7\61\2\2\u00fb\u00fd\t\3\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3"+
		"\2\2\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\7U\2\2\u00ff\u0100\5\20\t\2\u0100"+
		"\u0101\7T\2\2\u0101\u0104\3\2\2\2\u0102\u0104\5\20\t\2\u0103\u00fe\3\2"+
		"\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\5\26\f\2\u0106"+
		"\31\3\2\2\2\u0107\u010c\5b\62\2\u0108\u010a\7\36\2\2\u0109\u0108\3\2\2"+
		"\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\7O\2\2\u010c\u0109"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0110\5\34\17\2"+
		"\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\33\3\2\2\2\u0111\u0112"+
		"\7a\2\2\u0112\u0113\5\32\16\2\u0113\35\3\2\2\2\u0114\u0116\5\"\22\2\u0115"+
		"\u0117\5 \21\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\37\3\2\2"+
		"\2\u0118\u0119\7a\2\2\u0119\u011a\5\36\20\2\u011a!\3\2\2\2\u011b\u011e"+
		"\5$\23\2\u011c\u011e\5*\26\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e"+
		"#\3\2\2\2\u011f\u0123\5D#\2\u0120\u0123\5&\24\2\u0121\u0123\5(\25\2\u0122"+
		"\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123%\3\2\2\2"+
		"\u0124\u0125\7U\2\2\u0125\u0126\5\20\t\2\u0126\u0128\7T\2\2\u0127\u0129"+
		"\7\36\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2"+
		"\u012a\u012b\7O\2\2\u012b\'\3\2\2\2\u012c\u012d\7U\2\2\u012d\u012e\5\""+
		"\22\2\u012e\u012f\7T\2\2\u012f)\3\2\2\2\u0130\u0131\5D#\2\u0131\u0132"+
		"\5,\27\2\u0132+\3\2\2\2\u0133\u0134\5.\30\2\u0134\u013b\7!\2\2\u0135\u013c"+
		"\5F$\2\u0136\u0137\7U\2\2\u0137\u0138\5F$\2\u0138\u0139\7T\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u013c\5(\25\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013f\5\60\31\2\u013e\u013d\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0142\5,\27\2\u0141"+
		"\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142-\3\2\2\2\u0143\u014e\7\37\2\2"+
		"\u0144\u014e\7)\2\2\u0145\u0147\7\"\2\2\u0146\u0148\7 \2\2\u0147\u0146"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014e\3\2\2\2\u0149\u014b\7#\2\2\u014a"+
		"\u014c\7 \2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u0143\3\2\2\2\u014d\u0144\3\2\2\2\u014d\u0145\3\2\2\2\u014d"+
		"\u0149\3\2\2\2\u014e/\3\2\2\2\u014f\u0150\7$\2\2\u0150\u0157\5J&\2\u0151"+
		"\u0152\7*\2\2\u0152\u0153\7U\2\2\u0153\u0154\5\f\7\2\u0154\u0155\7T\2"+
		"\2\u0155\u0157\3\2\2\2\u0156\u014f\3\2\2\2\u0156\u0151\3\2\2\2\u0157\61"+
		"\3\2\2\2\u0158\u015a\5b\62\2\u0159\u015b\t\4\2\2\u015a\u0159\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015e\5\64\33\2\u015d\u015c\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\63\3\2\2\2\u015f\u0160\7a\2\2\u0160\u0161"+
		"\5\62\32\2\u0161\65\3\2\2\2\u0162\u0165\58\35\2\u0163\u0165\5:\36\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\67\3\2\2\2\u0166\u0167\7\26\2"+
		"\2\u0167\u0168\5D#\2\u0168\u0169\7\27\2\2\u0169\u016c\5<\37\2\u016a\u016b"+
		"\7\13\2\2\u016b\u016d\5J&\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016f\7\f\2\2\u016f\u0171\t\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u01719\3\2\2\2\u0172\u0173\7\26\2\2\u0173\u0174"+
		"\5F$\2\u0174\u0175\7\27\2\2\u0175\u0178\5<\37\2\u0176\u0177\7\13\2\2\u0177"+
		"\u0179\5J&\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179;\3\2\2\2\u017a"+
		"\u017c\5@!\2\u017b\u017d\5> \2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2"+
		"\u017d=\3\2\2\2\u017e\u017f\7a\2\2\u017f\u0180\5<\37\2\u0180?\3\2\2\2"+
		"\u0181\u0182\5b\62\2\u0182\u0185\7Z\2\2\u0183\u0186\5b\62\2\u0184\u0186"+
		"\7\25\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186A\3\2\2\2\u0187"+
		"\u0188\7\t\2\2\u0188\u0189\7\n\2\2\u0189\u018c\5D#\2\u018a\u018b\7\13"+
		"\2\2\u018b\u018d\5J&\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0190"+
		"\3\2\2\2\u018e\u018f\7\f\2\2\u018f\u0191\t\2\2\2\u0190\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191C\3\2\2\2\u0192\u0197\7O\2\2\u0193\u0195\7\36\2\2"+
		"\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198"+
		"\7O\2\2\u0197\u0194\3\2\2\2\u0197\u0198\3\2\2\2\u0198E\3\2\2\2\u0199\u019b"+
		"\5D#\2\u019a\u019c\5H%\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"G\3\2\2\2\u019d\u019e\7a\2\2\u019e\u019f\5F$\2\u019fI\3\2\2\2\u01a0\u01a3"+
		"\5L\'\2\u01a1\u01a3\5N(\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"K\3\2\2\2\u01a4\u01a5\7U\2\2\u01a5\u01a6\5J&\2\u01a6\u01a9\7T\2\2\u01a7"+
		"\u01a8\t\5\2\2\u01a8\u01aa\5J&\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2"+
		"\2\u01aaM\3\2\2\2\u01ab\u01ae\5P)\2\u01ac\u01ad\t\5\2\2\u01ad\u01af\5"+
		"J&\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01afO\3\2\2\2\u01b0\u01b9"+
		"\5R*\2\u01b1\u01b9\5T+\2\u01b2\u01b9\5V,\2\u01b3\u01b9\5X-\2\u01b4\u01b9"+
		"\5Z.\2\u01b5\u01b9\5\\/\2\u01b6\u01b9\5^\60\2\u01b7\u01b9\5`\61\2\u01b8"+
		"\u01b0\3\2\2\2\u01b8\u01b1\3\2\2\2\u01b8\u01b2\3\2\2\2\u01b8\u01b3\3\2"+
		"\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9Q\3\2\2\2\u01ba\u01bb\5b\62\2\u01bb\u01bc\t\6\2\2"+
		"\u01bc\u01bd\5b\62\2\u01bdS\3\2\2\2\u01be\u01c0\5b\62\2\u01bf\u01c1\7"+
		"A\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\7\20\2\2\u01c3\u01c4\5b\62\2\u01c4\u01c5\7?\2\2\u01c5\u01c6\5b"+
		"\62\2\u01c6U\3\2\2\2\u01c7\u01c8\5b\62\2\u01c8\u01ca\7\16\2\2\u01c9\u01cb"+
		"\7A\2\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\t\7\2\2\u01cdW\3\2\2\2\u01ce\u01d0\5b\62\2\u01cf\u01d1\7A\2\2\u01d0"+
		"\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7\17"+
		"\2\2\u01d3\u01d4\7U\2\2\u01d4\u01d5\5\20\t\2\u01d5\u01d6\7T\2\2\u01d6"+
		"Y\3\2\2\2\u01d7\u01d9\5b\62\2\u01d8\u01da\7A\2\2\u01d9\u01d8\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\7\17\2\2\u01dc\u01dd\7"+
		"U\2\2\u01dd\u01de\5\16\b\2\u01de\u01df\7T\2\2\u01df[\3\2\2\2\u01e0\u01e2"+
		"\7A\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\7\21\2\2\u01e4\u01e5\7U\2\2\u01e5\u01e6\5\20\t\2\u01e6\u01e7\7"+
		"T\2\2\u01e7]\3\2\2\2\u01e8\u01e9\t\b\2\2\u01e9\u01ea\5P)\2\u01ea_\3\2"+
		"\2\2\u01eb\u01ed\5b\62\2\u01ec\u01ee\7A\2\2\u01ed\u01ec\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\7\34\2\2\u01f0\u01f1\5"+
		"b\62\2\u01f1a\3\2\2\2\u01f2\u01f6\5d\63\2\u01f3\u01f6\5p9\2\u01f4\u01f6"+
		"\5v<\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6"+
		"c\3\2\2\2\u01f7\u0201\5f\64\2\u01f8\u0201\5h\65\2\u01f9\u0201\5j\66\2"+
		"\u01fa\u0201\5\u0082B\2\u01fb\u0201\5l\67\2\u01fc\u0201\5z>\2\u01fd\u0201"+
		"\5n8\2\u01fe\u0201\5~@\2\u01ff\u0201\5\u0080A\2\u0200\u01f7\3\2\2\2\u0200"+
		"\u01f8\3\2\2\2\u0200\u01f9\3\2\2\2\u0200\u01fa\3\2\2\2\u0200\u01fb\3\2"+
		"\2\2\u0200\u01fc\3\2\2\2\u0200\u01fd\3\2\2\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201e\3\2\2\2\u0202\u0203\t\t\2\2\u0203g\3\2\2\2\u0204"+
		"\u0205\t\n\2\2\u0205i\3\2\2\2\u0206\u0207\t\13\2\2\u0207\u0208\7N\2\2"+
		"\u0208k\3\2\2\2\u0209\u020b\t\f\2\2\u020a\u0209\3\2\2\2\u020a\u020b\3"+
		"\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7U\2\2\u020d\u020e\5\20\t\2\u020e"+
		"\u020f\7T\2\2\u020fm\3\2\2\2\u0210\u0211\7U\2\2\u0211\u0212\5b\62\2\u0212"+
		"\u0213\7T\2\2\u0213o\3\2\2\2\u0214\u0215\7U\2\2\u0215\u0216\5r:\2\u0216"+
		"\u0217\7T\2\2\u0217q\3\2\2\2\u0218\u021a\5b\62\2\u0219\u021b\5t;\2\u021a"+
		"\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021bs\3\2\2\2\u021c\u021d\7a\2\2\u021d"+
		"\u021e\5r:\2\u021eu\3\2\2\2\u021f\u0221\5d\63\2\u0220\u0222\5x=\2\u0221"+
		"\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222w\3\2\2\2\u0223\u0225\t\r\2\2"+
		"\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227"+
		"\5v<\2\u0227y\3\2\2\2\u0228\u022a\78\2\2\u0229\u022b\5b\62\2\u022a\u0229"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022f\5|?\2\u022d"+
		"\u022e\7;\2\2\u022e\u0230\5b\62\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231\u0232\7<\2\2\u0232{\3\2\2\2\u0233\u0236"+
		"\79\2\2\u0234\u0237\5b\62\2\u0235\u0237\5R*\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\7:\2\2\u0239\u023b\5b\62"+
		"\2\u023a\u023c\5|?\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c}\3"+
		"\2\2\2\u023d\u023e\7>\2\2\u023e\u023f\5d\63\2\u023f\177\3\2\2\2\u0240"+
		"\u0241\7=\2\2\u0241\u0242\7U\2\2\u0242\u0243\5\u0084C\2\u0243\u0244\7"+
		"T\2\2\u0244\u0081\3\2\2\2\u0245\u0246\7O\2\2\u0246\u0248\7U\2\2\u0247"+
		"\u0249\5\u0084C\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024b\7T\2\2\u024b\u0083\3\2\2\2\u024c\u024f\5b\62\2\u024d"+
		"\u024f\5R*\2\u024e\u024c\3\2\2\2\u024e\u024d\3\2\2\2\u024f\u0251\3\2\2"+
		"\2\u0250\u0252\5\u0086D\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0085\3\2\2\2\u0253\u0254\7a\2\2\u0254\u0255\5\u0084C\2\u0255\u0087\3"+
		"\2\2\2I\u008d\u0091\u0099\u00a0\u00a8\u00ae\u00b8\u00c2\u00c5\u00cc\u00d1"+
		"\u00d5\u00da\u00de\u00e3\u00e8\u00ee\u00f0\u00f8\u00fc\u0103\u0109\u010c"+
		"\u010f\u0116\u011d\u0122\u0128\u013b\u013e\u0141\u0147\u014b\u014d\u0156"+
		"\u015a\u015d\u0164\u016c\u0170\u0178\u017c\u0185\u018c\u0190\u0194\u0197"+
		"\u019b\u01a2\u01a9\u01ae\u01b8\u01c0\u01ca\u01d0\u01d9\u01e1\u01ed\u01f5"+
		"\u0200\u020a\u021a\u0221\u0224\u022a\u022f\u0236\u023b\u0248\u024e\u0251";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}