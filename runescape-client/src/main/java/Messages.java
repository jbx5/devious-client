import net.runelite.mapping.*;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ch")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("v")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lmq;")

	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-202962725)

	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(intValue = 
	-78187277)

	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	static 
	{
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"1155417987")

	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ItemContainer.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeIntIME(var0);
		var2.packetBuffer.writeShortLE(var1);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(descriptor = 
	"(IIIILql;Lkw;I)V", garbageValue = 
	"1883987067")

	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = (var3 * var3) + (var2 * var2);
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = ((var3 * var8) + (var9 * var2)) >> 16;
				int var11 = ((var3 * var9) - (var8 * var2)) >> 16;
				if (var7 > 2500) {
					var4.method8178((var10 + (var5.width / 2)) - (var4.width / 2), ((var5.height / 2) - var11) - (var4.height / 2), var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(((var0 + var10) + (var5.width / 2)) - (var4.width / 2), (((var5.height / 2) + var1) - var11) - (var4.height / 2));
				}

			}
		}
	}
}