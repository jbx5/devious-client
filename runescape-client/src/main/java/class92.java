import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class92 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1169;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1159;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1168;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1161;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1162;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1166;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1164;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1165;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1158;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1173;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1174;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1171;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1170;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1163;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1172;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class92 field1160;

	static {
		field1169 = new class92();
		field1159 = new class92();
		field1168 = new class92();
		field1161 = new class92();
		field1162 = new class92();
		field1166 = new class92();
		field1164 = new class92();
		field1165 = new class92();
		field1158 = new class92();
		field1173 = new class92();
		field1174 = new class92();
		field1171 = new class92();
		field1170 = new class92();
		field1163 = new class92();
		field1172 = new class92();
		field1160 = new class92();
	}

	class92() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lmi;",
		garbageValue = "412092455"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (PacketBufferNode.Widget_interfaceComponents[var1] == null || PacketBufferNode.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = ModeWhere.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return PacketBufferNode.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ldf;ZB)V",
		garbageValue = "1"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = FontName.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = class18.getTileHeight(var0.x, var0.y, HealthBar.Client_plane);
					var0.playerCycle = Client.cycle;
					class130.scene.addNullableObject(HealthBar.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = class18.getTileHeight(var0.x, var0.y, HealthBar.Client_plane);
					var0.playerCycle = Client.cycle;
					class130.scene.drawEntity(HealthBar.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lds;ZI)V",
		garbageValue = "-1838716449"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			Skeleton.method4523(var2);
		}

		class339.method6595(var2);
		Widget var4 = getWidget(var3);
		if (var4 != null) {
			class218.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) {
			class385.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
