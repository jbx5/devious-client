import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("FloorUnderlayDefinition_cached")
	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field2215;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -816159781
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 183540393
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -61931251
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1861021483
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2089405297
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1900835265"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "-1972072618"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;III)V",
		garbageValue = "-1813205196"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1336440358"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(256.0D * var16);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

		if (var16 > 0.5D) {
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(var14 * var16 * 512.0D);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[Lvh;",
		garbageValue = "2"
	)
	static PrivateChatMode[] method4062() {
		return new PrivateChatMode[]{PrivateChatMode.field5484, PrivateChatMode.field5483, PrivateChatMode.field5485};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1671604061"
	)
	public static void method4067(int var0, int var1, int var2, int var3) {
		if (class329.musicSongs.size() > 1 && class329.musicSongs.get(0) != null && ((MusicSong)class329.musicSongs.get(0)).midiPcmStream.isReady() && class329.musicSongs.get(1) != null && ((MusicSong)class329.musicSongs.get(1)).midiPcmStream.isReady()) {
			class146.method3226(var0, var1, var2, var3);
			class329.field3581.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class329.field3580), class329.field3585));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class329.field3584), class329.musicPlayerStatus));
			class329.field3581.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class329.field3579.get(0) != null && class329.field3579.get(1) != null) {
				MusicSong var5 = (MusicSong)class329.field3579.get(0);
				class329.field3579.set(0, class329.musicSongs.get(1));
				class329.field3579.set(1, var5);
			}
		}

	}
}
