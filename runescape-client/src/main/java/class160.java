import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class160 extends class150 {
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field1759;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1824652429
	)
	int field1762;
	@ObfuscatedName("aw")
	String field1758;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class160(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1762 = var1.readInt();
		this.field1758 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3658(this.field1762, this.field1758);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;Lpe;I)V",
		garbageValue = "-789872343"
	)
	public static void method3651(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0;
		HitSplatDefinition.field2143 = var1;
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(B)Luc;",
		garbageValue = "-7"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return LoginState.worldMap;
	}
}
