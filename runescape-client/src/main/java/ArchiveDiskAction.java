import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ks")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 16021623)
	@Export("type")
	int type;

	@ObfuscatedName("q")
	@Export("data")
	byte[] data;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;Ljava/lang/String;I)I", garbageValue = "1650594582")
	public static int method5785(Buffer var0, String var1) {
		int var2 = var0.offset;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];
		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var5[var6] = ((byte) (var7));
			} else if (var7 == 8364) {
				var5[var6] = -128;
			} else if (var7 == 8218) {
				var5[var6] = -126;
			} else if (var7 == 402) {
				var5[var6] = -125;
			} else if (var7 == 8222) {
				var5[var6] = -124;
			} else if (var7 == 8230) {
				var5[var6] = -123;
			} else if (var7 == 8224) {
				var5[var6] = -122;
			} else if (var7 == 8225) {
				var5[var6] = -121;
			} else if (var7 == 710) {
				var5[var6] = -120;
			} else if (var7 == 8240) {
				var5[var6] = -119;
			} else if (var7 == 352) {
				var5[var6] = -118;
			} else if (var7 == 8249) {
				var5[var6] = -117;
			} else if (var7 == 338) {
				var5[var6] = -116;
			} else if (var7 == 381) {
				var5[var6] = -114;
			} else if (var7 == 8216) {
				var5[var6] = -111;
			} else if (var7 == 8217) {
				var5[var6] = -110;
			} else if (var7 == 8220) {
				var5[var6] = -109;
			} else if (var7 == 8221) {
				var5[var6] = -108;
			} else if (var7 == 8226) {
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106;
			} else if (var7 == 8212) {
				var5[var6] = -105;
			} else if (var7 == 732) {
				var5[var6] = -104;
			} else if (var7 == 8482) {
				var5[var6] = -103;
			} else if (var7 == 353) {
				var5[var6] = -102;
			} else if (var7 == 8250) {
				var5[var6] = -101;
			} else if (var7 == 339) {
				var5[var6] = -100;
			} else if (var7 == 382) {
				var5[var6] = -98;
			} else if (var7 == 376) {
				var5[var6] = -97;
			} else {
				var5[var6] = 63;
			}
		}
		var0.writeSmartByteShort(var5.length);
		var0.offset += class18.huffman.compress(var5, 0, var5.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1242746658")
	static int method5786() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;
			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader) (Client.archiveLoaders.get(var1))).loadedCount;
			}
			return var0 * 10000 / Client.field630;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(descriptor = "(Lbe;III)V", garbageValue = "410958599")
	static final void method5787(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			class9.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.action, var0.target, var1, var2);
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(descriptor = "([Lku;II)V", garbageValue = "-1292694171")
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}
					InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3.id)))));
					if (var4 != null) {
						class220.runIntfCloseListeners(var4.group, var1);
					}
				}
				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class17.runScriptEvent(var5);
				}
				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = FloorUnderlayDefinition.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class17.runScriptEvent(var5);
				}
			}
		}
	}
}