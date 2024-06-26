import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
final class class108 implements class348 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnx;)V"
	)
	class108(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2099855571"
	)
	public void vmethod6510() {
		if (this.val$cc != null && this.val$cc.method6892().field3763 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2378(this.val$cc);
			var1.setArgs(this.val$cc.method6892().field3763);
			Varps.method6447().addFirst(var1);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1115336218"
	)
	public static void method2812(int var0, int var1, int var2, int var3) {
		if (class330.musicSongs.size() > 1 && class330.musicSongs.get(0) != null && ((MusicSong)class330.musicSongs.get(0)).midiPcmStream.isReady() && class330.musicSongs.get(1) != null && ((MusicSong)class330.musicSongs.get(1)).midiPcmStream.isReady()) {
			class33.method476(var0, var1, var2, var3);
			class330.field3581.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class330.field3586), class330.field3590));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class330.field3589), class330.musicPlayerStatus));
			class330.field3581.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class330.field3585.get(0) != null && class330.field3585.get(1) != null) {
				MusicSong var5 = (MusicSong)class330.field3585.get(0);
				class330.field3585.set(0, class330.musicSongs.get(1));
				class330.field3585.set(1, var5);
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2090608479"
	)
	static final String method2810(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-271329578"
	)
	static final void method2811(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : Tile.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3501()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = class170.getPacketBufferNode(ClientPacket.field3375, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + Actor.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
