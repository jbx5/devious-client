import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public enum class383 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4461(0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4462(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4466(2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4460(3);

	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1172237987
	)
	public final int field4464;

	class383(int var3) {
		this.field4464 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4464;
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Ldd;III)V",
		garbageValue = "-1493002373"
	)
	@Export("updateItemPile3")
	static final void updateItemPile3(WorldView var0, int var1, int var2) {
		Messages.updateItemPile2(var0, var0.plane, var1, var2);
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "([Lny;IIIZI)V",
		garbageValue = "1810122310"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				Projectile.alignWidgetSize(var6, var2, var3, var4);
				InvDefinition.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					AsyncHttpResponse.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-353475483"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class141.getPacketBufferNode(ClientPacket.field3308, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class536.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
