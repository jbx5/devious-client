import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public class class409 extends class407 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	AbstractArchive field4534;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	AbstractArchive field4535;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	AbstractArchive field4536;

	@ObfuscatedSignature(
		descriptor = "(Lpp;Lnd;Lnd;Lnd;)V"
	)
	public class409(class407 var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4534 = var2;
		this.field4535 = var3;
		this.field4536 = var4;
		super.field4528 = "LoadSongTask";
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		int var2 = 0;
		Iterator var3 = class306.field3394.iterator();

		while (true) {
			while (var3.hasNext()) {
				class318 var4 = (class318)var3.next();
				if (var4 != null && var4.field3516.field3439 > 1 && var4.field3516.method5926()) {
					this.method7653("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var4 != null && !var4.field3513) {
					try {
						if (var4.field3514 != null && var4.field3507 != -1 && var4.field3509 != -1) {
							if (var4.field3518 == null) {
								var4.field3518 = MusicTrack.readTrack(var4.field3514, var4.field3507, var4.field3509);
								if (var4.field3518 == null) {
									continue;
								}
							}

							if (var4.field3517 == null) {
								var4.field3517 = new SoundCache(this.field4536, this.field4535);
							}

							if (var4.field3516.method5817(var4.field3518, this.field4534, var4.field3517)) {
								++var2;
								var4.field3513 = true;
								var4.field3516.method5840();
							}
						} else {
							++var2;
						}
					} catch (Exception var6) {
						var6.printStackTrace();
						this.method7653(var6.getMessage());
						return true;
					}
				} else {
					++var2;
				}
			}

			if (var2 == class306.field3394.size()) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	static void method7680() {
		PacketBufferNode var0 = class503.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(Huffman.getWindowedMode());
		var0.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth);
		var0.packetBuffer.writeShort(WorldMapArchiveLoader.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}
