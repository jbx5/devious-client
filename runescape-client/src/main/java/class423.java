import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class423 extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	public class423(SongTask var1) {
		super(var1);
		super.field4651 = "StartSongTask";
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		Iterator var1 = class321.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3617 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6093();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3616 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3616, var2.musicTrackBoolean);
					}

					var2.field3616 = null;
					var2.field3615 = null;
					var2.musicTrackArchive = null;
					var2.field3617 = true;
				} catch (Exception var4) {
					class180.RunException_sendStackTrace((String)null, var4);
					this.method7844(var4.getMessage());
					return true;
				}
			}
		}

		super.field4654 = true;
		return true;
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-40"
	)
	static final void method7813(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3394()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = FadeInTask.getPacketBufferNode(ClientPacket.field3206, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + SequenceDefinition.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
