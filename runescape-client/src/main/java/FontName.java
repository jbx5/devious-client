import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ps")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("rg")
	@ObfuscatedSignature(descriptor = "Leh;")
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;

	@ObfuscatedName("uj")
	@ObfuscatedGetter(longValue = -8852451714535883403L)
	static long field4587;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lps;")
	@Export("FontName_plain11")
	public static final FontName FontName_plain11 = new FontName("p11_full");

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lps;")
	@Export("FontName_plain12")
	public static final FontName FontName_plain12 = new FontName("p12_full");

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lps;")
	@Export("FontName_bold12")
	public static final FontName FontName_bold12 = new FontName("b12_full");

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lps;")
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11 = new FontName("verdana_11pt_regular");

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lps;")
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13 = new FontName("verdana_13pt_regular");

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lps;")
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15 = new FontName("verdana_15pt_regular");

	@ObfuscatedName("i")
	@Export("name")
	String name;

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "374763571")
	public static int method7323(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "96")
	static int method7322(int var0) {
		Message var1 = ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message) (var1.nextDual)).count;
		}
	}
}