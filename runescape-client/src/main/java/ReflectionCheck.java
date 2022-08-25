import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
@ObfuscatedName("ae")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("hx")
	@ObfuscatedSignature(descriptor = "Lmg;")
	@Export("fontPlain12")
	static Font fontPlain12;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -899581373)
	@Export("id")
	int id;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1174030445)
	@Export("size")
	int size;

	@ObfuscatedName("w")
	@Export("operations")
	int[] operations;

	@ObfuscatedName("v")
	@Export("creationErrors")
	int[] creationErrors;

	@ObfuscatedName("c")
	@Export("fields")
	Field[] fields;

	@ObfuscatedName("q")
	@Export("intReplaceValues")
	int[] intReplaceValues;

	@ObfuscatedName("i")
	@Export("methods")
	Method[] methods;

	@ObfuscatedName("k")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-42")
	static void method580() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-958842860")
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			ClanMate.clientPreferences.method2241(!ClanMate.clientPreferences.method2209());
			if (ClanMate.clientPreferences.method2209()) {
				VarcInt.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				VarcInt.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}
		if (var0.equalsIgnoreCase("displayfps")) {
			ClanMate.clientPreferences.method2255();
		}
		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}
		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}
		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (var0.equalsIgnoreCase("showcoord")) {
				ClientPacket.worldMap.showCoord = !ClientPacket.worldMap.showCoord;
			}
			if (var0.equalsIgnoreCase("fpson")) {
				ClanMate.clientPreferences.method2276(true);
			}
			if (var0.equalsIgnoreCase("fpsoff")) {
				ClanMate.clientPreferences.method2276(false);
			}
			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}
			if (var0.equalsIgnoreCase("clientdrop")) {
				Clock.method3264();
			}
		}
		PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1511176614")
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = class128.getWidgetChild(class282.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				SceneTilePaint.runScriptEvent(var1);
			}
			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			class125.invalidateWidget(var0);
		}
	}
}