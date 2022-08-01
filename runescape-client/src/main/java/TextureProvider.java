import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hm")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "[Lgq;")
	@Export("textures")
	Texture[] textures;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("deque")
	NodeDeque deque = new NodeDeque();

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -683666133)
	@Export("capacity")
	int capacity;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 977186461)
	@Export("remaining")
	int remaining = 0;

	@ObfuscatedName("c")
	@Export("brightness")
	double brightness = 1.0;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1825733731)
	@Export("textureSize")
	int textureSize = 128;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(descriptor = "(Llc;Llc;IDI)V")
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4;
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0);
		int var8 = var7.length;
		this.textures = new Texture[var1.getGroupFileCount(0)];
		for (int var9 = 0; var9 < var8; ++var9) {
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
			this.textures[var7[var9]] = new Texture(var10);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-122")
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0;
		int var2 = 0;
		Texture[] var3 = this.textures;
		for (int var4 = 0; var4 < var3.length; ++var4) {
			Texture var5 = var3[var4];
			if (var5 != null && var5.fileIds != null) {
				var1 += var5.fileIds.length;
				int[] var6 = var5.fileIds;
				for (int var7 = 0; var7 < var6.length; ++var7) {
					int var8 = var6[var7];
					if (this.archive.method5927(var8)) {
						++var2;
					}
				}
			}
		}
		if (var1 == 0) {
			return 0;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("q")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)[I", garbageValue = "-747714761")
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1];
		if (var2 != null) {
			if (var2.pixels != null) {
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = ((Texture) (this.deque.removeFirst()));
					var4.reset();
				} else {
					--this.remaining;
				}
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
		}
		return null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-2057356400")
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IS)Z", garbageValue = "25521")
	public boolean vmethod4498(int var1) {
		return this.textures[var1].field2282;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-30")
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1785881776")
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) {
			if (this.textures[var1] != null) {
				this.textures[var1].reset();
			}
		}
		this.deque = new NodeDeque();
		this.remaining = this.capacity;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "777915167")
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
				var3.animate(var1);
				var3.isLoaded = false;
			}
		}
	}
}