import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class164 extends class150 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1409222067
	)
	int field1805;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class164(class153 var1) {
		this.this$0 = var1;
		this.field1805 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		this.field1805 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.method3629(this.field1805);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "72"
	)
	public static void method3669(int var0, int var1, int var2, int var3) {
		if (class334.musicSongs.size() > 1 && class334.musicSongs.get(0) != null && ((MusicSong)class334.musicSongs.get(0)).midiPcmStream.isReady() && class334.musicSongs.get(1) != null && ((MusicSong)class334.musicSongs.get(1)).midiPcmStream.isReady()) {
			class433.method8269(var0, var1, var2, var3);
			class334.field3620.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class334.field3625), class334.field3624));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class334.field3614), class334.musicPlayerStatus));
			class334.field3620.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class334.field3619.get(0) != null && class334.field3619.get(1) != null) {
				MusicSong var5 = (MusicSong)class334.field3619.get(0);
				class334.field3619.set(0, class334.musicSongs.get(1));
				class334.field3619.set(1, var5);
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "1217335396"
	)
	public static final void method3670(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			PcmPlayer.field270 = var0;
			PcmPlayer.PcmPlayer_stereo = var1;
			RunException.field5583 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(IIIILvv;Lnl;B)V",
		garbageValue = "106"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			ClanSettings.redHintArrowSprite.method10395(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			FloorOverlayDefinition.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
