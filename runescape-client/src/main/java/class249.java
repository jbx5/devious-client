import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class249 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lfh;"
	)
	class130[] field2683;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2019764053
	)
	int field2685;

	@ObfuscatedSignature(
		descriptor = "(Lua;I)V"
	)
	class249(Buffer var1, int var2) {
		this.field2683 = new class130[var2];
		this.field2685 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2683.length; ++var3) {
			class130 var4 = new class130(this.field2685, var1, false);
			this.field2683[var3] = var4;
		}

		this.method4776();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1320681514"
	)
	void method4776() {
		class130[] var1 = this.field2683;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class130 var3 = var1[var2];
			if (var3.field1557 >= 0) {
				var3.field1558 = this.field2683[var3.field1557];
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "124"
	)
	public int method4777() {
		return this.field2683.length;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "48531051"
	)
	class130 method4778(int var1) {
		return var1 >= this.method4777() ? null : this.field2683[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfh;",
		garbageValue = "402681813"
	)
	class130[] method4797() {
		return this.field2683;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lfo;II)V",
		garbageValue = "2127689592"
	)
	void method4775(class141 var1, int var2) {
		this.method4779(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I[ZZI)V",
		garbageValue = "88109315"
	)
	void method4779(class141 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3150();
		int var6 = 0;
		class130[] var7 = this.method4797();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class130 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3152(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "13"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		WallDecoration.sortWorlds(class415.World_worlds, 0, class415.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhw;",
		garbageValue = "-1866687980"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
