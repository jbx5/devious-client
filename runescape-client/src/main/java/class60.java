import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class60 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1520784715
	)
	static int field410;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("jd")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("ab")
	byte[] field415;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1348167997
	)
	int field409;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -108224639
	)
	int field413;

	class60() {
		this.field415 = null;
		this.field409 = 0;
		this.field413 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "31565"
	)
	int method1146(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field413; var1 -= var4) {
			var4 = 8 - this.field413;
			int var5 = (1 << var4) - 1;
			var2 += (this.field415[this.field409] >> this.field413 & var5) << var3;
			this.field413 = 0;
			++this.field409;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field415[this.field409] >> this.field413 & var4) << var3;
			this.field413 += var1;
		}

		return var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "517243491"
	)
	int method1138() {
		int var1 = this.field415[this.field409] >> this.field413 & 1;
		++this.field413;
		this.field409 += this.field413 >> 3;
		this.field413 &= 7;
		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1822811820"
	)
	void method1139(byte[] var1, int var2) {
		this.field415 = var1;
		this.field409 = var2;
		this.field413 = 0;
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "648783722"
	)
	static final void method1145() {
		PacketBufferNode var0 = class218.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field857 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class59.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class416.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field857 = false;
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1732088746"
	)
	static String method1147(String var0) {
		PlayerType[] var1 = class345.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class152.method3376(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
