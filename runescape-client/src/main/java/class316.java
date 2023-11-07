import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public class class316 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	public static AbstractArchive field3423;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	public static AbstractArchive field3414;
	@ObfuscatedName("ao")
	public static ArrayList field3415;
	@ObfuscatedName("ab")
	public static LinkedList field3416;
	@ObfuscatedName("au")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("aa")
	public static ArrayList field3424;
	@ObfuscatedName("ac")
	static ArrayList field3413;
	@ObfuscatedName("al")
	public static final List field3420;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -672369681
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 17907139
	)
	static int field3418;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1543808519
	)
	static int field3419;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1137860643
	)
	static int field3417;

	static {
		field3415 = null;
		field3416 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3424 = new ArrayList(3);
		field3413 = new ArrayList();
		field3420 = new ArrayList();
		musicPlayerStatus = 0;
		field3418 = 0;
		field3419 = 0;
		field3417 = 0;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1493963164"
	)
	static final void method5982() {
		Client.field693 = Client.cycleCntr;
		InterfaceParent.field1052 = true;
	}
}
