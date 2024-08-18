import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uz")
final class class536 implements class531 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvg;I)V",
		garbageValue = "-663284636"
	)
	public void vmethod9472(Object var1, Buffer var2) {
		this.method9470((String)var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)Ljava/lang/Object;",
		garbageValue = "1930105909"
	)
	public Object vmethod9476(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lvg;B)V",
		garbageValue = "22"
	)
	void method9470(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
