import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class319 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static AbstractArchive field3458;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static AbstractArchive field3455;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static AbstractArchive field3456;
	@ObfuscatedName("aj")
	public static ArrayList field3457;
	@ObfuscatedName("aq")
	public static LinkedList field3461;
	@ObfuscatedName("ar")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("ag")
	public static ArrayList field3466;
	@ObfuscatedName("ao")
	public static ArrayList field3462;
	@ObfuscatedName("ae")
	public static final List field3463;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -376058759
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 711086529
	)
	static int field3464;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -177841689
	)
	static int field3465;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1146087885
	)
	static int field3454;
	@ObfuscatedName("js")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	static {
		field3457 = null;
		field3461 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3466 = new ArrayList(3);
		field3462 = new ArrayList();
		field3463 = new ArrayList();
		musicPlayerStatus = 0;
		field3464 = 0;
		field3465 = 0;
		field3454 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "958296006"
	)
	static void method6068(int var0) {
		class466.field4808 = var0;
		class466.field4811 = new class466[var0];
		class431.field4647 = 0;
	}
}
