import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public class class125 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1820756907)

	int field1524;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-797454973)

	int field1521;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1722236613)

	int field1522;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-377441011)

	int field1523;

	@ObfuscatedSignature(descriptor = 
	"Lee;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lee;)V")

	class125(class131 var1) {
		this.this$0 = var1;
		this.field1524 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"-73")

	void vmethod3107(Buffer var1) {
		this.field1524 = var1.readUnsignedShort();
		this.field1521 = var1.readInt();
		this.field1522 = var1.readUnsignedByte();
		this.field1523 = var1.readUnsignedByte();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Leh;I)V", garbageValue = 
	"-1228032820")

	void vmethod3104(ClanSettings var1) {
		var1.method2926(this.field1524, this.field1521, this.field1522, this.field1523);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(Laz;B)V", garbageValue = 
	"13")

	public static final void method2804(class47 var0) {
		BuddyRankComparator.pcmPlayerProvider = var0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"1096360732")

	public static void method2803(boolean var0) {
		if (var0 != HealthBar.ItemDefinition_inMembersWorld) {
			ItemComposition.ItemDefinition_cached.clear();
			ItemComposition.ItemDefinition_cachedModels.clear();
			ItemComposition.ItemDefinition_cachedSprites.clear();
			HealthBar.ItemDefinition_inMembersWorld = var0;
		}

	}
}