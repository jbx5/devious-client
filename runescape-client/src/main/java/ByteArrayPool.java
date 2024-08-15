import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ru")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ax")
	static final Object field4822;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1050261063
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -305531163
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2081451947
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2125116443
	)
	static int field4830;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2017601609
	)
	static int field4817;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1517527737
	)
	static int field4824;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2096165279
	)
	static int field4825;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -324720975
	)
	static int field4823;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("aw")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("af")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("aa")
	static byte[][] field4814;
	@ObfuscatedName("ag")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("ar")
	static ArrayList field4832;

	static {
		field4822 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4830 = 0;
		field4817 = 1000;
		field4824 = 250;
		field4825 = 100;
		field4823 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4814 = new byte[50][];
		field4832 = new ArrayList();
		field4832.clear();
		field4832.add(100);
		field4832.add(5000);
		field4832.add(10000);
		field4832.add(30000);
		new HashMap();
	}
}
