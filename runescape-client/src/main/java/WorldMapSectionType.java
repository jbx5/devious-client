import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1512232833
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ar")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljx;",
		garbageValue = "-1156989021"
	)
	static WorldMapSectionType[] method4985() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE3};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)V",
		garbageValue = "-1700644773"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		ReflectionCheck.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1883641263"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
