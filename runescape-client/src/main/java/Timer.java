import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("mm")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("o")
	@ObfuscatedGetter(longValue = 7483888896686951309L)
	long field4248 = -1L;

	@ObfuscatedName("q")
	@ObfuscatedGetter(longValue = 654854770925304923L)
	long field4245 = -1L;

	@ObfuscatedName("f")
	public boolean field4246 = false;

	@ObfuscatedName("u")
	@ObfuscatedGetter(longValue = 4574239759121238911L)
	long field4247 = 0L;

	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = 1049156482329543443L)
	long field4254 = 0L;

	@ObfuscatedName("w")
	@ObfuscatedGetter(longValue = 8408979389457387291L)
	long field4249 = 0L;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 710407707)
	int field4252 = 0;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 778328855)
	int field4251 = 0;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -48429605)
	int field4253 = 0;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1168631239)
	int field4244 = 0;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "36")
	public void method6552() {
		this.field4248 = class131.method2916();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-632440390")
	public void method6553() {
		if (-1L != this.field4248) {
			this.field4254 = class131.method2916() - this.field4248;
			this.field4248 = -1L;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1777899059")
	public void method6554(int var1) {
		this.field4245 = class131.method2916();
		this.field4252 = var1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-45")
	public void method6555() {
		if (-1L != this.field4245) {
			this.field4247 = class131.method2916() - this.field4245;
			this.field4245 = -1L;
		}
		++this.field4253;
		this.field4246 = true;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "840918639")
	public void method6574() {
		this.field4246 = false;
		this.field4251 = 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-80")
	public void method6557() {
		this.method6555();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "33")
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4254;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}
		var1.writeShort(((int) (var2)));
		long var4 = this.field4247;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}
		var1.writeShort(((int) (var4)));
		long var6 = this.field4249;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}
		var1.writeShort(((int) (var6)));
		var1.writeShort(this.field4252);
		var1.writeShort(this.field4251);
		var1.writeShort(this.field4253);
		var1.writeShort(this.field4244);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)[I", garbageValue = "36")
	public static int[] method6564() {
		int[] var0 = new int[KeyHandler.field142];
		for (int var1 = 0; var1 < KeyHandler.field142; ++var1) {
			var0[var1] = KeyHandler.field135[var1];
		}
		return var0;
	}
}