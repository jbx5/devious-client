// Generated from net/runelite/cache/script/assembler/rs2asm.g4 by ANTLR 4.13.1
package net.runelite.cache.script.assembler;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class rs2asmParser extends Parser
{
	static
	{
		RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, NEWLINE = 7, INT = 8, QSTRING = 9,
		IDENTIFIER = 10, COMMENT = 11, WS = 12;
	public static final int
		RULE_prog = 0, RULE_header = 1, RULE_id = 2, RULE_int_stack_count = 3,
		RULE_string_stack_count = 4, RULE_int_var_count = 5, RULE_string_var_count = 6,
		RULE_id_value = 7, RULE_int_stack_value = 8, RULE_string_stack_value = 9,
		RULE_int_var_value = 10, RULE_string_var_value = 11, RULE_line = 12, RULE_instruction = 13,
		RULE_label = 14, RULE_instruction_name = 15, RULE_name_string = 16, RULE_name_opcode = 17,
		RULE_instruction_operand = 18, RULE_operand_int = 19, RULE_operand_qstring = 20,
		RULE_operand_label = 21, RULE_switch_lookup = 22, RULE_switch_key = 23,
		RULE_switch_value = 24;

	private static String[] makeRuleNames()
	{
		return new String[]{
			"prog", "header", "id", "int_stack_count", "string_stack_count", "int_var_count",
			"string_var_count", "id_value", "int_stack_value", "string_stack_value",
			"int_var_value", "string_var_value", "line", "instruction", "label",
			"instruction_name", "name_string", "name_opcode", "instruction_operand",
			"operand_int", "operand_qstring", "operand_label", "switch_lookup", "switch_key",
			"switch_value"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames()
	{
		return new String[]{
			null, "'.id '", "'.int_stack_count '", "'.string_stack_count '", "'.int_var_count '",
			"'.string_var_count '", "':'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames()
	{
		return new String[]{
			null, null, null, null, null, null, null, "NEWLINE", "INT", "QSTRING",
			"IDENTIFIER", "COMMENT", "WS"
		};
	}

	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;

	static
	{
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++)
		{
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null)
			{
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null)
			{
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames()
	{
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary()
	{
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName()
	{
		return "rs2asm.g4";
	}

	@Override
	public String[] getRuleNames()
	{
		return ruleNames;
	}

	@Override
	public String getSerializedATN()
	{
		return _serializedATN;
	}

	@Override
	public ATN getATN()
	{
		return _ATN;
	}

	public rs2asmParser(TokenStream input)
	{
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext
	{
		public List<TerminalNode> NEWLINE()
		{
			return getTokens(rs2asmParser.NEWLINE);
		}

		public TerminalNode NEWLINE(int i)
		{
			return getToken(rs2asmParser.NEWLINE, i);
		}

		public List<HeaderContext> header()
		{
			return getRuleContexts(HeaderContext.class);
		}

		public HeaderContext header(int i)
		{
			return getRuleContext(HeaderContext.class, i);
		}

		public List<LineContext> line()
		{
			return getRuleContexts(LineContext.class);
		}

		public LineContext line(int i)
		{
			return getRuleContext(LineContext.class, i);
		}

		public ProgContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_prog;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterProg(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException
	{
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == NEWLINE)
				{
					{
						{
							setState(50);
							match(NEWLINE);
						}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0))
				{
					{
						{
							setState(56);
							header();
							setState(58);
							_errHandler.sync(this);
							_la = _input.LA(1);
							do
							{
								{
									{
										setState(57);
										match(NEWLINE);
									}
								}
								setState(60);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							while (_la == NEWLINE);
						}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do
				{
					{
						{
							setState(67);
							line();
							setState(69);
							_errHandler.sync(this);
							_la = _input.LA(1);
							do
							{
								{
									{
										setState(68);
										match(NEWLINE);
									}
								}
								setState(71);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							while (_la == NEWLINE);
						}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				while (_la == INT || _la == IDENTIFIER);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderContext extends ParserRuleContext
	{
		public IdContext id()
		{
			return getRuleContext(IdContext.class, 0);
		}

		public Int_stack_countContext int_stack_count()
		{
			return getRuleContext(Int_stack_countContext.class, 0);
		}

		public String_stack_countContext string_stack_count()
		{
			return getRuleContext(String_stack_countContext.class, 0);
		}

		public Int_var_countContext int_var_count()
		{
			return getRuleContext(Int_var_countContext.class, 0);
		}

		public String_var_countContext string_var_count()
		{
			return getRuleContext(String_var_countContext.class, 0);
		}

		public HeaderContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_header;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterHeader(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException
	{
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try
		{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1))
			{
				case T__0:
					enterOuterAlt(_localctx, 1);
				{
					setState(77);
					id();
				}
				break;
				case T__1:
					enterOuterAlt(_localctx, 2);
				{
					setState(78);
					int_stack_count();
				}
				break;
				case T__2:
					enterOuterAlt(_localctx, 3);
				{
					setState(79);
					string_stack_count();
				}
				break;
				case T__3:
					enterOuterAlt(_localctx, 4);
				{
					setState(80);
					int_var_count();
				}
				break;
				case T__4:
					enterOuterAlt(_localctx, 5);
				{
					setState(81);
					string_var_count();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext
	{
		public Id_valueContext id_value()
		{
			return getRuleContext(Id_valueContext.class, 0);
		}

		public IdContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_id;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException
	{
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(84);
				match(T__0);
				setState(85);
				id_value();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Int_stack_countContext extends ParserRuleContext
	{
		public Int_stack_valueContext int_stack_value()
		{
			return getRuleContext(Int_stack_valueContext.class, 0);
		}

		public Int_stack_countContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_int_stack_count;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterInt_stack_count(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitInt_stack_count(this);
		}
	}

	public final Int_stack_countContext int_stack_count() throws RecognitionException
	{
		Int_stack_countContext _localctx = new Int_stack_countContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_int_stack_count);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(87);
				match(T__1);
				setState(88);
				int_stack_value();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_stack_countContext extends ParserRuleContext
	{
		public String_stack_valueContext string_stack_value()
		{
			return getRuleContext(String_stack_valueContext.class, 0);
		}

		public String_stack_countContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_string_stack_count;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener)
				((rs2asmListener) listener).enterString_stack_count(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener)
				((rs2asmListener) listener).exitString_stack_count(this);
		}
	}

	public final String_stack_countContext string_stack_count() throws RecognitionException
	{
		String_stack_countContext _localctx = new String_stack_countContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_stack_count);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(90);
				match(T__2);
				setState(91);
				string_stack_value();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Int_var_countContext extends ParserRuleContext
	{
		public Int_var_valueContext int_var_value()
		{
			return getRuleContext(Int_var_valueContext.class, 0);
		}

		public Int_var_countContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_int_var_count;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterInt_var_count(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitInt_var_count(this);
		}
	}

	public final Int_var_countContext int_var_count() throws RecognitionException
	{
		Int_var_countContext _localctx = new Int_var_countContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_int_var_count);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(93);
				match(T__3);
				setState(94);
				int_var_value();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_var_countContext extends ParserRuleContext
	{
		public String_var_valueContext string_var_value()
		{
			return getRuleContext(String_var_valueContext.class, 0);
		}

		public String_var_countContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_string_var_count;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterString_var_count(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitString_var_count(this);
		}
	}

	public final String_var_countContext string_var_count() throws RecognitionException
	{
		String_var_countContext _localctx = new String_var_countContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string_var_count);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(96);
				match(T__4);
				setState(97);
				string_var_value();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_valueContext extends ParserRuleContext
	{
		public TerminalNode INT()
		{
			return getToken(rs2asmParser.INT, 0);
		}

		public Id_valueContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_id_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterId_value(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitId_value(this);
		}
	}

	public final Id_valueContext id_value() throws RecognitionException
	{
		Id_valueContext _localctx = new Id_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_id_value);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(99);
				match(INT);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Int_stack_valueContext extends ParserRuleContext
	{
		public TerminalNode INT()
		{
			return getToken(rs2asmParser.INT, 0);
		}

		public Int_stack_valueContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_int_stack_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterInt_stack_value(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitInt_stack_value(this);
		}
	}

	public final Int_stack_valueContext int_stack_value() throws RecognitionException
	{
		Int_stack_valueContext _localctx = new Int_stack_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_int_stack_value);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(101);
				match(INT);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_stack_valueContext extends ParserRuleContext
	{
		public TerminalNode INT()
		{
			return getToken(rs2asmParser.INT, 0);
		}

		public String_stack_valueContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_string_stack_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener)
				((rs2asmListener) listener).enterString_stack_value(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener)
				((rs2asmListener) listener).exitString_stack_value(this);
		}
	}

	public final String_stack_valueContext string_stack_value() throws RecognitionException
	{
		String_stack_valueContext _localctx = new String_stack_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string_stack_value);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(103);
				match(INT);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Int_var_valueContext extends ParserRuleContext
	{
		public TerminalNode INT()
		{
			return getToken(rs2asmParser.INT, 0);
		}

		public Int_var_valueContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_int_var_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterInt_var_value(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitInt_var_value(this);
		}
	}

	public final Int_var_valueContext int_var_value() throws RecognitionException
	{
		Int_var_valueContext _localctx = new Int_var_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_int_var_value);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(105);
				match(INT);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_var_valueContext extends ParserRuleContext
	{
		public TerminalNode INT()
		{
			return getToken(rs2asmParser.INT, 0);
		}

		public String_var_valueContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_string_var_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterString_var_value(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitString_var_value(this);
		}
	}

	public final String_var_valueContext string_var_value() throws RecognitionException
	{
		String_var_valueContext _localctx = new String_var_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string_var_value);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(107);
				match(INT);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext
	{
		public InstructionContext instruction()
		{
			return getRuleContext(InstructionContext.class, 0);
		}

		public LabelContext label()
		{
			return getRuleContext(LabelContext.class, 0);
		}

		public Switch_lookupContext switch_lookup()
		{
			return getRuleContext(Switch_lookupContext.class, 0);
		}

		public LineContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_line;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterLine(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException
	{
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_line);
		try
		{
			setState(112);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 6, _ctx))
			{
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(109);
					instruction();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(110);
					label();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(111);
					switch_lookup();
				}
				break;
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext
	{
		public Instruction_nameContext instruction_name()
		{
			return getRuleContext(Instruction_nameContext.class, 0);
		}

		public Instruction_operandContext instruction_operand()
		{
			return getRuleContext(Instruction_operandContext.class, 0);
		}

		public InstructionContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_instruction;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterInstruction(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException
	{
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instruction);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(114);
				instruction_name();
				setState(115);
				instruction_operand();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext
	{
		public TerminalNode IDENTIFIER()
		{
			return getToken(rs2asmParser.IDENTIFIER, 0);
		}

		public LabelContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_label;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterLabel(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException
	{
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_label);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(117);
				match(IDENTIFIER);
				setState(118);
				match(T__5);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Instruction_nameContext extends ParserRuleContext
	{
		public Name_stringContext name_string()
		{
			return getRuleContext(Name_stringContext.class, 0);
		}

		public Name_opcodeContext name_opcode()
		{
			return getRuleContext(Name_opcodeContext.class, 0);
		}

		public Instruction_nameContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_instruction_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterInstruction_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitInstruction_name(this);
		}
	}

	public final Instruction_nameContext instruction_name() throws RecognitionException
	{
		Instruction_nameContext _localctx = new Instruction_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruction_name);
		try
		{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1))
			{
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(120);
					name_string();
				}
				break;
				case INT:
					enterOuterAlt(_localctx, 2);
				{
					setState(121);
					name_opcode();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Name_stringContext extends ParserRuleContext
	{
		public TerminalNode IDENTIFIER()
		{
			return getToken(rs2asmParser.IDENTIFIER, 0);
		}

		public Name_stringContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_name_string;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterName_string(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitName_string(this);
		}
	}

	public final Name_stringContext name_string() throws RecognitionException
	{
		Name_stringContext _localctx = new Name_stringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_name_string);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(124);
				match(IDENTIFIER);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Name_opcodeContext extends ParserRuleContext
	{
		public TerminalNode INT()
		{
			return getToken(rs2asmParser.INT, 0);
		}

		public Name_opcodeContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_name_opcode;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterName_opcode(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitName_opcode(this);
		}
	}

	public final Name_opcodeContext name_opcode() throws RecognitionException
	{
		Name_opcodeContext _localctx = new Name_opcodeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_name_opcode);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(126);
				match(INT);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Instruction_operandContext extends ParserRuleContext
	{
		public Operand_intContext operand_int()
		{
			return getRuleContext(Operand_intContext.class, 0);
		}

		public Operand_qstringContext operand_qstring()
		{
			return getRuleContext(Operand_qstringContext.class, 0);
		}

		public Operand_labelContext operand_label()
		{
			return getRuleContext(Operand_labelContext.class, 0);
		}

		public Instruction_operandContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_instruction_operand;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener)
				((rs2asmListener) listener).enterInstruction_operand(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener)
				((rs2asmListener) listener).exitInstruction_operand(this);
		}
	}

	public final Instruction_operandContext instruction_operand() throws RecognitionException
	{
		Instruction_operandContext _localctx = new Instruction_operandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_instruction_operand);
		try
		{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1))
			{
				case INT:
					enterOuterAlt(_localctx, 1);
				{
					setState(128);
					operand_int();
				}
				break;
				case QSTRING:
					enterOuterAlt(_localctx, 2);
				{
					setState(129);
					operand_qstring();
				}
				break;
				case IDENTIFIER:
					enterOuterAlt(_localctx, 3);
				{
					setState(130);
					operand_label();
				}
				break;
				case NEWLINE:
					enterOuterAlt(_localctx, 4);
				{
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operand_intContext extends ParserRuleContext
	{
		public TerminalNode INT()
		{
			return getToken(rs2asmParser.INT, 0);
		}

		public Operand_intContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_operand_int;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterOperand_int(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitOperand_int(this);
		}
	}

	public final Operand_intContext operand_int() throws RecognitionException
	{
		Operand_intContext _localctx = new Operand_intContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operand_int);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(134);
				match(INT);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operand_qstringContext extends ParserRuleContext
	{
		public TerminalNode QSTRING()
		{
			return getToken(rs2asmParser.QSTRING, 0);
		}

		public Operand_qstringContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_operand_qstring;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterOperand_qstring(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitOperand_qstring(this);
		}
	}

	public final Operand_qstringContext operand_qstring() throws RecognitionException
	{
		Operand_qstringContext _localctx = new Operand_qstringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operand_qstring);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(136);
				match(QSTRING);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operand_labelContext extends ParserRuleContext
	{
		public TerminalNode IDENTIFIER()
		{
			return getToken(rs2asmParser.IDENTIFIER, 0);
		}

		public Operand_labelContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_operand_label;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterOperand_label(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitOperand_label(this);
		}
	}

	public final Operand_labelContext operand_label() throws RecognitionException
	{
		Operand_labelContext _localctx = new Operand_labelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operand_label);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(138);
				match(IDENTIFIER);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_lookupContext extends ParserRuleContext
	{
		public Switch_keyContext switch_key()
		{
			return getRuleContext(Switch_keyContext.class, 0);
		}

		public Switch_valueContext switch_value()
		{
			return getRuleContext(Switch_valueContext.class, 0);
		}

		public Switch_lookupContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_switch_lookup;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterSwitch_lookup(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitSwitch_lookup(this);
		}
	}

	public final Switch_lookupContext switch_lookup() throws RecognitionException
	{
		Switch_lookupContext _localctx = new Switch_lookupContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_lookup);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(140);
				switch_key();
				setState(141);
				match(T__5);
				setState(142);
				switch_value();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_keyContext extends ParserRuleContext
	{
		public TerminalNode INT()
		{
			return getToken(rs2asmParser.INT, 0);
		}

		public Switch_keyContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_switch_key;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterSwitch_key(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitSwitch_key(this);
		}
	}

	public final Switch_keyContext switch_key() throws RecognitionException
	{
		Switch_keyContext _localctx = new Switch_keyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switch_key);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(144);
				match(INT);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_valueContext extends ParserRuleContext
	{
		public TerminalNode IDENTIFIER()
		{
			return getToken(rs2asmParser.IDENTIFIER, 0);
		}

		public Switch_valueContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_switch_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).enterSwitch_value(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof rs2asmListener) ((rs2asmListener) listener).exitSwitch_value(this);
		}
	}

	public final Switch_valueContext switch_value() throws RecognitionException
	{
		Switch_valueContext _localctx = new Switch_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switch_value);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(146);
				match(IDENTIFIER);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\f\u0095\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
			"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
			"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
			"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
			"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
			"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
			"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015" +
			"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018" +
			"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000" +
			"\u0001\u0000\u0004\u0000;\b\u0000\u000b\u0000\f\u0000<\u0005\u0000?\b" +
			"\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001\u0000\u0004\u0000F\b" +
			"\u0000\u000b\u0000\f\u0000G\u0004\u0000J\b\u0000\u000b\u0000\f\u0000K" +
			"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001" +
			"S\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003" +
			"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005" +
			"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007" +
			"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b" +
			"\u0001\f\u0001\f\u0001\f\u0003\fq\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e" +
			"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f{\b\u000f" +
			"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012" +
			"\u0001\u0012\u0001\u0012\u0003\u0012\u0085\b\u0012\u0001\u0013\u0001\u0013" +
			"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016" +
			"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018" +
			"\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010" +
			"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0000\u008a" +
			"\u00005\u0001\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004T" +
			"\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000\bZ\u0001\u0000" +
			"\u0000\u0000\n]\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000e" +
			"c\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000\u0012g\u0001" +
			"\u0000\u0000\u0000\u0014i\u0001\u0000\u0000\u0000\u0016k\u0001\u0000\u0000" +
			"\u0000\u0018p\u0001\u0000\u0000\u0000\u001ar\u0001\u0000\u0000\u0000\u001c" +
			"u\u0001\u0000\u0000\u0000\u001ez\u0001\u0000\u0000\u0000 |\u0001\u0000" +
			"\u0000\u0000\"~\u0001\u0000\u0000\u0000$\u0084\u0001\u0000\u0000\u0000" +
			"&\u0086\u0001\u0000\u0000\u0000(\u0088\u0001\u0000\u0000\u0000*\u008a" +
			"\u0001\u0000\u0000\u0000,\u008c\u0001\u0000\u0000\u0000.\u0090\u0001\u0000" +
			"\u0000\u00000\u0092\u0001\u0000\u0000\u000024\u0005\u0007\u0000\u0000" +
			"32\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000" +
			"\u000056\u0001\u0000\u0000\u00006@\u0001\u0000\u0000\u000075\u0001\u0000" +
			"\u0000\u00008:\u0003\u0002\u0001\u00009;\u0005\u0007\u0000\u0000:9\u0001" +
			"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000" +
			"<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000" +
			"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000" +
			"\u0000\u0000AI\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CE\u0003" +
			"\u0018\f\u0000DF\u0005\u0007\u0000\u0000ED\u0001\u0000\u0000\u0000FG\u0001" +
			"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000" +
			"HJ\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000" +
			"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0001\u0001" +
			"\u0000\u0000\u0000MS\u0003\u0004\u0002\u0000NS\u0003\u0006\u0003\u0000" +
			"OS\u0003\b\u0004\u0000PS\u0003\n\u0005\u0000QS\u0003\f\u0006\u0000RM\u0001" +
			"\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000" +
			"RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u0003\u0001\u0000" +
			"\u0000\u0000TU\u0005\u0001\u0000\u0000UV\u0003\u000e\u0007\u0000V\u0005" +
			"\u0001\u0000\u0000\u0000WX\u0005\u0002\u0000\u0000XY\u0003\u0010\b\u0000" +
			"Y\u0007\u0001\u0000\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0003\u0012" +
			"\t\u0000\\\t\u0001\u0000\u0000\u0000]^\u0005\u0004\u0000\u0000^_\u0003" +
			"\u0014\n\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0005\u0005\u0000\u0000" +
			"ab\u0003\u0016\u000b\u0000b\r\u0001\u0000\u0000\u0000cd\u0005\b\u0000" +
			"\u0000d\u000f\u0001\u0000\u0000\u0000ef\u0005\b\u0000\u0000f\u0011\u0001" +
			"\u0000\u0000\u0000gh\u0005\b\u0000\u0000h\u0013\u0001\u0000\u0000\u0000" +
			"ij\u0005\b\u0000\u0000j\u0015\u0001\u0000\u0000\u0000kl\u0005\b\u0000" +
			"\u0000l\u0017\u0001\u0000\u0000\u0000mq\u0003\u001a\r\u0000nq\u0003\u001c" +
			"\u000e\u0000oq\u0003,\u0016\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000" +
			"\u0000\u0000po\u0001\u0000\u0000\u0000q\u0019\u0001\u0000\u0000\u0000" +
			"rs\u0003\u001e\u000f\u0000st\u0003$\u0012\u0000t\u001b\u0001\u0000\u0000" +
			"\u0000uv\u0005\n\u0000\u0000vw\u0005\u0006\u0000\u0000w\u001d\u0001\u0000" +
			"\u0000\u0000x{\u0003 \u0010\u0000y{\u0003\"\u0011\u0000zx\u0001\u0000" +
			"\u0000\u0000zy\u0001\u0000\u0000\u0000{\u001f\u0001\u0000\u0000\u0000" +
			"|}\u0005\n\u0000\u0000}!\u0001\u0000\u0000\u0000~\u007f\u0005\b\u0000" +
			"\u0000\u007f#\u0001\u0000\u0000\u0000\u0080\u0085\u0003&\u0013\u0000\u0081" +
			"\u0085\u0003(\u0014\u0000\u0082\u0085\u0003*\u0015\u0000\u0083\u0085\u0001" +
			"\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0084\u0081\u0001" +
			"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001" +
			"\u0000\u0000\u0000\u0085%\u0001\u0000\u0000\u0000\u0086\u0087\u0005\b" +
			"\u0000\u0000\u0087\'\u0001\u0000\u0000\u0000\u0088\u0089\u0005\t\u0000" +
			"\u0000\u0089)\u0001\u0000\u0000\u0000\u008a\u008b\u0005\n\u0000\u0000" +
			"\u008b+\u0001\u0000\u0000\u0000\u008c\u008d\u0003.\u0017\u0000\u008d\u008e" +
			"\u0005\u0006\u0000\u0000\u008e\u008f\u00030\u0018\u0000\u008f-\u0001\u0000" +
			"\u0000\u0000\u0090\u0091\u0005\b\u0000\u0000\u0091/\u0001\u0000\u0000" +
			"\u0000\u0092\u0093\u0005\n\u0000\u0000\u00931\u0001\u0000\u0000\u0000" +
			"\t5<@GKRpz\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static
	{
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++)
		{
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}