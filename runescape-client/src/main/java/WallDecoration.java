import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hv")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("n")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 322967523)
	@Export("z")
	int z;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1269824327)
	@Export("x")
	int x;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1035238041)
	@Export("y")
	int y;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1532847157)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1295637093)
	@Export("orientation2")
	int orientation2;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1643518363)
	@Export("xOffset")
	int xOffset;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 373875107)
	@Export("yOffset")
	int yOffset;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lgk;")
	@Export("renderable1")
	public Renderable renderable1;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lgk;")
	@Export("renderable2")
	public Renderable renderable2;

	@ObfuscatedName("a")
	@ObfuscatedGetter(longValue = -272668053194713397L)
	@Export("tag")
	public long tag = 0L;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1415469043)
	@Export("flags")
	int flags = 0;

	WallDecoration() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IIB)Z", garbageValue = "-59")
	static boolean method4513(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I[BLng;I)V", garbageValue = "-2077766974")
	static void method4515(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = ((long) (var0));
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3991 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}
			ArchiveDiskActionHandler.field3991 = 600;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "832150942")
	public static void method4514(int var0) {
		if (var0 != -1) {
			if (GameObject.Widget_loadedInterfaces[var0]) {
				class228.Widget_archive.clearFilesGroup(var0);
				if (Widget.Widget_interfaceComponents[var0] != null) {
					boolean var1 = true;
					for (int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) {
						if (Widget.Widget_interfaceComponents[var0][var2] != null) {
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) {
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false;
							}
						}
					}
					if (var1) {
						Widget.Widget_interfaceComponents[var0] = null;
					}
					GameObject.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1761002702")
	static final void method4516(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = ((float) (var0)) / 200.0F + 0.5F;
		Rasterizer3D.Rasterizer3D_setBrightness(((double) (var1)));
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(((double) (var1)));
		ItemComposition.ItemDefinition_cachedSprites.clear();
		class260.clientPreferences.method2322(((double) (var1)));
	}
}