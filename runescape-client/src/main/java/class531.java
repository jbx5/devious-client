import java.io.IOException;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
class class531 implements Iterator {
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1331799763
	)
	int field5318;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	final class532 this$0;

	@ObfuscatedSignature(
		descriptor = "(Luf;)V"
	)
	class531(class532 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5318 < this.this$0.method9149();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		int var1 = ++this.field5318 - 1;
		class491 var2 = (class491)this.this$0.field5320.get((long)var1);
		return var2 != null ? var2 : this.this$0.method9707(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ldu;",
		garbageValue = "1091270479"
	)
	static ClientPreferences method9700() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = class378.getPreferencesFile("", class332.field3603.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2125112678"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class141.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAdd(var1);
		var2.packetBuffer.writeIntIME(var0);
		Client.packetWriter.addNode(var2);
	}
}
