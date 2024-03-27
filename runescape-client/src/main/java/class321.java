import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class321 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	static AbstractArchive field3493;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	static AbstractArchive field3494;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	static AbstractArchive field3497;
	@ObfuscatedName("at")
	public static ArrayList field3491;
	@ObfuscatedName("an")
	public static LinkedList field3500;
	@ObfuscatedName("ao")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("ab")
	public static ArrayList field3496;
	@ObfuscatedName("aw")
	public static ArrayList field3498;
	@ObfuscatedName("ad")
	public static final List field3499;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1396574253
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 657403247
	)
	static int field3501;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -577133529
	)
	static int field3502;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1384820455
	)
	static int field3503;

	static {
		field3491 = null;
		field3500 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3496 = new ArrayList(3);
		field3498 = new ArrayList();
		field3499 = new ArrayList();
		musicPlayerStatus = 0;
		field3501 = 0;
		field3502 = 0;
		field3503 = 0;
	}
}
