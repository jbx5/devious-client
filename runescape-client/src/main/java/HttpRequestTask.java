import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("ay")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("sv")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	final HttpRequest field76;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Law;Laq;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field76 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field76.connect()) {
				ClanChannel.method3595(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field76.getResponse();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1267045958"
	)
	static void method269(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfb;I)V",
		garbageValue = "1082808830"
	)
	static void method268(float var0, float var1, float var2, float var3, class134 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1568 = var7 - var6 - var8;
		var4.field1567 = var8 + var8 + var8;
		var4.field1557 = var5 + var5 + var5;
		var4.field1571 = var0;
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-47"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = FloorUnderlayDefinition.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field1068 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				class421.runScriptEvent(var8);
			}

			boolean var13 = true;
			if (var7.contentType > 0) {
				var13 = NPCComposition.method4964(var7);
			}

			if (var13) {
				int var10 = SpriteMask.getWidgetFlags(var7);
				int var11 = var6 - 1;
				boolean var9 = (var10 >> var11 + 1 & 1) != 0;
				if (var9) {
					PacketBufferNode var12;
					if (var0 == 1) {
						var12 = class218.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 2) {
						var12 = class218.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 3) {
						var12 = class218.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 4) {
						var12 = class218.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 5) {
						var12 = class218.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 6) {
						var12 = class218.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 7) {
						var12 = class218.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 8) {
						var12 = class218.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 9) {
						var12 = class218.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 10) {
						var12 = class218.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var5 != 0) {
						var12 = class218.getPacketBufferNode(ClientPacket.field3350, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						var12.packetBuffer.writeByte(var6);
						var12.packetBuffer.writeByte(var5 - 1);
						Client.packetWriter.addNode(var12);
					}

				}
			}
		}
	}
}
