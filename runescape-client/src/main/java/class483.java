import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
public class class483 extends class482 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -470028201
	)
	static final int field5047;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 781583631
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	final WorldEntityCoord field5043;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	final WorldEntityCoord field5044;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 902707401
	)
	int field5042;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -350558985
	)
	int field5045;

	static {
		field5047 = Client.field726 + 3;
	}

	class483() {
		this.field5043 = new WorldEntityCoord();
		this.field5044 = new WorldEntityCoord();
		this.field5042 = 0;
		this.field5045 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lsb;II)V",
		garbageValue = "1324696839"
	)
	void vmethod9203(WorldEntityCoord var1, class481 var2, int var3) {
		this.field5043.method5771(var1);
		this.field5044.method5771(var2.field5040);
		this.field5042 = var3 - 1;
		this.field5045 = var2.field5041 + field5047;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lkt;IIB)Z",
		garbageValue = "30"
	)
	boolean vmethod9202(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5042 >= this.field5045) {
			var1.method5771(this.field5044);
			return true;
		} else {
			float var4 = WorldEntity.method9165(var2, this.field5042, this.field5045);
			class430.method8358(this.field5043, this.field5044, var4, var1);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-23944715"
	)
	void vmethod9204(int var1, int var2) {
		this.field5043.setDirection(var1, var2);
		this.field5044.setDirection(var1, var2);
	}
}
