import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class164 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 6529403123232145967L
	)
	long field1812;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -2253679235273156155L
	)
	public long field1806;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	IterableNodeDeque field1807;

	@ObfuscatedSignature(
		descriptor = "(Lua;)V"
	)
	public class164(Buffer var1) {
		this.field1806 = -1L;
		this.field1807 = new IterableNodeDeque();
		this.method3431(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "16298012"
	)
	void method3431(Buffer var1) {
		this.field1812 = var1.readLong();
		this.field1806 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class159(this);
			} else if (var2 == 4) {
				var3 = new class170(this);
			} else if (var2 == 3) {
				var3 = new class155(this);
			} else if (var2 == 2) {
				var3 = new class153(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class160(this);
			}

			((class163)var3).vmethod3479(var1);
			this.field1807.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "194613950"
	)
	public void method3425(ClanChannel var1) {
		if (this.field1812 == var1.key && var1.field1826 == this.field1806) {
			for (class163 var2 = (class163)this.field1807.last(); var2 != null; var2 = (class163)this.field1807.previous()) {
				var2.vmethod3480(var1);
			}

			++var1.field1826;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IIIIIIIIB)Z",
		garbageValue = "104"
	)
	static final boolean method3432(Model var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (!ClientPreferences.method2630()) {
			return false;
		} else {
			class11.method106(var5, var6, var7, var8);
			AABB var9 = (AABB)var0.aabb.get(var1);
			int var10 = var2 + var9.xMid;
			int var11 = var3 + var9.yMid;
			int var12 = var4 + var9.zMid;
			int var13 = var9.xMidOffset;
			int var14 = var9.yMidOffset;
			int var15 = var9.zMidOffset;
			int var16 = ViewportMouse.field2947 - var10;
			int var17 = class349.field3735 - var11;
			int var18 = UserComparator6.field1529 - var12;
			if (Math.abs(var16) > var13 + ViewportMouse.field2951) {
				return false;
			} else if (Math.abs(var17) > var14 + ViewportMouse.field2952) {
				return false;
			} else if (Math.abs(var18) > var15 + ViewportMouse.field2953) {
				return false;
			} else if (Math.abs(var18 * SpriteMask.field3705 - var17 * ViewportMouse.field2950) > var15 * ViewportMouse.field2952 + var14 * ViewportMouse.field2953) {
				return false;
			} else if (Math.abs(var16 * ViewportMouse.field2950 - var18 * ViewportMouse.field2944) > var13 * ViewportMouse.field2953 + var15 * ViewportMouse.field2951) {
				return false;
			} else {
				return Math.abs(var17 * ViewportMouse.field2944 - var16 * SpriteMask.field3705) <= var14 * ViewportMouse.field2951 + var13 * ViewportMouse.field2952;
			}
		}
	}
}
