import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import net.runelite.mapping.Export;
@ObfuscatedName("pl")
public class class421 implements class420 {
	@ObfuscatedName("y")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -390104157)
	static int field4607;

	@ObfuscatedName("c")
	Map field4606;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lqw;")
	final class449 field4605;

	@ObfuscatedSignature(descriptor = "(Lqw;)V")
	public class421(class449 var1) {
		this.field4605 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-2111872296")
	public int vmethod7440(int var1) {
		if (this.field4606 != null) {
			class450 var2 = ((class450) (this.field4606.get(var1)));
			if (var2 != null) {
				return ((Integer) (var2.field4766));
			}
		}
		return ((Integer) (this.field4605.vmethod8027(var1)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/Object;S)V", garbageValue = "31470")
	public void vmethod7441(int var1, Object var2) {
		if (this.field4606 == null) {
			this.field4606 = new HashMap();
			this.field4606.put(var1, new class450(var1, var2));
		} else {
			class450 var3 = ((class450) (this.field4606.get(var1)));
			if (var3 == null) {
				this.field4606.put(var1, new class450(var1, var2));
			} else {
				var3.field4766 = var2;
			}
		}
	}

	public Iterator iterator() {
		return this.field4606 == null ? Collections.emptyList().iterator() : this.field4606.values().iterator();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Llh;Ljava/lang/String;Ljava/lang/String;B)Lqu;", garbageValue = "73")
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		IndexedSprite var5;
		if (!Ignored.method6774(var0, var3, var4)) {
			var5 = null;
		} else {
			var5 = class390.method7053();
		}
		return var5;
	}
}