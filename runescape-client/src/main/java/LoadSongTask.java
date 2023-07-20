import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
@Implements("LoadSongTask")
public class LoadSongTask extends SongTask
{
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
	public LoadSongTask(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4534 = var2;
		this.field4535 = var3;
		this.field4536 = var4;
		super.songTaskName = "LoadSongTask";
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		int var2 = 0;
		Iterator var3 = class306.musicSongs.iterator();

		while (true) {
			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				if (var4 != null && var4.midiPcmStream.field3439 > 1 && var4.midiPcmStream.method5926()) {
					this.method7653("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var4 != null && !var4.field3513) {
					try {
						if (var4.musicTrackArchive != null && var4.musicTrackGroupId != -1 && var4.musicTrackFileId != -1) {
							if (var4.field3518 == null) {
								var4.field3518 = MusicTrack.readTrack(var4.musicTrackArchive, var4.musicTrackGroupId, var4.musicTrackFileId);
								if (var4.field3518 == null) {
									continue;
								}
							}

							if (var4.field3517 == null) {
								var4.field3517 = new SoundCache(this.field4536, this.field4535);
							}

							if (var4.midiPcmStream.method5817(var4.field3518, this.field4534, var4.field3517)) {
								++var2;
								var4.field3513 = true;
								var4.midiPcmStream.method5840();
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

			if (var2 == class306.musicSongs.size()) {
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
		PacketBufferNode var0 = class503.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(Huffman.getWindowedMode());
		var0.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth);
		var0.packetBuffer.writeShort(WorldMapArchiveLoader.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}
