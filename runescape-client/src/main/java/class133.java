import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class133 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	124738811)

	int field1560;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1528369699)

	int field1558;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	556051491)

	int field1562;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-387663765)

	int field1561;

	@ObfuscatedSignature(descriptor = 
	"Lee;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lee;)V")

	class133(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"-73")

	void vmethod3107(Buffer var1) {
		this.field1560 = var1.readInt();
		this.field1561 = var1.readInt();
		this.field1558 = var1.readUnsignedByte();
		this.field1562 = var1.readUnsignedByte();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Leh;I)V", garbageValue = 
	"-1228032820")

	void vmethod3104(ClanSettings var1) {
		var1.method2928(this.field1560, this.field1561, this.field1558, this.field1562);
	}
}