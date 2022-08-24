import net.runelite.mapping.ObfuscatedName;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.File;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
@ObfuscatedName("h")
public class class1 implements Callable {
	@ObfuscatedName("sm")
	@ObfuscatedSignature(descriptor = "Lqn;")
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;

	@ObfuscatedName("mz")
	@ObfuscatedGetter(intValue = -1008403491)
	@Export("menuY")
	static int menuY;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lqr;")
	final Buffer field9;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lv;")
	final class3 field0;

	@ObfuscatedSignature(descriptor = "Lk;")
	final class7 this$0;

	@ObfuscatedSignature(descriptor = "(Lk;Lqr;Lv;)V")
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field9 = var2;
		this.field0 = var3;
	}

	public Object call() {
		return this.field0.vmethod12(this.field9);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/io/File;", garbageValue = "-1454847961")
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = ((File) (FileSystem.FileSystem_cacheFiles.get(var0)));
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;
				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}
					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-43")
	public static void method7() {
		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1880349412")
	static void method10() {
		ClanMate.clientPreferences.method2228(Client.field480);
	}
}