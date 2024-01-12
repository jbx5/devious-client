// Generated from net/runelite/cache/script/assembler/rs2asm.g4 by ANTLR 4.13.1
package net.runelite.cache.script.assembler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class rs2asmLexer extends Lexer
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames()
	{
		return new String[]{
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NEWLINE", "INT", "QSTRING",
			"IDENTIFIER", "COMMENT", "WS"
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

	public rs2asmLexer(CharStream input)
	{
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
	public String[] getChannelNames()
	{
		return channelNames;
	}

	@Override
	public String[] getModeNames()
	{
		return modeNames;
	}

	@Override
	public ATN getATN()
	{
		return _ATN;
	}

	public static final String _serializedATN =
		"\u0004\u0000\f\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
			"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
			"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
			"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
			"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000" +
			"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
			"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
			"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
			"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
			"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
			"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
			"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003" +
			"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
			"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
			"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
			"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
			"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
			"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006" +
			"l\b\u0006\u000b\u0006\f\u0006m\u0001\u0007\u0003\u0007q\b\u0007\u0001" +
			"\u0007\u0004\u0007t\b\u0007\u000b\u0007\f\u0007u\u0001\b\u0001\b\u0001" +
			"\b\u0001\b\u0005\b|\b\b\n\b\f\b\u007f\t\b\u0001\b\u0001\b\u0001\t\u0004" +
			"\t\u0084\b\t\u000b\t\f\t\u0085\u0001\n\u0001\n\u0005\n\u008a\b\n\n\n\f" +
			"\n\u008d\t\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u0092\b\u000b\u000b" +
			"\u000b\f\u000b\u0093\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001" +
			"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f" +
			"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0006\u0002\u0000\n" +
			"\n\r\r\u0001\u000009\u0004\u0000\n\n\r\r\"\"\\\\\u0002\u0000\"\"\\\\\u0004" +
			"\u000009AZ__az\u0002\u0000\t\t  \u009e\u0000\u0001\u0001\u0000\u0000\u0000" +
			"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000" +
			"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000" +
			"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f" +
			"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013" +
			"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017" +
			"\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001e" +
			"\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u0007E\u0001\u0000" +
			"\u0000\u0000\tU\u0001\u0000\u0000\u0000\u000bh\u0001\u0000\u0000\u0000" +
			"\rk\u0001\u0000\u0000\u0000\u000fp\u0001\u0000\u0000\u0000\u0011w\u0001" +
			"\u0000\u0000\u0000\u0013\u0083\u0001\u0000\u0000\u0000\u0015\u0087\u0001" +
			"\u0000\u0000\u0000\u0017\u0091\u0001\u0000\u0000\u0000\u0019\u001a\u0005" +
			".\u0000\u0000\u001a\u001b\u0005i\u0000\u0000\u001b\u001c\u0005d\u0000" +
			"\u0000\u001c\u001d\u0005 \u0000\u0000\u001d\u0002\u0001\u0000\u0000\u0000" +
			"\u001e\u001f\u0005.\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005n\u0000" +
			"\u0000!\"\u0005t\u0000\u0000\"#\u0005_\u0000\u0000#$\u0005s\u0000\u0000" +
			"$%\u0005t\u0000\u0000%&\u0005a\u0000\u0000&\'\u0005c\u0000\u0000\'(\u0005" +
			"k\u0000\u0000()\u0005_\u0000\u0000)*\u0005c\u0000\u0000*+\u0005o\u0000" +
			"\u0000+,\u0005u\u0000\u0000,-\u0005n\u0000\u0000-.\u0005t\u0000\u0000" +
			"./\u0005 \u0000\u0000/\u0004\u0001\u0000\u0000\u000001\u0005.\u0000\u0000" +
			"12\u0005s\u0000\u000023\u0005t\u0000\u000034\u0005r\u0000\u000045\u0005" +
			"i\u0000\u000056\u0005n\u0000\u000067\u0005g\u0000\u000078\u0005_\u0000" +
			"\u000089\u0005s\u0000\u00009:\u0005t\u0000\u0000:;\u0005a\u0000\u0000" +
			";<\u0005c\u0000\u0000<=\u0005k\u0000\u0000=>\u0005_\u0000\u0000>?\u0005" +
			"c\u0000\u0000?@\u0005o\u0000\u0000@A\u0005u\u0000\u0000AB\u0005n\u0000" +
			"\u0000BC\u0005t\u0000\u0000CD\u0005 \u0000\u0000D\u0006\u0001\u0000\u0000" +
			"\u0000EF\u0005.\u0000\u0000FG\u0005i\u0000\u0000GH\u0005n\u0000\u0000" +
			"HI\u0005t\u0000\u0000IJ\u0005_\u0000\u0000JK\u0005v\u0000\u0000KL\u0005" +
			"a\u0000\u0000LM\u0005r\u0000\u0000MN\u0005_\u0000\u0000NO\u0005c\u0000" +
			"\u0000OP\u0005o\u0000\u0000PQ\u0005u\u0000\u0000QR\u0005n\u0000\u0000" +
			"RS\u0005t\u0000\u0000ST\u0005 \u0000\u0000T\b\u0001\u0000\u0000\u0000" +
			"UV\u0005.\u0000\u0000VW\u0005s\u0000\u0000WX\u0005t\u0000\u0000XY\u0005" +
			"r\u0000\u0000YZ\u0005i\u0000\u0000Z[\u0005n\u0000\u0000[\\\u0005g\u0000" +
			"\u0000\\]\u0005_\u0000\u0000]^\u0005v\u0000\u0000^_\u0005a\u0000\u0000" +
			"_`\u0005r\u0000\u0000`a\u0005_\u0000\u0000ab\u0005c\u0000\u0000bc\u0005" +
			"o\u0000\u0000cd\u0005u\u0000\u0000de\u0005n\u0000\u0000ef\u0005t\u0000" +
			"\u0000fg\u0005 \u0000\u0000g\n\u0001\u0000\u0000\u0000hi\u0005:\u0000" +
			"\u0000i\f\u0001\u0000\u0000\u0000jl\u0007\u0000\u0000\u0000kj\u0001\u0000" +
			"\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001" +
			"\u0000\u0000\u0000n\u000e\u0001\u0000\u0000\u0000oq\u0005-\u0000\u0000" +
			"po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000" +
			"\u0000rt\u0007\u0001\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000" +
			"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0010" +
			"\u0001\u0000\u0000\u0000w}\u0005\"\u0000\u0000x|\b\u0002\u0000\u0000y" +
			"z\u0005\\\u0000\u0000z|\u0007\u0003\u0000\u0000{x\u0001\u0000\u0000\u0000" +
			"{y\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000" +
			"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000" +
			"\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\"\u0000\u0000\u0081" +
			"\u0012\u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0004\u0000\u0000\u0083" +
			"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085" +
			"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086" +
			"\u0014\u0001\u0000\u0000\u0000\u0087\u008b\u0005;\u0000\u0000\u0088\u008a" +
			"\b\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001" +
			"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001" +
			"\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001" +
			"\u0000\u0000\u0000\u008e\u008f\u0006\n\u0000\u0000\u008f\u0016\u0001\u0000" +
			"\u0000\u0000\u0090\u0092\u0007\u0005\u0000\u0000\u0091\u0090\u0001\u0000" +
			"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000" +
			"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000" +
			"\u0000\u0000\u0095\u0096\u0006\u000b\u0000\u0000\u0096\u0018\u0001\u0000" +
			"\u0000\u0000\t\u0000mpu{}\u0085\u008b\u0093\u0001\u0000\u0001\u0000";
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