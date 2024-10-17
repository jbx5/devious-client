import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class7 {
	@ObfuscatedName("ay")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("ap")
	ExecutorService field16;
	@ObfuscatedName("aw")
	Future field20;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	final Buffer field18;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class3 field19;

	@ObfuscatedSignature(
		descriptor = "(Lvl;Laj;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field16 = Executors.newSingleThreadExecutor();
		this.field18 = var1;
		this.field19 = var2;
		this.method56();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	public boolean method46() {
		return this.field20.isDone();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	public void method47() {
		this.field16.shutdown();
		this.field16 = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Lvl;",
		garbageValue = "-1365"
	)
	public Buffer method45() {
		try {
			return (Buffer)this.field20.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	void method56() {
		this.field20 = this.field16.submit(new class1(this, this.field18, this.field19));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1854978968"
	)
	static void method49() {
		try {
			File var0 = new File(class188.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label38:
				for (int var1 = 0; var1 < class202.field2113.length; ++var1) {
					for (var2 = 0; var2 < Sound.field1740.length; ++var2) {
						File var3 = new File(Sound.field1740[var2] + class202.field2113[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label38;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}
}
