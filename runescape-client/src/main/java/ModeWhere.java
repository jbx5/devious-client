import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4407("", 0, new class371[]{class371.field4371, class371.field4369}),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4399("", 1, new class371[]{class371.field4370, class371.field4371, class371.field4369}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4395("", 2, new class371[]{class371.field4370, class371.field4368, class371.field4371}),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4394("", 3, new class371[]{class371.field4370}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4391("", 4),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4396("", 5, new class371[]{class371.field4370, class371.field4371}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4400("", 6, new class371[]{class371.field4371}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4398("", 8, new class371[]{class371.field4370, class371.field4371}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4393("", 9, new class371[]{class371.field4370, class371.field4368}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4397("", 10, new class371[]{class371.field4370}),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4401("", 11, new class371[]{class371.field4370}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4402("", 12, new class371[]{class371.field4370, class371.field4371}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4403("", 13, new class371[]{class371.field4370});

	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = -251048117
	)
	static int field4410;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 1858082179
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = -2030563191
	)
	static int field4408;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -18045167
	)
	@Export("id")
	final int id;
	@ObfuscatedName("aa")
	final Set field4392;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Loe;)V"
	)
	ModeWhere(String var3, int var4, class371[] var5) {
		this.field4392 = new HashSet();
		this.id = var4;
		class371[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class371 var8 = var6[var7];
			this.field4392.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4392 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1069349497"
	)
	static boolean method7013() {
		return (Client.drawPlayerNames & 2) != 0;
	}
}
