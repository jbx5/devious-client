import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class152 extends class128 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"Lac;")

	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1118863201)

	int field1683;
	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = 
	-4335085775687334719L)

	long field1682;

	@ObfuscatedSignature(descriptor = 
	"Les;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Les;)V")

	class152(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-413979452")

	void vmethod3168(Buffer var1) {
		this.field1683 = var1.readInt();
		this.field1682 = var1.readLong();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lex;S)V", garbageValue = 
	"-10316")

	void vmethod3162(ClanSettings var1) {
		var1.method2978(this.field1683, this.field1682);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;I)Z", garbageValue = 
	"-1343677207")

	public static boolean method3170(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

			for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
					WorldMapElement.WorldMapElement_cached[var2].method3381();
				}
			}

			return true;
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(descriptor = 
	"(Lky;I)Ljava/lang/String;", garbageValue = 
	"2139867076")

	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (WorldMapID.Widget_unpackTargetMask(class326.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return (var0.spellActionName != null) && (var0.spellActionName.trim().length() != 0) ? var0.spellActionName : null;
		}
	}
}