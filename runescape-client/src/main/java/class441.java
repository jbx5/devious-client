import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class441 extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	public class441(SongTask var1) {
		super(var1);
		super.field4814 = "StartSongTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		Iterator var1 = class330.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3710 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6260();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3703 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3703, var2.musicTrackBoolean);
					}

					var2.field3703 = null;
					var2.field3714 = null;
					var2.musicTrackArchive = null;
					var2.field3710 = true;
				} catch (Exception var4) {
					FriendsChat.RunException_sendStackTrace((String)null, var4);
					this.method8253(var4.getMessage());
					return true;
				}
			}
		}

		super.field4816 = true;
		return true;
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "579002211"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class170.getPacketBufferNode(ClientPacket.field3365, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
