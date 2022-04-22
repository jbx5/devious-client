import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("nf")
	@ObfuscatedGetter(intValue = 
	-1068147205)

	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	-3244593562421258965L)

	long field4174;
	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = 
	1641413866718548925L)

	long field4172;
	@ObfuscatedName("i")
	public boolean field4179;
	@ObfuscatedName("f")
	@ObfuscatedGetter(longValue = 
	7215038072955031607L)

	long field4173;
	@ObfuscatedName("b")
	@ObfuscatedGetter(longValue = 
	-4614957419067559229L)

	long field4175;
	@ObfuscatedName("n")
	@ObfuscatedGetter(longValue = 
	-584897100758161969L)

	long field4171;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	225650281)

	int field4177;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-648366881)

	int field4178;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-809978943)

	int field4176;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1244988383)

	int field4180;

	public Timer() {
		this.field4174 = -1L;
		this.field4172 = -1L;
		this.field4179 = false;
		this.field4173 = 0L;
		this.field4175 = 0L;
		this.field4171 = 0L;
		this.field4177 = 0;
		this.field4178 = 0;
		this.field4176 = 0;
		this.field4180 = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"1")

	public void method6574() {
		this.field4174 = class136.method2931();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"369845371")

	public void method6562() {
		if (this.field4174 != (-1L)) {
			this.field4175 = class136.method2931() - this.field4174;
			this.field4174 = -1L;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-52559849")

	public void method6563(int var1) {
		this.field4172 = class136.method2931();
		this.field4177 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-929974829")

	public void method6564() {
		if (this.field4172 != (-1L)) {
			this.field4173 = class136.method2931() - this.field4172;
			this.field4172 = -1L;
		}

		++this.field4176;
		this.field4179 = true;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-127")

	public void method6580() {
		this.field4179 = false;
		this.field4178 = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1687652356")

	public void method6566() {
		this.method6564();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-598240073")

	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4175;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort(((int) (var2)));
		long var4 = this.field4173;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort(((int) (var4)));
		long var6 = this.field4171;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort(((int) (var6)));
		var1.writeShort(this.field4177);
		var1.writeShort(this.field4178);
		var1.writeShort(this.field4176);
		var1.writeShort(this.field4180);
	}
}