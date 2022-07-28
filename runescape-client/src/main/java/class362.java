import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Map;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("mq")
public final class class362 {
	@ObfuscatedName("o")
	final Comparator field4288;

	@ObfuscatedName("q")
	final Map field4283;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lmh;")
	final class348 field4284;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lmh;")
	final class348 field4285;

	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = -7406396989458923739L)
	final long field4286;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lmd;")
	final class360 field4282;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1228353645)
	final int field4287;

	@ObfuscatedSignature(descriptor = "(JILmd;)V")
	class362(long var1, int var3, class360 var4) {
		this.field4288 = new class361(this);
		this.field4286 = var1;
		this.field4287 = var3;
		this.field4282 = var4;
		if (this.field4287 == -1) {
			this.field4283 = new HashMap(64);
			this.field4284 = new class348(64, this.field4288);
			this.field4285 = null;
		} else {
			if (this.field4282 == null) {
				throw new IllegalArgumentException("");
			}
			this.field4283 = new HashMap(this.field4287);
			this.field4284 = new class348(this.field4287, this.field4288);
			this.field4285 = new class348(this.field4287);
		}
	}

	@ObfuscatedSignature(descriptor = "(ILmd;)V")
	public class362(int var1, class360 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1040480624")
	boolean method6593() {
		return this.field4287 != -1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;", garbageValue = "-72")
	public Object method6594(Object var1) {
		synchronized(this) {
			if (-1L != this.field4286) {
				this.method6598();
			}
			class363 var3 = ((class363) (this.field4283.get(var1)));
			if (var3 == null) {
				return null;
			} else {
				this.method6607(var3, false);
				return var3.field4291;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue = "-905107972")
	public Object method6596(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4286 != -1L) {
				this.method6598();
			}
			class363 var4 = ((class363) (this.field4283.get(var1)));
			if (var4 != null) {
				Object var8 = var4.field4291;
				var4.field4291 = var2;
				this.method6607(var4, false);
				return var8;
			} else {
				class363 var5;
				if (this.method6593() && this.field4283.size() == this.field4287) {
					var5 = ((class363) (this.field4285.remove()));
					this.field4283.remove(var5.field4290);
					this.field4284.remove(var5);
				}
				var5 = new class363(var2, var1);
				this.field4283.put(var1, var5);
				this.method6607(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lmz;ZI)V", garbageValue = "1932441348")
	void method6607(class363 var1, boolean var2) {
		if (!var2) {
			this.field4284.remove(var1);
			if (this.method6593() && !this.field4285.remove(var1)) {
				throw new IllegalStateException("");
			}
		}
		var1.field4292 = System.currentTimeMillis();
		if (this.method6593()) {
			switch (this.field4282.field4275) {
				case 0 :
					++var1.field4289;
					break;
				case 1 :
					var1.field4289 = var1.field4292;
			}
			this.field4285.add(var1);
		}
		this.field4284.add(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "102")
	void method6598() {
		if (-1L == this.field4286) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4286;
			while (!this.field4284.isEmpty()) {
				class363 var3 = ((class363) (this.field4284.peek()));
				if (var3.field4292 >= var1) {
					return;
				}
				this.field4283.remove(var3.field4290);
				this.field4284.remove(var3);
				if (this.method6593()) {
					this.field4285.remove(var3);
				}
			} 
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1889158363")
	static void method6603(int var0) {
		class387.field4402 = var0;
		class387.field4403 = new class387[var0];
		class126.field1537 = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)Lqj;", garbageValue = "-802220654")
	static SpritePixels method6608() {
		SpritePixels var0 = new SpritePixels();
		var0.width = class457.SpriteBuffer_spriteWidth;
		var0.height = class457.SpriteBuffer_spriteHeight;
		var0.xOffset = class267.SpriteBuffer_xOffsets[0];
		var0.yOffset = class457.SpriteBuffer_yOffsets[0];
		var0.subWidth = class457.SpriteBuffer_spriteWidths[0];
		var0.subHeight = Decimator.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = DbTableType.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];
		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette[var2[var3] & 255];
		}
		class267.SpriteBuffer_xOffsets = null;
		class457.SpriteBuffer_yOffsets = null;
		class457.SpriteBuffer_spriteWidths = null;
		Decimator.SpriteBuffer_spriteHeights = null;
		GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = null;
		DbTableType.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "112")
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = class293.getWidgetChild(class113.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class17.runScriptEvent(var1);
			}
			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			class220.invalidateWidget(var0);
		}
	}
}