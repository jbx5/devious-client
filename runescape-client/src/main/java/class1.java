import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("p")
public class class1 implements Callable {
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	final Buffer field3;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lq;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lq;Lqq;Ln;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field3 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod19(this.field3);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-219512731"
	)
	public static int method13(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "18"
	)
	public static void method9(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitComposition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitComposition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit; // L: 61
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 63
		if (var1 < 0 || var1 > var7) { // L: 64
			var1 = 0;
		}

		var7 <<= var5; // L: 65
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 66
	} // L: 67

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbj;",
		garbageValue = "119"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-447422569"
	)
	static int method12(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 1093
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1094
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1095
			return 1; // L: 1096
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1098
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1099
			return 1; // L: 1100
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1102
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1103
			return 1; // L: 1104
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1106
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1107
			return 1; // L: 1108
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1110
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1111
			return 1; // L: 1112
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1114
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1115
			return 1; // L: 1116
		} else {
			return 2; // L: 1118
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-957000391"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3618
			Player.clientPreferences.method2412(!Player.clientPreferences.method2452()); // L: 3619
			if (Player.clientPreferences.method2452()) { // L: 3620
				class65.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3621
			} else {
				class65.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3624
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3627
			Player.clientPreferences.method2395();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3628
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3629
		}

		if (Client.staffModLevel >= 2) { // L: 3630
			if (var0.equalsIgnoreCase("errortest")) { // L: 3631
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3632
				Decimator.worldMap.showCoord = !Decimator.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3633
				Player.clientPreferences.method2394(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3634
				Player.clientPreferences.method2394(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc(); // L: 3635
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3636
				class67.method2033();
			}
		}

		PacketBufferNode var1 = class120.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, Client.packetWriter.isaacCipher); // L: 3639
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3640
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3641
		Client.packetWriter.addNode(var1); // L: 3642
	} // L: 3643

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2080956682"
	)
	static final boolean method15(int var0) {
		if (var0 < 0) { // L: 8357
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 8358
			if (var1 >= 2000) { // L: 8359
				var1 -= 2000;
			}

			return var1 == 1007; // L: 8360
		}
	}
}
