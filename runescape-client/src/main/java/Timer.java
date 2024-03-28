import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -8231557409147375753L
	)
	long field4700;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 6642217131054963375L
	)
	long field4697;
	@ObfuscatedName("af")
	public boolean field4696;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 7490225758762001347L
	)
	long field4699;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -8633116534975608415L
	)
	long field4707;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 4826269579713770151L
	)
	long field4698;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -940805175
	)
	int field4702;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1798271895
	)
	int field4703;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -150352439
	)
	int field4704;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -506535383
	)
	int field4705;

	public Timer() {
		this.field4700 = -1L;
		this.field4697 = -1L;
		this.field4696 = false;
		this.field4699 = 0L;
		this.field4707 = 0L;
		this.field4698 = 0L;
		this.field4702 = 0;
		this.field4703 = 0;
		this.field4704 = 0;
		this.field4705 = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	public void method7912() {
		this.field4700 = VerticalAlignment.method3924();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1797301596"
	)
	public void method7914() {
		if (this.field4700 != -1L) {
			this.field4707 = VerticalAlignment.method3924() - this.field4700;
			this.field4700 = -1L;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	public void method7927(int var1) {
		this.field4697 = VerticalAlignment.method3924();
		this.field4702 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2079797857"
	)
	public void method7915() {
		if (-1L != this.field4697) {
			this.field4699 = VerticalAlignment.method3924() - this.field4697;
			this.field4697 = -1L;
		}

		++this.field4704;
		this.field4696 = true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "324343159"
	)
	public void method7916() {
		this.field4696 = false;
		this.field4703 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2021279116"
	)
	public void method7917() {
		this.method7915();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "-19"
	)
	@Export("write")
	public void write(Buffer var1) {
		WorldMapData_1.method5535(var1, this.field4707);
		WorldMapData_1.method5535(var1, this.field4699);
		WorldMapData_1.method5535(var1, this.field4698);
		var1.writeShort(this.field4702);
		var1.writeShort(this.field4703);
		var1.writeShort(this.field4704);
		var1.writeShort(this.field4705);
	}
}
