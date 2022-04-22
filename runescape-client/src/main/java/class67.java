import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class67 {
	@ObfuscatedName("sk")
	@ObfuscatedGetter(intValue = 
	-19074661)

	static int field881;
	@ObfuscatedName("v")
	static final BigInteger field882;
	@ObfuscatedName("c")
	static final BigInteger field880;
	static 
	{
		field882 = new BigInteger("10001", 16);
		field880 = new BigInteger("a297f6692a7a1d8b2786f93cf85ef1d85f2a702a6f04b4503c079d0c3970d7a7bda84292dd1c8249b1cd8d0eb0fe10e16ad2d42a7fbbb321f4f5603afec3f13a03d534b8e2233ba479c346208306d2d816ef9f8f1ee69896d2cd1f3dfcb7d8e5987ed6e9412f962811bfbfb59b689ce506438d4f3c8dfb5c95c1670ad4d2e767", 16);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"-309865537")

	static int method1910(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return 0;
		} else if (var1 == (-1)) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"822904825")

	public static int method1909(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Lky;II)V", garbageValue = 
	"1726042020")

	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3415 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3484 == null) {
				var0.field3484 = new int[var0.field3415.length];
			}

			var0.field3484[var1] = Integer.MAX_VALUE;
		}
	}
}