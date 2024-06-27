import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2665;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = 561283007
	)
	static int field2666;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 754386531
	)
	@Export("type")
	final int type;
	@ObfuscatedName("an")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lut;",
		garbageValue = "-408274121"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5305.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method9460(new Buffer(var2));
			}

			var1.method9459();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lha;",
		garbageValue = "1966297166"
	)
	public static HitSplatDefinition method4961(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	static final void method4962() {
		if (GrandExchangeEvents.field4576) {
			for (int var0 = 0; var0 < class511.topLevelWorldView.playerUpdateManager.playerCount; ++var0) {
				Player var1 = class511.topLevelWorldView.players[class511.topLevelWorldView.playerUpdateManager.playerIndices[var0]];
				var1.method2412();
			}

			GrandExchangeEvents.field4576 = false;
		}

	}
}
