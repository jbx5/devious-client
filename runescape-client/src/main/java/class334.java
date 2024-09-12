import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class334 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static AbstractArchive field3618;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static AbstractArchive field3615;
	@ObfuscatedName("am")
	public static ArrayList field3616;
	@ObfuscatedName("ax")
	public static LinkedList field3621;
	@ObfuscatedName("aq")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("af")
	static ArrayList field3619;
	@ObfuscatedName("at")
	public static ArrayList field3620;
	@ObfuscatedName("au")
	public static final List field3623;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1049602065
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -161512225
	)
	static int field3614;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1026592873
	)
	static int field3624;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 94191071
	)
	static int field3625;

	static {
		field3616 = null;
		field3621 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3619 = new ArrayList(3);
		field3620 = new ArrayList();
		field3623 = new ArrayList();
		musicPlayerStatus = 0;
		field3614 = 0;
		field3624 = 0;
		field3625 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lho;",
		garbageValue = "45"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
