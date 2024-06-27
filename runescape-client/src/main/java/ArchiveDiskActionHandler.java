import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 968623873
	)
	static int field4468;
	@ObfuscatedName("ak")
	static boolean field4470;
	@ObfuscatedName("ap")
	static Object field4472;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4468 = 0;
		field4470 = false;
		field4472 = new Object();
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

					synchronized(field4472) {
						if ((field4470 || field4468 <= 1) && ArchiveDiskActionHandler_requestQueue.method7456()) {
							field4468 = 0;
							field4472.notifyAll();
							return;
						}

						field4468 = 600;
					}
				} else {
					class188.method3688(100L);
					synchronized(field4472) {
						if ((field4470 || field4468 <= 1) && ArchiveDiskActionHandler_requestQueue.method7456()) {
							field4468 = 0;
							field4472.notifyAll();
							return;
						}

						--field4468;
					}
				}
			}
		} catch (Exception var13) {
			FriendsChat.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;Lok;Ljava/util/ArrayList;B)Z",
		garbageValue = "-2"
	)
	public static boolean method7122(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		class330.field3583 = var0;
		class330.field3579 = var1;
		class330.field3591 = var2;
		class330.field3582 = var3;
		return true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lok;III)Lvg;",
		garbageValue = "-136072013"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!class146.method3260(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels();
			var4.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var4.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var4.xOffset = UserComparator4.SpriteBuffer_xOffsets[0];
			var4.yOffset = LoginPacket.SpriteBuffer_yOffsets[0];
			var4.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
			var4.subHeight = class315.SpriteBuffer_spriteHeights[0];
			int var5 = var4.subHeight * var4.subWidth;
			byte[] var6 = SpriteBufferProperties.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];

			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = SpriteBufferProperties.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			Calendar.method7029();
			return var4;
		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Ldv;ZI)V",
		garbageValue = "-1980057961"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			ModeWhere.widgetDefinition.method6512(var2);
		}

		class512.method8981(var2);
		Widget var4 = ModeWhere.widgetDefinition.method6519(var3);
		if (var4 != null) {
			TriBool.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) {
			BuddyRankComparator.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
