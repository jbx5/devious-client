import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ap")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("aw")
	static final void method323(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lfv;FB)F",
		garbageValue = "105"
	)
	static float method331(class137 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var0.field1598 == var1) {
				var2 = 0.0F;
			} else if (var0.field1611 == var1) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1598) / (var0.field1611 - var0.field1598);
			}

			float var3;
			if (var0.field1597) {
				var3 = var2;
			} else {
				float[] var4 = new float[]{var0.field1600 - var2, var0.field1601, var0.field1592, var0.field1603};
				float[] var5 = new float[5];
				int var6 = IntProjection.method4899(var4, 3, 0.0F, true, 1.0F, true, var5);
				if (var6 == 1) {
					var3 = var5[0];
				} else {
					var3 = 0.0F;
				}
			}

			return (var3 * (var0.field1606 + var0.field1594 * var3) + var0.field1607) * var3 + var0.field1604;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-851094662"
	)
	public static int method330(float var0) {
		return (int)(2048.0D * ((double)var0 / 6.283185307179586D)) & 2047;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1960178698"
	)
	static final void method327(String var0) {
		PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(World.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "574635590"
	)
	static int method328(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "550854616"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.field3409, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(World.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
