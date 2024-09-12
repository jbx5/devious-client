import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rv")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ax")
	static final Object field4860;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -145793157
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 616356373
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1967111483
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1928887871
	)
	static int field4863;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1355366693
	)
	static int field4865;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 437920511
	)
	static int field4864;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1658340949
	)
	static int field4866;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1475470787
	)
	static int field4868;
	@ObfuscatedName("ap")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ab")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("az")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("aa")
	static byte[][] field4872;
	@ObfuscatedName("ay")
	public static ArrayList field4873;

	static {
		field4860 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4863 = 0;
		field4865 = 1000;
		field4864 = 250;
		field4866 = 100;
		field4868 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4872 = new byte[50][];
		field4873 = new ArrayList();
		field4873.clear();
		field4873.add(100);
		field4873.add(5000);
		field4873.add(10000);
		field4873.add(30000);
		new HashMap();
	}
}
