import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("ak")
	String field4812;
	@ObfuscatedName("ap")
	String field4814;
	@ObfuscatedName("an")
	boolean field4813;
	@ObfuscatedName("aj")
	boolean field4816;

	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public abstract boolean vmethod8276();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "131549987"
	)
	public boolean method8249() {
		return this.field4813;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1551144894"
	)
	public boolean method8250() {
		return this.field4816;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1477526739"
	)
	public String method8251() {
		return "Error in task: " + this.field4814 + ", Error message: " + this.field4812;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lro;",
		garbageValue = "-1949503996"
	)
	public SongTask method8254() {
		return this.songTask;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1766646668"
	)
	void method8253(String var1) {
		this.field4813 = true;
		this.field4812 = var1;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-7"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ModeWhere.widgetDefinition.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				Projectile.runScriptEvent(var6);
			}

			boolean var8 = true;
			if (var5.contentType > 0) {
				var8 = class155.method3331(var5);
			}

			if (var8) {
				if (Varps.method6452(ClanChannel.getWidgetFlags(var5), var0 - 1)) {
					PacketBufferNode var7;
					if (var0 == 1) {
						var7 = class170.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 2) {
						var7 = class170.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 3) {
						var7 = class170.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 4) {
						var7 = class170.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 5) {
						var7 = class170.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 6) {
						var7 = class170.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 7) {
						var7 = class170.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 8) {
						var7 = class170.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 9) {
						var7 = class170.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 10) {
						var7 = class170.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

				}
			}
		}
	}
}
