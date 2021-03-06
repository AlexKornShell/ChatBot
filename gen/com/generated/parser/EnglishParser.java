// Generated from C:/Users/Alex/IdeaProjects/ChatBot/src/main/java/antlr\English.g4 by ANTLR 4.7
package com.generated.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnglishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NOUN=2, WH_NOUN=3, VERB=4, PARTICLE=5, DETERMINER=6, WH_DET=7, 
		ADJ=8, ADV=9, WH_ADV=10, CCONJ=11, SCONJ=12, TO=13, PREP=14, IN=15, MODAL=16, 
		INTERJECTION=17;
	public static final int
		RULE_sentence = 0, RULE_clause = 1, RULE_independent_clause = 2, RULE_dependent_clause = 3, 
		RULE_interjection = 4, RULE_subordinating_conjunction = 5, RULE_subject = 6, 
		RULE_predicate = 7, RULE_noun_phrase = 8, RULE_adjective_phrase = 9, RULE_adverbial_phrase = 10, 
		RULE_prepositional_phrase = 11, RULE_verb_phrase = 12, RULE_infinitive = 13;
	public static final String[] ruleNames = {
		"sentence", "clause", "independent_clause", "dependent_clause", "interjection", 
		"subordinating_conjunction", "subject", "predicate", "noun_phrase", "adjective_phrase", 
		"adverbial_phrase", "prepositional_phrase", "verb_phrase", "infinitive"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NOUN", "WH_NOUN", "VERB", "PARTICLE", "DETERMINER", 
		"WH_DET", "ADJ", "ADV", "WH_ADV", "CCONJ", "SCONJ", "TO", "PREP", "IN", 
		"MODAL", "INTERJECTION"
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
	public String getGrammarFileName() { return "English.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnglishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SentenceContext extends ParserRuleContext {
		public List<Independent_clauseContext> independent_clause() {
			return getRuleContexts(Independent_clauseContext.class);
		}
		public Independent_clauseContext independent_clause(int i) {
			return getRuleContext(Independent_clauseContext.class,i);
		}
		public List<InterjectionContext> interjection() {
			return getRuleContexts(InterjectionContext.class);
		}
		public InterjectionContext interjection(int i) {
			return getRuleContext(InterjectionContext.class,i);
		}
		public List<TerminalNode> CCONJ() { return getTokens(EnglishParser.CCONJ); }
		public TerminalNode CCONJ(int i) {
			return getToken(EnglishParser.CCONJ, i);
		}
		public List<Dependent_clauseContext> dependent_clause() {
			return getRuleContexts(Dependent_clauseContext.class);
		}
		public Dependent_clauseContext dependent_clause(int i) {
			return getRuleContext(Dependent_clauseContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERJECTION) {
				{
				{
				setState(28);
				interjection();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			independent_clause();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WH_NOUN) | (1L << WH_DET) | (1L << WH_ADV) | (1L << CCONJ) | (1L << SCONJ) | (1L << IN))) != 0)) {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CCONJ:
					{
					setState(35);
					match(CCONJ);
					setState(36);
					independent_clause();
					}
					break;
				case WH_NOUN:
				case WH_DET:
				case WH_ADV:
				case SCONJ:
				case IN:
					{
					setState(37);
					dependent_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
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

	public static class ClauseContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			subject();
			setState(44);
			predicate();
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

	public static class Independent_clauseContext extends ParserRuleContext {
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public Independent_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_independent_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterIndependent_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitIndependent_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitIndependent_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Independent_clauseContext independent_clause() throws RecognitionException {
		Independent_clauseContext _localctx = new Independent_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_independent_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			clause();
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

	public static class Dependent_clauseContext extends ParserRuleContext {
		public Subordinating_conjunctionContext subordinating_conjunction() {
			return getRuleContext(Subordinating_conjunctionContext.class,0);
		}
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Dependent_clauseContext dependent_clause() {
			return getRuleContext(Dependent_clauseContext.class,0);
		}
		public Dependent_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependent_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterDependent_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitDependent_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitDependent_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependent_clauseContext dependent_clause() throws RecognitionException {
		Dependent_clauseContext _localctx = new Dependent_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dependent_clause);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				subordinating_conjunction();
				setState(49);
				clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				subordinating_conjunction();
				setState(52);
				predicate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				subordinating_conjunction();
				setState(55);
				dependent_clause();
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

	public static class InterjectionContext extends ParserRuleContext {
		public TerminalNode INTERJECTION() { return getToken(EnglishParser.INTERJECTION, 0); }
		public InterjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterInterjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitInterjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitInterjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterjectionContext interjection() throws RecognitionException {
		InterjectionContext _localctx = new InterjectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(INTERJECTION);
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

	public static class Subordinating_conjunctionContext extends ParserRuleContext {
		public TerminalNode SCONJ() { return getToken(EnglishParser.SCONJ, 0); }
		public TerminalNode IN() { return getToken(EnglishParser.IN, 0); }
		public TerminalNode WH_NOUN() { return getToken(EnglishParser.WH_NOUN, 0); }
		public TerminalNode WH_ADV() { return getToken(EnglishParser.WH_ADV, 0); }
		public TerminalNode WH_DET() { return getToken(EnglishParser.WH_DET, 0); }
		public Subordinating_conjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subordinating_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterSubordinating_conjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitSubordinating_conjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitSubordinating_conjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subordinating_conjunctionContext subordinating_conjunction() throws RecognitionException {
		Subordinating_conjunctionContext _localctx = new Subordinating_conjunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subordinating_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WH_NOUN) | (1L << WH_DET) | (1L << WH_ADV) | (1L << SCONJ) | (1L << IN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class SubjectContext extends ParserRuleContext {
		public Noun_phraseContext noun_phrase() {
			return getRuleContext(Noun_phraseContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			noun_phrase(0);
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

	public static class PredicateContext extends ParserRuleContext {
		public Verb_phraseContext verb_phrase() {
			return getRuleContext(Verb_phraseContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			verb_phrase(0);
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

	public static class Noun_phraseContext extends ParserRuleContext {
		public Adjective_phraseContext adjective_phrase() {
			return getRuleContext(Adjective_phraseContext.class,0);
		}
		public List<Noun_phraseContext> noun_phrase() {
			return getRuleContexts(Noun_phraseContext.class);
		}
		public Noun_phraseContext noun_phrase(int i) {
			return getRuleContext(Noun_phraseContext.class,i);
		}
		public TerminalNode DETERMINER() { return getToken(EnglishParser.DETERMINER, 0); }
		public TerminalNode NOUN() { return getToken(EnglishParser.NOUN, 0); }
		public TerminalNode CCONJ() { return getToken(EnglishParser.CCONJ, 0); }
		public Noun_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterNoun_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitNoun_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitNoun_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Noun_phraseContext noun_phrase() throws RecognitionException {
		return noun_phrase(0);
	}

	private Noun_phraseContext noun_phrase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Noun_phraseContext _localctx = new Noun_phraseContext(_ctx, _parentState);
		Noun_phraseContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_noun_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WH_NOUN:
			case WH_DET:
			case ADJ:
			case ADV:
			case WH_ADV:
			case SCONJ:
			case TO:
			case PREP:
			case IN:
				{
				setState(68);
				adjective_phrase(0);
				setState(69);
				noun_phrase(6);
				}
				break;
			case DETERMINER:
				{
				setState(71);
				match(DETERMINER);
				setState(72);
				noun_phrase(4);
				}
				break;
			case NOUN:
				{
				setState(73);
				match(NOUN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(76);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(77);
						match(CCONJ);
						setState(78);
						noun_phrase(4);
						}
						break;
					case 2:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(79);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(80);
						noun_phrase(3);
						}
						break;
					case 3:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(81);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(82);
						adjective_phrase(0);
						}
						break;
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Adjective_phraseContext extends ParserRuleContext {
		public Adverbial_phraseContext adverbial_phrase() {
			return getRuleContext(Adverbial_phraseContext.class,0);
		}
		public List<Adjective_phraseContext> adjective_phrase() {
			return getRuleContexts(Adjective_phraseContext.class);
		}
		public Adjective_phraseContext adjective_phrase(int i) {
			return getRuleContext(Adjective_phraseContext.class,i);
		}
		public Prepositional_phraseContext prepositional_phrase() {
			return getRuleContext(Prepositional_phraseContext.class,0);
		}
		public Dependent_clauseContext dependent_clause() {
			return getRuleContext(Dependent_clauseContext.class,0);
		}
		public TerminalNode ADJ() { return getToken(EnglishParser.ADJ, 0); }
		public Adjective_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterAdjective_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitAdjective_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitAdjective_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adjective_phraseContext adjective_phrase() throws RecognitionException {
		return adjective_phrase(0);
	}

	private Adjective_phraseContext adjective_phrase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Adjective_phraseContext _localctx = new Adjective_phraseContext(_ctx, _parentState);
		Adjective_phraseContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_adjective_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(89);
				adverbial_phrase(0);
				setState(90);
				adjective_phrase(4);
				}
				break;
			case 2:
				{
				setState(92);
				prepositional_phrase();
				}
				break;
			case 3:
				{
				setState(93);
				dependent_clause();
				}
				break;
			case 4:
				{
				setState(94);
				match(ADJ);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adjective_phraseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adjective_phrase);
					setState(97);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(98);
					adjective_phrase(6);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Adverbial_phraseContext extends ParserRuleContext {
		public Prepositional_phraseContext prepositional_phrase() {
			return getRuleContext(Prepositional_phraseContext.class,0);
		}
		public TerminalNode ADV() { return getToken(EnglishParser.ADV, 0); }
		public List<Adverbial_phraseContext> adverbial_phrase() {
			return getRuleContexts(Adverbial_phraseContext.class);
		}
		public Adverbial_phraseContext adverbial_phrase(int i) {
			return getRuleContext(Adverbial_phraseContext.class,i);
		}
		public Adverbial_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adverbial_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterAdverbial_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitAdverbial_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitAdverbial_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adverbial_phraseContext adverbial_phrase() throws RecognitionException {
		return adverbial_phrase(0);
	}

	private Adverbial_phraseContext adverbial_phrase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Adverbial_phraseContext _localctx = new Adverbial_phraseContext(_ctx, _parentState);
		Adverbial_phraseContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_adverbial_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TO:
			case PREP:
			case IN:
				{
				setState(105);
				prepositional_phrase();
				}
				break;
			case ADV:
				{
				setState(106);
				match(ADV);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adverbial_phraseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adverbial_phrase);
					setState(109);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(110);
					adverbial_phrase(4);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Prepositional_phraseContext extends ParserRuleContext {
		public TerminalNode PREP() { return getToken(EnglishParser.PREP, 0); }
		public Noun_phraseContext noun_phrase() {
			return getRuleContext(Noun_phraseContext.class,0);
		}
		public TerminalNode IN() { return getToken(EnglishParser.IN, 0); }
		public TerminalNode TO() { return getToken(EnglishParser.TO, 0); }
		public TerminalNode ADV() { return getToken(EnglishParser.ADV, 0); }
		public Prepositional_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepositional_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterPrepositional_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitPrepositional_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitPrepositional_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prepositional_phraseContext prepositional_phrase() throws RecognitionException {
		Prepositional_phraseContext _localctx = new Prepositional_phraseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prepositional_phrase);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(PREP);
				setState(117);
				noun_phrase(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(IN);
				setState(119);
				noun_phrase(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(TO);
				setState(121);
				noun_phrase(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(PREP);
				setState(123);
				match(ADV);
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

	public static class Verb_phraseContext extends ParserRuleContext {
		public Adverbial_phraseContext adverbial_phrase() {
			return getRuleContext(Adverbial_phraseContext.class,0);
		}
		public List<Verb_phraseContext> verb_phrase() {
			return getRuleContexts(Verb_phraseContext.class);
		}
		public Verb_phraseContext verb_phrase(int i) {
			return getRuleContext(Verb_phraseContext.class,i);
		}
		public InfinitiveContext infinitive() {
			return getRuleContext(InfinitiveContext.class,0);
		}
		public TerminalNode MODAL() { return getToken(EnglishParser.MODAL, 0); }
		public TerminalNode VERB() { return getToken(EnglishParser.VERB, 0); }
		public TerminalNode PARTICLE() { return getToken(EnglishParser.PARTICLE, 0); }
		public TerminalNode CCONJ() { return getToken(EnglishParser.CCONJ, 0); }
		public Adjective_phraseContext adjective_phrase() {
			return getRuleContext(Adjective_phraseContext.class,0);
		}
		public Noun_phraseContext noun_phrase() {
			return getRuleContext(Noun_phraseContext.class,0);
		}
		public Verb_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterVerb_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitVerb_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitVerb_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Verb_phraseContext verb_phrase() throws RecognitionException {
		return verb_phrase(0);
	}

	private Verb_phraseContext verb_phrase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Verb_phraseContext _localctx = new Verb_phraseContext(_ctx, _parentState);
		Verb_phraseContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_verb_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(127);
				adverbial_phrase(0);
				setState(128);
				verb_phrase(13);
				}
				break;
			case 2:
				{
				setState(130);
				infinitive();
				}
				break;
			case 3:
				{
				setState(131);
				infinitive();
				setState(132);
				verb_phrase(6);
				}
				break;
			case 4:
				{
				setState(134);
				match(MODAL);
				setState(135);
				verb_phrase(3);
				}
				break;
			case 5:
				{
				setState(136);
				match(VERB);
				setState(137);
				match(PARTICLE);
				}
				break;
			case 6:
				{
				setState(138);
				match(VERB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(141);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(142);
						match(CCONJ);
						setState(143);
						verb_phrase(6);
						}
						break;
					case 2:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(144);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(145);
						adverbial_phrase(0);
						}
						break;
					case 3:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(146);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(147);
						adjective_phrase(0);
						}
						break;
					case 4:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(148);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(149);
						adjective_phrase(0);
						}
						break;
					case 5:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(150);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(151);
						noun_phrase(0);
						}
						break;
					case 6:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(152);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(153);
						infinitive();
						}
						break;
					case 7:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(154);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(155);
						match(VERB);
						}
						break;
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class InfinitiveContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(EnglishParser.TO, 0); }
		public TerminalNode VERB() { return getToken(EnglishParser.VERB, 0); }
		public InfinitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterInfinitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitInfinitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitInfinitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfinitiveContext infinitive() throws RecognitionException {
		InfinitiveContext _localctx = new InfinitiveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_infinitive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(TO);
			setState(162);
			match(VERB);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return noun_phrase_sempred((Noun_phraseContext)_localctx, predIndex);
		case 9:
			return adjective_phrase_sempred((Adjective_phraseContext)_localctx, predIndex);
		case 10:
			return adverbial_phrase_sempred((Adverbial_phraseContext)_localctx, predIndex);
		case 12:
			return verb_phrase_sempred((Verb_phraseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean noun_phrase_sempred(Noun_phraseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean adjective_phrase_sempred(Adjective_phraseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean adverbial_phrase_sempred(Adverbial_phraseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean verb_phrase_sempred(Verb_phraseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u00a7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nM\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nV\n"+
		"\n\f\n\16\nY\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13b\n\13\3\13\3"+
		"\13\7\13f\n\13\f\13\16\13i\13\13\3\f\3\f\3\f\5\fn\n\f\3\f\3\f\7\fr\n\f"+
		"\f\f\16\fu\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\177\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008e\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u009f\n\16\f\16\16\16\u00a2\13\16\3\17\3\17\3\17\3\17\2\6\22"+
		"\24\26\32\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\7\2\5\5\t\t\f\f\16"+
		"\16\21\21\2\u00b7\2!\3\2\2\2\4-\3\2\2\2\6\60\3\2\2\2\b;\3\2\2\2\n=\3\2"+
		"\2\2\f?\3\2\2\2\16A\3\2\2\2\20C\3\2\2\2\22L\3\2\2\2\24a\3\2\2\2\26m\3"+
		"\2\2\2\30~\3\2\2\2\32\u008d\3\2\2\2\34\u00a3\3\2\2\2\36 \5\n\6\2\37\36"+
		"\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$*\5\6\4"+
		"\2%&\7\r\2\2&)\5\6\4\2\')\5\b\5\2(%\3\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2"+
		"\2\2*+\3\2\2\2+\3\3\2\2\2,*\3\2\2\2-.\5\16\b\2./\5\20\t\2/\5\3\2\2\2\60"+
		"\61\5\4\3\2\61\7\3\2\2\2\62\63\5\f\7\2\63\64\5\4\3\2\64<\3\2\2\2\65\66"+
		"\5\f\7\2\66\67\5\20\t\2\67<\3\2\2\289\5\f\7\29:\5\b\5\2:<\3\2\2\2;\62"+
		"\3\2\2\2;\65\3\2\2\2;8\3\2\2\2<\t\3\2\2\2=>\7\23\2\2>\13\3\2\2\2?@\t\2"+
		"\2\2@\r\3\2\2\2AB\5\22\n\2B\17\3\2\2\2CD\5\32\16\2D\21\3\2\2\2EF\b\n\1"+
		"\2FG\5\24\13\2GH\5\22\n\bHM\3\2\2\2IJ\7\b\2\2JM\5\22\n\6KM\7\4\2\2LE\3"+
		"\2\2\2LI\3\2\2\2LK\3\2\2\2MW\3\2\2\2NO\f\5\2\2OP\7\r\2\2PV\5\22\n\6QR"+
		"\f\4\2\2RV\5\22\n\5ST\f\7\2\2TV\5\24\13\2UN\3\2\2\2UQ\3\2\2\2US\3\2\2"+
		"\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\23\3\2\2\2YW\3\2\2\2Z[\b\13\1\2[\\\5"+
		"\26\f\2\\]\5\24\13\6]b\3\2\2\2^b\5\30\r\2_b\5\b\5\2`b\7\n\2\2aZ\3\2\2"+
		"\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2bg\3\2\2\2cd\f\7\2\2df\5\24\13\bec\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\25\3\2\2\2ig\3\2\2\2jk\b\f\1\2kn\5"+
		"\30\r\2ln\7\13\2\2mj\3\2\2\2ml\3\2\2\2ns\3\2\2\2op\f\5\2\2pr\5\26\f\6"+
		"qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\27\3\2\2\2us\3\2\2\2vw\7\20"+
		"\2\2w\177\5\22\n\2xy\7\21\2\2y\177\5\22\n\2z{\7\17\2\2{\177\5\22\n\2|"+
		"}\7\20\2\2}\177\7\13\2\2~v\3\2\2\2~x\3\2\2\2~z\3\2\2\2~|\3\2\2\2\177\31"+
		"\3\2\2\2\u0080\u0081\b\16\1\2\u0081\u0082\5\26\f\2\u0082\u0083\5\32\16"+
		"\17\u0083\u008e\3\2\2\2\u0084\u008e\5\34\17\2\u0085\u0086\5\34\17\2\u0086"+
		"\u0087\5\32\16\b\u0087\u008e\3\2\2\2\u0088\u0089\7\22\2\2\u0089\u008e"+
		"\5\32\16\5\u008a\u008b\7\6\2\2\u008b\u008e\7\7\2\2\u008c\u008e\7\6\2\2"+
		"\u008d\u0080\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0088"+
		"\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u00a0\3\2\2\2\u008f"+
		"\u0090\f\7\2\2\u0090\u0091\7\r\2\2\u0091\u009f\5\32\16\b\u0092\u0093\f"+
		"\16\2\2\u0093\u009f\5\26\f\2\u0094\u0095\f\r\2\2\u0095\u009f\5\24\13\2"+
		"\u0096\u0097\f\f\2\2\u0097\u009f\5\24\13\2\u0098\u0099\f\13\2\2\u0099"+
		"\u009f\5\22\n\2\u009a\u009b\f\t\2\2\u009b\u009f\5\34\17\2\u009c\u009d"+
		"\f\6\2\2\u009d\u009f\7\6\2\2\u009e\u008f\3\2\2\2\u009e\u0092\3\2\2\2\u009e"+
		"\u0094\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009a\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\33\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\17\2"+
		"\2\u00a4\u00a5\7\6\2\2\u00a5\35\3\2\2\2\21!(*;LUWagms~\u008d\u009e\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}