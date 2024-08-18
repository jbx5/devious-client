import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static StudioGame field228;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -534347087
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 15477595
	)
	@Export("size")
	int size;
	@ObfuscatedName("an")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("au")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ax")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ao")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("am")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ac")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmv;",
		garbageValue = "22"
	)
	static class325[] method678() {
		return new class325[]{class325.field3520, class325.field3526, class325.field3523, class325.field3530, class325.field3519, class325.field3524, class325.field3522, class325.field3521};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
		garbageValue = "1"
	)
	public static String method677(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1314672055"
	)
	static final void method675(String var0) {
		class269.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1485695956"
	)
	static final void method672(boolean var0) {
		ClanChannelMember.method3363();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = class218.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "129448635"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class218.getPacketBufferNode(ClientPacket.field3335, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1798413836"
	)
	static void method676() {
		if (Client.oculusOrbState == 1) {
			Client.field632 = true;
		}

	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-357092910"
	)
	static void method674(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
