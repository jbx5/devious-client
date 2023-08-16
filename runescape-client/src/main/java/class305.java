import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
public class class305 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static AbstractArchive field3399;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static AbstractArchive field3400;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static AbstractArchive field3403;
	@ObfuscatedName("at")
	public static ArrayList field3402;
	@ObfuscatedName("ac")
	public static LinkedList field3411;
	@ObfuscatedName("ai")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("az")
	public static ArrayList field3405;
	@ObfuscatedName("ap")
	public static ArrayList field3406;
	@ObfuscatedName("aa")
	public static final List field3407;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1224914915
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1284543169
	)
	public static int field3409;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 35504833
	)
	public static int field3410;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2000585249
	)
	public static int field3401;

	static {
		field3402 = null;
		field3411 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3405 = new ArrayList(3);
		field3406 = new ArrayList();
		field3407 = new ArrayList();
		musicPlayerStatus = 0;
		field3409 = 0;
		field3410 = 0;
		field3401 = 0;
	}
}
