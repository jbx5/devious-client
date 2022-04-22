import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class126 extends class128 {
	@ObfuscatedName("cf")
	@ObfuscatedSignature(descriptor = 
	"[Lqq;")

	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	5363365603419108439L)

	long field1511;
	@ObfuscatedName("c")
	String field1508;

	@ObfuscatedSignature(descriptor = 
	"Les;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Les;)V")

	class126(class131 var1) {
		this.this$0 = var1;
		this.field1511 = -1L;
		this.field1508 = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-413979452")

	void vmethod3168(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1511 = var1.readLong();
		}

		this.field1508 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lex;S)V", garbageValue = 
	"-10316")

	void vmethod3162(ClanSettings var1) {
		var1.method2959(this.field1511, this.field1508, 0);
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1206801353")

	static final void method2824(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class131.clientPreferences.updateSoundEffectVolume(var0);
	}
}