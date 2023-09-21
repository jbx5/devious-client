import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public abstract class class295 implements class297 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	static ClanSettings field3108;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1087312953
	)
	protected int field3109;

	@ObfuscatedSignature(
		descriptor = "(Lnp;Loa;I)V"
	)
	protected class295(StudioGame var1, Language var2, int var3) {
		this.field3109 = var3;
	}
}
