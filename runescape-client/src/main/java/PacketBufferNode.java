import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("ji")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Lji;")
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 491378593)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount = 0;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ljn;")
	@Export("clientPacket")
	ClientPacket clientPacket;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 931538281)
	@Export("clientPacketLength")
	int clientPacketLength;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lqy;")
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -534137851)
	@Export("index")
	public int index;

	PacketBufferNode() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-152464347")
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode.PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(ILbc;ZS)I", garbageValue = "256")
	static int method5196(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class258.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var5 = class258.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				TaskHandler.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				var5 = class258.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class258.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class258.ItemDefinition_get(var3).isStackable == 1) ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					var7 = class258.ItemDefinition_get(var3);
					if (var7.noteTemplate == -1 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					var7 = class258.ItemDefinition_get(var3);
					if (var7.noteTemplate >= 0 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class258.ItemDefinition_get(var3).isMembersOnly) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					var7 = class258.ItemDefinition_get(var3);
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					var7 = class258.ItemDefinition_get(var3);
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var6 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					class193.findItemDefinitions(var6, var4 == 1);
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class127.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						WorldMapSection2.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = class258.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == -1) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4 + 1;
						}
						return 1;
					} else {
						return 2;
					}
				} else {
					if (WorldMapData_1.foundItemIds != null && WorldMapSection2.foundItemIndex < class127.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapData_1.foundItemIds[++WorldMapSection2.foundItemIndex - 1] & '￿';
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
					}
					return 1;
				}
			}
		}
	}
}