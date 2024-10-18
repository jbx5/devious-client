import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 7632467397289796137L
	)
	long field4928;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 2604157037784435335L
	)
	long field4920;
	@ObfuscatedName("ak")
	public boolean field4921;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -1823558796294902893L
	)
	long field4922;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -1360065938077127599L
	)
	long field4919;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -1731479664537144553L
	)
	long field4924;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -568774671
	)
	int field4925;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 360819937
	)
	int field4926;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 717714625
	)
	int field4927;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1335514741
	)
	int field4930;

	public Timer() {
		this.field4928 = -1L;
		this.field4920 = -1L;
		this.field4921 = false;
		this.field4922 = 0L;
		this.field4919 = 0L;
		this.field4924 = 0L;
		this.field4925 = 0;
		this.field4926 = 0;
		this.field4927 = 0;
		this.field4930 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "482562678"
	)
	public void method8809() {
		this.field4928 = class77.method2338();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "24455"
	)
	public void method8791() {
		if (-1L != this.field4928) {
			this.field4919 = class77.method2338() - this.field4928;
			this.field4928 = -1L;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-29451"
	)
	public void method8792(int var1) {
		this.field4920 = class77.method2338();
		this.field4925 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-126896775"
	)
	public void method8793() {
		if (-1L != this.field4920) {
			this.field4922 = class77.method2338() - this.field4920;
			this.field4920 = -1L;
		}

		++this.field4927;
		this.field4921 = true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1562253144"
	)
	public void method8794() {
		this.field4921 = false;
		this.field4926 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
	)
	public void method8795() {
		this.method8793();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "117"
	)
	@Export("write")
	public void write(Buffer var1) {
		ScriptFrame.method1222(var1, this.field4919);
		ScriptFrame.method1222(var1, this.field4922);
		ScriptFrame.method1222(var1, this.field4924);
		var1.writeShort(this.field4925);
		var1.writeShort(this.field4926);
		var1.writeShort(this.field4927);
		var1.writeShort(this.field4930);
	}
}
