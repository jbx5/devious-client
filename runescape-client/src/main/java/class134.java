import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class134 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class134 field1608;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class134 field1604;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class134 field1605;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class134 field1606;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class134 field1614;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final class134 field1615;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		longValue = -1017482725618925639L
	)
	static long field1612;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1730610183
	)
	final int field1603;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1366100427
	)
	final int field1607;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2042400925
	)
	final int field1611;

	static {
		field1608 = new class134(0, 0, (String)null, 0);
		field1604 = new class134(1, 1, (String)null, 9);
		field1605 = new class134(2, 2, (String)null, 3);
		field1606 = new class134(3, 3, (String)null, 6);
		field1614 = new class134(4, 4, (String)null, 1);
		field1615 = new class134(5, 5, (String)null, 3);
	}

	class134(int var1, int var2, String var3, int var4) {
		this.field1603 = var1;
		this.field1607 = var2;
		this.field1611 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1607;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	int method3102() {
		return this.field1611;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Liq;",
		garbageValue = "1"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldt;[BIII)V",
		garbageValue = "-106912157"
	)
	static final void method3113(class101 var0, byte[] var1, int var2, int var3) {
		Buffer var4 = new Buffer(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.readUShortSmart();
				if (var8 == 0) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.readUnsignedByte();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.field1339[0].length - 2 && var16 < var0.field1339[0][0].length - 2) {
					int var17 = var11;
					if ((var0.field1340[1][var15][var16] & 2) == 2) {
						var17 = var11 - 1;
					}

					CollisionMap var18 = null;
					if (var17 >= 0 && var0.field1332 != null) {
						var18 = var0.field1332[var17];
					}

					class130.method3051(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "10"
	)
	static int method3112(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			ObjectComposition var4 = HitSplatDefinition.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}
}
