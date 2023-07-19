import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public class class292 {
	@ObfuscatedName("ce")
	static String field3084;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	public static String method5720(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class335.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = LoginType.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-924567891"
	)
	static void method5721() {
		synchronized(ArchiveDiskActionHandler.field4248) {
			if (ArchiveDiskActionHandler.field4246 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4246 = 600;
			ArchiveDiskActionHandler.field4247 = false;
		}
	}
}
