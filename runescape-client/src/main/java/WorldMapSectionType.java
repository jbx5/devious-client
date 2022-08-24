import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hi")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lhi;")
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, ((byte) (0))),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lhi;")
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, ((byte) (1))),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lhi;")
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, ((byte) (2))),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lhi;")
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(3, ((byte) (3)));
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 189258081)
	@Export("type")
	final int type;

	@ObfuscatedName("q")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)[Lhi;", garbageValue = "387604014")
	static WorldMapSectionType[] method4874() {
		return new WorldMapSectionType[]{ WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE0 };
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "-16711936")
	static boolean method4879(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}
}