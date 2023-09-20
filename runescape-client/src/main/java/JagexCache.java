import java.io.File;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ax")
	static File field1837;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("JagexCache_randomDat")
	static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = -2073836903
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = -304944963
	)
	static int field1844;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "-1922065040"
	)
	static final void method3537(Actor var0) {
		boolean var1 = var0.field1243 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
		if (!var1) {
			SequenceDefinition var2 = class36.SequenceDefinition_get(var0.sequence);
			if (var2 != null && !var2.isCachedModelIdSet()) {
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame];
			} else {
				var1 = true;
			}
		}

		if (var1) {
			int var8 = var0.field1243 - var0.spotAnimation;
			int var3 = Client.cycle - var0.spotAnimation;
			int var4 = var0.field1238 * 128 + var0.field1189 * 64;
			int var5 = var0.field1185 * 128 + var0.field1189 * 64;
			int var6 = var0.field1239 * 128 + var0.field1189 * 64;
			int var7 = var0.field1204 * 128 + var0.field1189 * 64;
			var0.x = (var3 * var6 + var4 * (var8 - var3)) / var8;
			var0.y = (var3 * var7 + var5 * (var8 - var3)) / var8;
		}

		var0.field1233 = 0;
		var0.orientation = var0.field1254;
		var0.rotation = var0.orientation;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1000434204"
	)
	static final void method3521(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method4558(var17, var18, var19);
			Rasterizer3D.method4565(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.method4558(var17, var19, var20);
			Rasterizer3D.method4565(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}

	@ObfuscatedName("mg")
	static final void method3533(double var0) {
		Rasterizer3D.method4517(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		ItemComposition.ItemDefinition_cachedSprites.clear();
		class91.clientPreferences.method2506(var0);
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-10864"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class91.clientPreferences.method2515()) {
			if (class91.clientPreferences.method2515() == 0 && ScriptFrame.method1194()) {
				VarcInt.method3677(CollisionMap.archive6, var0);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				ItemComposition.method4136(0, 0);
				Client.playingJingle = false;
			} else if (!class319.musicSongs.isEmpty()) {
				Iterator var1 = class319.musicSongs.iterator();

				while (var1.hasNext()) {
					MusicSong var2 = (MusicSong)var1.next();
					if (var2 != null) {
						var2.musicTrackVolume = var0;
					}
				}

				MusicSong var3 = (MusicSong)class319.musicSongs.get(0);
				if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3546) {
					var3.midiPcmStream.setPcmStreamVolume(var0);
					var3.field3542 = (float)var0;
				}
			}

			class91.clientPreferences.method2514(var0);
		}

	}
}
