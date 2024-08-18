import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public class class332 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	public static AbstractArchive field3572;
	@ObfuscatedName("au")
	public static ArrayList field3562;
	@ObfuscatedName("ax")
	public static LinkedList field3563;
	@ObfuscatedName("ao")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("am")
	public static ArrayList field3565;
	@ObfuscatedName("ac")
	public static ArrayList field3566;
	@ObfuscatedName("ae")
	public static final List field3569;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -95479787
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 56397263
	)
	static int field3568;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 550690283
	)
	static int field3570;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1567107183
	)
	static int field3567;

	static {
		field3562 = null;
		field3563 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3565 = new ArrayList(3);
		field3566 = new ArrayList();
		field3569 = new ArrayList();
		musicPlayerStatus = 0;
		field3568 = 0;
		field3570 = 0;
		field3567 = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-81250696"
	)
	public static boolean method6240(int var0) {
		return var0 >= WorldMapDecorationType.field3999.id && var0 <= WorldMapDecorationType.field4007.id || var0 == WorldMapDecorationType.field3995.id;
	}
}
