import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public class class452 {
	@ObfuscatedName("aw")
	float field4750;
	@ObfuscatedName("ay")
	float field4746;
	@ObfuscatedName("ar")
	float field4747;
	@ObfuscatedName("am")
	float field4754;
	@ObfuscatedName("as")
	float field4748;
	@ObfuscatedName("aj")
	float field4749;
	@ObfuscatedName("ag")
	float field4752;
	@ObfuscatedName("az")
	float field4745;
	@ObfuscatedName("av")
	float field4753;
	@ObfuscatedName("ap")
	float field4751;
	@ObfuscatedName("aq")
	float field4755;
	@ObfuscatedName("at")
	float field4756;

	static {
		new class452();
	}

	class452() {
		this.method8331();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	void method8331() {
		this.field4756 = 0.0F;
		this.field4755 = 0.0F;
		this.field4751 = 0.0F;
		this.field4745 = 0.0F;
		this.field4752 = 0.0F;
		this.field4749 = 0.0F;
		this.field4754 = 0.0F;
		this.field4747 = 0.0F;
		this.field4746 = 0.0F;
		this.field4753 = 1.0F;
		this.field4748 = 1.0F;
		this.field4750 = 1.0F;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "116"
	)
	void method8315(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4746;
		float var5 = this.field4748;
		float var6 = this.field4745;
		float var7 = this.field4755;
		this.field4746 = var2 * var4 - this.field4747 * var3;
		this.field4747 = this.field4747 * var2 + var4 * var3;
		this.field4748 = var5 * var2 - var3 * this.field4749;
		this.field4749 = this.field4749 * var2 + var3 * var5;
		this.field4745 = var6 * var2 - var3 * this.field4753;
		this.field4753 = var3 * var6 + var2 * this.field4753;
		this.field4755 = var2 * var7 - this.field4756 * var3;
		this.field4756 = this.field4756 * var2 + var3 * var7;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "851748256"
	)
	void method8316(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4750;
		float var5 = this.field4754;
		float var6 = this.field4752;
		float var7 = this.field4751;
		this.field4750 = var4 * var2 + this.field4747 * var3;
		this.field4747 = var2 * this.field4747 - var3 * var4;
		this.field4754 = var2 * var5 + this.field4749 * var3;
		this.field4749 = this.field4749 * var2 - var5 * var3;
		this.field4752 = this.field4753 * var3 + var2 * var6;
		this.field4753 = var2 * this.field4753 - var3 * var6;
		this.field4751 = var3 * this.field4756 + var7 * var2;
		this.field4756 = var2 * this.field4756 - var3 * var7;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "415453075"
	)
	void method8329(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4750;
		float var5 = this.field4754;
		float var6 = this.field4752;
		float var7 = this.field4751;
		this.field4750 = var4 * var2 - this.field4746 * var3;
		this.field4746 = var4 * var3 + var2 * this.field4746;
		this.field4754 = var2 * var5 - this.field4748 * var3;
		this.field4748 = this.field4748 * var2 + var5 * var3;
		this.field4752 = var2 * var6 - this.field4745 * var3;
		this.field4745 = var3 * var6 + var2 * this.field4745;
		this.field4751 = var2 * var7 - this.field4755 * var3;
		this.field4755 = var3 * var7 + var2 * this.field4755;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1893116772"
	)
	void method8318(float var1, float var2, float var3) {
		this.field4751 += var1;
		this.field4755 += var2;
		this.field4756 += var3;
	}

	public String toString() {
		return this.field4750 + "," + this.field4754 + "," + this.field4752 + "," + this.field4751 + "\n" + this.field4746 + "," + this.field4748 + "," + this.field4745 + "," + this.field4755 + "\n" + this.field4747 + "," + this.field4749 + "," + this.field4753 + "," + this.field4756;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "128"
	)
	public static void method8324(int var0, int var1, int var2, int var3) {
		if (class306.musicSongs.size() > 1 && class306.musicSongs.get(0) != null && ((MusicSong)class306.musicSongs.get(0)).midiPcmStream.isReady() && class306.musicSongs.get(1) != null && ((MusicSong)class306.musicSongs.get(1)).midiPcmStream.isReady()) {
			ArchiveLoader.method2259(var0, var1, var2, var3);
			class306.field3399.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class306.field3407), class306.field3403));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class306.field3402), class306.musicPlayerStatus));
			class306.field3399.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class306.field3398.get(0) != null && class306.field3398.get(1) != null) {
				MusicSong var5 = (MusicSong)class306.field3398.get(0);
				class306.field3398.set(0, class306.musicSongs.get(1));
				class306.field3398.set(1, var5);
			}
		}

	}
}
