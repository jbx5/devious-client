import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("pq")
final class class430 implements class429 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lqr;I)V", garbageValue = "1286167930")
	public void vmethod7506(Object var1, Buffer var2) {
		this.method7465(((Integer) (var1)), var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;B)Ljava/lang/Object;", garbageValue = "36")
	public Object vmethod7514(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;Lqr;B)V", garbageValue = "99")
	void method7465(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}