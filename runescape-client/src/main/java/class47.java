import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class47 {
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static AbstractArchive field352;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 1819265849
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class497 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	VorbisSample field354;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	RawSound field348;
	@ObfuscatedName("ao")
	ReentrantLock field349;

	@ObfuscatedSignature(
		descriptor = "(Lcm;Lbu;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field354 = var1;
		this.field348 = var2;
		this.field349 = new ReentrantLock();
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "997098077"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = SoundCache.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				WorldMapSection1.runScriptEvent(var6);
			}

			boolean var11 = true;
			if (var5.contentType > 0) {
				var11 = Bounds.method8135(var5);
			}

			if (var11) {
				int var8 = NpcOverrides.getWidgetFlags(var5);
				int var9 = var0 - 1;
				boolean var7 = (var8 >> var9 + 1 & 1) != 0;
				if (var7) {
					PacketBufferNode var10;
					if (var0 == 1) {
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 2) {
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 3) {
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 4) {
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 5) {
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 6) {
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 7) {
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 8) {
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 9) {
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 10) {
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

				}
			}
		}
	}
}
