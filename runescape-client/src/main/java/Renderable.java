import net.runelite.mapping.ObfuscatedName;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("gq")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("eb")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive2")
	static Archive archive2;

	@ObfuscatedName("dv")
	@ObfuscatedGetter(intValue = 417479049)
	@Export("height")
	public int height = 1000;

	protected Renderable() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Lhp;", garbageValue = "4")
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("di")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lls;Ljava/lang/String;Ljava/lang/String;IZB)V", garbageValue = "-108")
	public static void method4229(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1);
		int var6 = var0.getFileId(var5, var2);
		class118.method2713(var0, var5, var6, var3, var4);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/io/File;ZI)Z", garbageValue = "1510342619")
	static boolean method4227(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}
			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "1654436589")
	static int method4228(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(descriptor = "([Lkn;II)V", garbageValue = "-313022235")
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
						ModelData0.runIntfCloseListeners(var4.group, var1);
					}
				}
				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					SceneTilePaint.runScriptEvent(var5);
				}
				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = HitSplatDefinition.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					SceneTilePaint.runScriptEvent(var5);
				}
			}
		}
	}
}