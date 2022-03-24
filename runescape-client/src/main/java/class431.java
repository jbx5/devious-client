import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
public class class431 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lpc;")

	public static final class431 field4598;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lpc;")

	public static final class431 field4595;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lpc;")

	public static final class431 field4600;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-715377131)

	final int field4597;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-632033909)

	public final int field4594;
	@ObfuscatedName("n")
	public final Class field4599;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Lpj;")

	public final class427 field4596;
	static 
	{
		field4598 = new class431(0, 0, Integer.class, new class428());
		field4595 = new class431(2, 1, Long.class, new class430());
		field4600 = new class431(1, 2, String.class, new class432());
	}

	@ObfuscatedSignature(descriptor = 
	"(IILjava/lang/Class;Lpj;)V")

	class431(int var1, int var2, Class var3, class427 var4) {
		this.field4597 = var1;
		this.field4594 = var2;
		this.field4599 = var3;
		this.field4596 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)Ljava/lang/Object;", garbageValue = 
	"2058035287")

	public Object method7671(Buffer var1) {
		return this.field4596.vmethod7683(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4594;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"35")

	public static boolean method7673(int var0) {
		return (var0 & 1) != 0;
	}
}