import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class169 extends class181 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("aw")
	String field1801;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgq;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class169(class170 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1801 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-14721"
	)
	public int vmethod3558() {
		return 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-768896166"
	)
	public String vmethod3559() {
		return this.field1801;
	}
}
