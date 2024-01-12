import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class192 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2009;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2016;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2010;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2011;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2012;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2013;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2014;

	static {
		field2009 = new class192(0, class205.field2255);
		field2016 = new class192(1, class205.field2257);
		field2010 = new class192(2, class205.field2251);
		field2011 = new class192(3, class205.field2253);
		field2012 = new class192(4, class205.field2261);
		field2013 = new class192(5, class205.field2254);
		field2014 = new class192(6, class205.field2256);
	}

	@ObfuscatedSignature(
		descriptor = "(ILhs;)V"
	)
	class192(int var1, class205 var2) {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lhy;",
		garbageValue = "-1270369602"
	)
	public static HitSplatDefinition method3790(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
