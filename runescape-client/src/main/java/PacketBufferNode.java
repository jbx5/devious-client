import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lmn;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 33397835
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1623400787
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1772833165
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1753424576"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "897473801"
	)
	public static String method6049(CharSequence[] var0, int var1, int var2) {
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-179593591"
	)
	static void method6050(boolean var0) {
		byte var1 = 0;
		boolean var2 = class30.clientPreferences.method2539() >= Client.field688;
		if (!var2) {
			var1 = 12;
		} else if (class193.client.containsAccessAndRefreshToken() || class193.client.method1216() || class193.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		JagexCache.method4224(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class36.otpMedium = 0;
			MenuAction.otp = "";
		}

		LoginPacket.method3203();
		Message.method1182();
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)Liw;",
		garbageValue = "-865577578"
	)
	public static class228 method6051() {
		return Client.field792;
	}
}
