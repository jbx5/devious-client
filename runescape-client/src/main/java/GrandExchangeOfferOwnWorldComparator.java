import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cx")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = 1576804595
	)
	static int field468;
	@ObfuscatedName("ap")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpv;I)I",
		garbageValue = "-422732838"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-537716112"
	)
	static int method1277(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
		}

		class110.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = SpriteMask.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
				var3.method7330(SpriteMask.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				if (var3.field3936 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3936.method6942(var4);
					return 1;
				}
			} else if (var0 == 1209) {
				class96.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				if (var3.field3936 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3936.method6926(var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				if (var3.field3936 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3936.method6939(SpriteMask.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			class96.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = Bounds.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3923 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3923;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-1429368523"
	)
	public static float method1279(float var0, float var1, float var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-1689308347"
	)
	static int method1278(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
			Script.method2454(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1640955788"
	)
	static final void method1272(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3786()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = class113.getPacketBufferNode(ClientPacket.field3317, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + World.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
