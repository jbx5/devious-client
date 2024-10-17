import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ru")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ai")
	static final Object field4901;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -927879311
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -440753185
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -578695597
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2134664353
	)
	static int field4905;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1032568373
	)
	static int field4906;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 442556591
	)
	static int field4911;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1277306163
	)
	static int field4913;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1642211417
	)
	static int field4907;
	@ObfuscatedName("af")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ab")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("az")
	static byte[][] field4909;
	@ObfuscatedName("ac")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("av")
	public static ArrayList field4902;
	@ObfuscatedName("gh")
	@Export("characterId")
	static String characterId;

	static {
		field4901 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4905 = 0;
		field4906 = 1000;
		field4911 = 250;
		field4913 = 100;
		field4907 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4909 = new byte[50][];
		field4902 = new ArrayList();
		class326.method6529();
		new HashMap();
	}
}
