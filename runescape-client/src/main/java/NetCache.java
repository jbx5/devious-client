import java.util.zip.CRC32;





import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lny;")

	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	875893217)

	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("i")
	@ObfuscatedGetter(longValue = 
	-7945689886712382461L)

	public static long field3982;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	1056584685)

	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-275565499)

	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lla;")

	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-644606303)

	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-183804397)

	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Lpi;")

	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-47257767)

	public static int field3995;
	@ObfuscatedName("g")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"[Llx;")

	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("y")
	public static byte field3998;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-1326084145)

	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	-1735632963)

	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;
	static 
	{
		NetCache_loadTime = 0;
		NetCache_pendingPriorityWrites = new NodeHashTable(4096);
		NetCache_pendingPriorityWritesCount = 0;
		NetCache_pendingPriorityResponses = new NodeHashTable(32);
		NetCache_pendingPriorityResponsesCount = 0;
		NetCache_pendingWritesQueue = new DualNodeDeque();
		NetCache_pendingWrites = new NodeHashTable(4096);
		NetCache_pendingWritesCount = 0;
		NetCache_pendingResponses = new NodeHashTable(4096);
		NetCache_pendingResponsesCount = 0;
		NetCache_responseHeaderBuffer = new Buffer(8);
		field3995 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3998 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"-1081311758")

	static int method5965(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = class19.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = class19.ItemDefinition_get(var3);
				if (((var4 >= 1) && (var4 <= 5)) && (var5.groundActions[var4 - 1] != null)) {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = class19.ItemDefinition_get(var3);
				if (((var4 >= 1) && (var4 <= 5)) && (var5.inventoryActions[var4 - 1] != null)) {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class19.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class19.ItemDefinition_get(var3).isStackable == 1) ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = class19.ItemDefinition_get(var3);
					if ((var7.noteTemplate == (-1)) && (var7.note >= 0)) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = class19.ItemDefinition_get(var3);
					if ((var7.noteTemplate >= 0) && (var7.note >= 0)) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class19.ItemDefinition_get(var3).isMembersOnly) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = class19.ItemDefinition_get(var3);
					if ((var7.placeholderTemplate == (-1)) && (var7.placeholder >= 0)) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = class19.ItemDefinition_get(var3);
					if ((var7.placeholderTemplate >= 0) && (var7.placeholder >= 0)) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var6 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					class12.findItemDefinitions(var6, var4 == 1);
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Script.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						GameEngine.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = class19.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == (-1)) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4 + 1;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					if ((PendingSpawn.foundItemIds != null) && (GameEngine.foundItemIndex < Script.foundItemIdCount)) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = PendingSpawn.foundItemIds[(++GameEngine.foundItemIndex) - 1] & '￿';
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}