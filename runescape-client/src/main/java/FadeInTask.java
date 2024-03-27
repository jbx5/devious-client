import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	MusicSong field4648;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -773370011
	)
	int field4647;

	@ObfuscatedSignature(
		descriptor = "(Lqc;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4648 = null;
		this.field4647 = 0;
		super.field4651 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class321.field3500.size()) {
				this.field4648 = (MusicSong)class321.field3500.get(var2);
			} else if (!var3 && var2 < class321.musicSongs.size()) {
				this.field4648 = (MusicSong)class321.musicSongs.get(var2);
			}

			this.field4647 = var4;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		if (this.field4648 != null && this.field4648.midiPcmStream != null) {
			this.field4648.field3604 = true;

			try {
				if (this.field4648.field3608 < (float)this.field4648.musicTrackVolume && this.field4648.midiPcmStream.isReady()) {
					float var1 = this.field4647 == 0 ? (float)this.field4647 : (float)this.field4648.musicTrackVolume / (float)this.field4647;
					MusicSong var10000 = this.field4648;
					var10000.field3608 += 0.0F == var1 ? (float)this.field4648.musicTrackVolume : var1;
					if (this.field4648.field3608 > (float)this.field4648.musicTrackVolume) {
						this.field4648.field3608 = (float)this.field4648.musicTrackVolume;
					}

					this.field4648.midiPcmStream.setPcmStreamVolume((int)this.field4648.field3608);
					return false;
				}
			} catch (Exception var3) {
				this.method7844(var3.getMessage());
				return true;
			}

			this.field4648.field3604 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	public static void method7823() {
		class195.field1864.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lvb;B)Lmh;",
		garbageValue = "-76"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = WorldMapSection0.method5639();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}
}
