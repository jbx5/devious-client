import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ar")
	static final Object field4643;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 95075025
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1733840085
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 238849037
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1707937517
	)
	static int field4650;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1718537455
	)
	static int field4651;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 780171219
	)
	static int field4652;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1424963267
	)
	static int field4653;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -446408405
	)
	static int field4654;
	@ObfuscatedName("af")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("an")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ag")
	static byte[][] field4658;
	@ObfuscatedName("am")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ay")
	public static ArrayList field4646;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	static {
		field4643 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4650 = 0;
		field4651 = 1000;
		field4652 = 250;
		field4653 = 100;
		field4654 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4658 = new byte[50][];
		field4646 = new ArrayList();
		Message.method1184();
		new HashMap();
	}
}
