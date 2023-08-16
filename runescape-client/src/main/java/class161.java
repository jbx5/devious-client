import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gw")
public class class161 extends class143 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2110571145
	)
	int field1790;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -713647017
	)
	int field1789;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class161(class146 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1790 = var1.readInt();
		this.field1789 = var1.readInt();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3177(this.field1790, this.field1789);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-577871422"
	)
	static final void method3289(String var0, int var1) {
		PacketBufferNode var2 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3181, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByte(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1877408335"
	)
	static int method3288(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class218.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class270.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class449.clientPreferences.method2470();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--SoundCache.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class449.clientPreferences.method2469(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "229621192"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < HealthBar.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = InvDefinition.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class28.foundItemIdCount = -1;
					class156.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class156.foundItemIds = var2;
		class372.foundItemIndex = 0;
		class28.foundItemIdCount = var3;
		String[] var8 = new String[class28.foundItemIdCount];

		for (int var5 = 0; var5 < class28.foundItemIdCount; ++var5) {
			var8[var5] = InvDefinition.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class156.foundItemIds;
		FriendSystem.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
