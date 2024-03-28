import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qi")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 446917873
	)
	static int field4688;
	@ObfuscatedName("an")
	static final Object field4673;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1569247239
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1321235799
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 578336323
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -596846905
	)
	static int field4677;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1655405667
	)
	static int field4678;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2971375
	)
	static int field4679;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 756056135
	)
	static int field4680;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1727442963
	)
	static int field4681;
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("aj")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("au")
	static byte[][] field4685;
	@ObfuscatedName("aa")
	static ArrayList field4686;

	static {
		field4673 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4677 = 0;
		field4678 = 1000;
		field4679 = 250;
		field4680 = 100;
		field4681 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4685 = new byte[50][];
		field4686 = new ArrayList();
		field4686.clear();
		field4686.add(100);
		field4686.add(5000);
		field4686.add(10000);
		field4686.add(30000);
		new HashMap();
	}
}
