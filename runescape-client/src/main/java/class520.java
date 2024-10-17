import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
public class class520 extends class522 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 44941857
	)
	int field5225;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -389796029
	)
	int field5226;

	public class520(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5225 = 0;
		this.field5226 = 0;
		this.field5225 = var1;
		this.field5226 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-34"
	)
	public int method9491() {
		double var1 = this.method9504();
		return (int)Math.round((double)(this.field5226 - this.field5225) * var1 + (double)this.field5225);
	}
}
