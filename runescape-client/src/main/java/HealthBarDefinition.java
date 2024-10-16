import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1616135899
	)
	public int field1951;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -492200047
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1991769501
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1681903335
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1183839813
	)
	public int field1960;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1739976797
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1538610839
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 757493497
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 964750717
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -664495705
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1960 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "1525604453"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;IB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "-1644593904"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class496.SpriteBuffer_getSprite(class53.field341, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lvv;",
		garbageValue = "68"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class496.SpriteBuffer_getSprite(class53.field341, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-19"
	)
	static void method3942(int var0, int var1) {
		if (TaskHandler.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MusicSong(PlayerComposition.field3818, var0, 0, TaskHandler.clientPreferences.getMusicVolume(), false));
			ParamComposition.method4154(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(ILso;Ldn;I)I",
		garbageValue = "-1659790827"
	)
	static int method3951(int var0, WorldEntity var1, WorldView var2) {
		int var3 = -1;
		if (var0 == class229.field2458) {
			var3 = var2.plane;
		} else if (class229.field2458 == -1) {
			var3 = var1.field5031;
		} else {
			WorldEntity var4 = class198.topLevelWorldView.worldEntities[class229.field2458];
			WorldView var5 = var4.worldView;
			if (var4.field5031 == var5.plane) {
				if (var0 == -1) {
					var3 = class198.topLevelWorldView.worldEntities[class229.field2458].getPlane();
				} else {
					var3 = var1.field5031;
				}
			}
		}

		return var3;
	}
}
