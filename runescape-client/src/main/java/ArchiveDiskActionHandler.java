import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -411214707
	)
	static int field4534;
	@ObfuscatedName("aj")
	static final Object field4535;
	@ObfuscatedName("ai")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("au")
	public static short[] field4539;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4534 = 0;
		field4535 = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(field4535) {
						if (field4534 <= 1) {
							field4534 = 0;
							field4535.notifyAll();
							return;
						}

						field4534 = 600;
					}
				} else {
					World.method2001(100L);
					synchronized(field4535) {
						if (field4534 <= 1) {
							field4534 = 0;
							field4535.notifyAll();
							return;
						}

						--field4534;
					}
				}
			}
		} catch (Exception var13) {
			HttpHeaders.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Ljava/lang/String;Ljava/lang/String;I)[Lvc;",
		garbageValue = "-927101622"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite[] var5;
			if (!class53.method1110(var0, var3, var4)) {
				var5 = null;
			} else {
				IndexedSprite[] var7 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

				for (int var8 = 0; var8 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var8) {
					IndexedSprite var9 = var7[var8] = new IndexedSprite();
					var9.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
					var9.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
					var9.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var8];
					var9.yOffset = class497.SpriteBuffer_yOffsets[var8];
					var9.subWidth = class7.SpriteBuffer_spriteWidths[var8];
					var9.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var8];
					var9.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
					var9.pixels = class280.SpriteBuffer_pixels[var8];
				}

				SpriteBufferProperties.SpriteBuffer_xOffsets = null;
				class497.SpriteBuffer_yOffsets = null;
				class7.SpriteBuffer_spriteWidths = null;
				SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
				SpriteBufferProperties.SpriteBuffer_spritePalette = null;
				class280.SpriteBuffer_pixels = null;
				var5 = var7;
			}

			return var5;
		}
	}
}
