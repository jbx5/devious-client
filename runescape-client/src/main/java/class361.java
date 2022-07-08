import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Map;
import java.util.Comparator;
@ObfuscatedName("my")
public final class class361 {
	@ObfuscatedName("c")
	final Comparator field4269;

	@ObfuscatedName("v")
	final Map field4274;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lmo;")
	final class347 field4270;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lmo;")
	final class347 field4268;

	@ObfuscatedName("j")
	@ObfuscatedGetter(longValue = 1981115018933761779L)
	final long field4272;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lmf;")
	final class359 field4273;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1259093157)
	final int field4271;

	@ObfuscatedSignature(descriptor = "(JILmf;)V")
	class361(long var1, int var3, class359 var4) {
		this.field4269 = new class360(this);
		this.field4272 = var1;
		this.field4271 = var3;
		this.field4273 = var4;
		if (this.field4271 == -1) {
			this.field4274 = new HashMap(64);
			this.field4270 = new class347(64, this.field4269);
			this.field4268 = null;
		} else {
			if (this.field4273 == null) {
				throw new IllegalArgumentException("");
			}
			this.field4274 = new HashMap(this.field4271);
			this.field4270 = new class347(this.field4271, this.field4269);
			this.field4268 = new class347(this.field4271);
		}
	}

	@ObfuscatedSignature(descriptor = "(ILmf;)V")
	public class361(int var1, class359 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1742172857")
	boolean method6549() {
		return this.field4271 != -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;", garbageValue = "13")
	public Object method6538(Object var1) {
		synchronized(this) {
			if (this.field4272 != -1L) {
				this.method6541();
			}
			class362 var3 = ((class362) (this.field4274.get(var1)));
			if (var3 == null) {
				return null;
			} else {
				this.method6540(var3, false);
				return var3.field4276;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue = "870552901")
	public Object method6539(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4272 != -1L) {
				this.method6541();
			}
			class362 var4 = ((class362) (this.field4274.get(var1)));
			if (var4 != null) {
				Object var8 = var4.field4276;
				var4.field4276 = var2;
				this.method6540(var4, false);
				return var8;
			} else {
				class362 var5;
				if (this.method6549() && this.field4274.size() == this.field4271) {
					var5 = ((class362) (this.field4268.remove()));
					this.field4274.remove(var5.field4275);
					this.field4270.remove(var5);
				}
				var5 = new class362(var2, var1);
				this.field4274.put(var1, var5);
				this.method6540(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lmv;ZI)V", garbageValue = "-1864574048")
	void method6540(class362 var1, boolean var2) {
		if (!var2) {
			this.field4270.remove(var1);
			if (this.method6549() && !this.field4268.remove(var1)) {
				throw new IllegalStateException("");
			}
		}
		var1.field4277 = System.currentTimeMillis();
		if (this.method6549()) {
			switch (this.field4273.field4258) {
				case 0 :
					++var1.field4278;
					break;
				case 1 :
					var1.field4278 = var1.field4277;
			}
			this.field4268.add(var1);
		}
		this.field4270.add(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1118070755")
	void method6541() {
		if (-1L == this.field4272) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4272;
			while (!this.field4270.isEmpty()) {
				class362 var3 = ((class362) (this.field4270.peek()));
				if (var3.field4277 >= var1) {
					return;
				}
				this.field4274.remove(var3.field4275);
				this.field4270.remove(var3);
				if (this.method6549()) {
					this.field4268.remove(var3);
				}
			} 
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-77")
	static void method6552() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		Tiles.field996 = null;
		class1.field2 = null;
		UserComparator6.field1415 = null;
		class430.field4651 = null;
		MusicPatchNode2.Tiles_hue = null;
		Tiles.Tiles_saturation = null;
		Varcs.Tiles_lightness = null;
		class465.Tiles_hueMultiplier = null;
		WorldMapScaleHandler.field2877 = null;
	}
}