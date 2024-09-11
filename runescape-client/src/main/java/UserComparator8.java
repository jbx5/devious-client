import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("ja")
	static byte[][] field1516;
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsq;Lsq;I)I",
		garbageValue = "1738260536"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1904455651"
	)
	static final void method3186(String var0, int var1) {
		PacketBufferNode var2 = class141.getPacketBufferNode(ClientPacket.field3371, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class536.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByteAdd(var1);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILdi;I)V",
		garbageValue = "-1934721450"
	)
	static void method3185(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = class273.getObjectDefinition(var6);
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) {
			var15 = var14.sizeX;
			var16 = var14.sizeY;
		} else {
			var15 = var14.sizeY;
			var16 = var14.sizeX;
		}

		int var17 = (var15 >> 1) + var1;
		int var18 = (var15 + 1 >> 1) + var1;
		int var19 = (var16 >> 1) + var2;
		int var20 = var2 + (var16 + 1 >> 1);
		int[][] var21 = class162.worldView.tileHeights[var0];
		int var22 = var21[var17][var20] + var21[var18][var19] + var21[var17][var19] + var21[var18][var20] >> 2;
		int var23 = (var1 << 7) + (var15 << 6);
		int var24 = (var2 << 7) + (var16 << 6);
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24);
		if (var25 != null) {
			class165.method3680(class162.worldView, var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1);
			var13.animationCycleStart = var7 + Client.cycle;
			var13.animationCycleEnd = var8 + Client.cycle;
			var13.model0 = var25;
			var13.field1152 = var1 * 128 + var15 * 64;
			var13.field1150 = var2 * 128 + var16 * 64;
			var13.tileHeight2 = var22;
			int var26;
			if (var9 > var11) {
				var26 = var9;
				var9 = var11;
				var11 = var26;
			}

			if (var10 > var12) {
				var26 = var10;
				var10 = var12;
				var12 = var26;
			}

			var13.minX = var9 + var1;
			var13.maxX = var11 + var1;
			var13.minY = var10 + var2;
			var13.maxY = var2 + var12;
		}

	}
}
