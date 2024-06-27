import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ap")
	static final Object field4830;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1386334113
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2045503449
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1337920469
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1262218377
	)
	static int field4835;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -870884913
	)
	static int field4844;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1356136809
	)
	static int field4837;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1538023343
	)
	static int field4828;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1171539117
	)
	static int field4839;
	@ObfuscatedName("az")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ac")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("al")
	static byte[][] field4843;
	@ObfuscatedName("as")
	static ArrayList field4842;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;

	static {
		field4830 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4835 = 0;
		field4844 = 1000;
		field4837 = 250;
		field4828 = 100;
		field4839 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4843 = new byte[50][];
		field4842 = new ArrayList();
		class323.method6110();
		new HashMap();
	}
}
