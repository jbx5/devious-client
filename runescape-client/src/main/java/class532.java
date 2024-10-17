import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uv")
public class class532 implements class531 {
	@ObfuscatedName("ap")
	Map field5332;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	final class565 field5333;

	@ObfuscatedSignature(
		descriptor = "(Lvj;)V"
	)
	public class532(class565 var1) {
		this.field5333 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-996391250"
	)
	public int vmethod9806(int var1) {
		if (this.field5332 != null) {
			class566 var2 = (class566)this.field5332.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5529;
			}
		}

		return (Integer)this.field5333.vmethod10432(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1570680035"
	)
	public void vmethod9814(int var1, Object var2) {
		if (this.field5332 == null) {
			this.field5332 = new HashMap();
			this.field5332.put(var1, new class566(var1, var2));
		} else {
			class566 var3 = (class566)this.field5332.get(var1);
			if (var3 == null) {
				this.field5332.put(var1, new class566(var1, var2));
			} else {
				var3.field5529 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5332 == null ? Collections.emptyList().iterator() : this.field5332.values().iterator();
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Ldn;Lvm;B)V",
		garbageValue = "2"
	)
	static void method9809(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedShort();
		WorldEntity var3 = var0.worldEntities[var2];
		WorldView var4 = var3.worldView;
		var4.baseX = var1.readUnsignedShort();
		var4.baseY = var1.readUnsignedShort();
		int var5 = var4.sizeX / 8;
		int var6 = var4.sizeY / 8;
		int var7 = var1.readUnsignedShort();
		var1.importIndex();

		int var8;
		int var9;
		int var10;
		int var11;
		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = var1.readBits(1);
					if (var11 == 1) {
						Client.field576[var8][var9][var10] = var1.readBits(26);
					} else {
						Client.field576[var8][var9][var10] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		MusicPatchPcmStream.field3717 = new int[var7][4];

		for (var8 = 0; var8 < var7; ++var8) {
			for (var9 = 0; var9 < 4; ++var9) {
				MusicPatchPcmStream.field3717[var8][var9] = var1.readInt();
			}
		}

		NPC.field1374 = new int[var7];
		VarbitComposition.field2125 = new int[var7];
		FloatProjection.field2733 = new int[var7];
		MusicPatchPcmStream.field3716 = new byte[var7][];
		class330.field3608 = new byte[var7][];
		var7 = 0;

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = Client.field576[var8][var9][var10];
					if (var11 != -1) {
						int var12 = var11 >> 14 & 1023;
						int var13 = var11 >> 3 & 2047;
						int var14 = (var12 / 8 << 8) + var13 / 8;

						int var15;
						for (var15 = 0; var15 < var7; ++var15) {
							if (NPC.field1374[var15] == var14) {
								var14 = -1;
								break;
							}
						}

						if (var14 != -1) {
							NPC.field1374[var7] = var14;
							var15 = var14 >> 8 & 255;
							int var16 = var14 & 255;
							VarbitComposition.field2125[var7] = EnumComposition.archive9.getGroupId("m" + var15 + "_" + var16);
							FloatProjection.field2733[var7] = EnumComposition.archive9.getGroupId("l" + var15 + "_" + var16);
							++var7;
						}
					}
				}
			}
		}

		BuddyRankComparator.updateGameState(25);
		Client.field618 = true;
		VarbitComposition.field2124 = var4;
		class88.method2558(var4);
	}
}
