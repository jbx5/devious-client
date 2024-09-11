import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
public class class279 implements Comparator {
	class279() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lkx;Lkx;I)I",
		garbageValue = "-1537109093"
	)
	int method5728(class271 var1, class271 var2) {
		return var1.method5638() - var2.method5638();
	}

	public int compare(Object var1, Object var2) {
		return this.method5728((class271)var1, (class271)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpo;Lpo;Lpo;B)V",
		garbageValue = "61"
	)
	public static void method5736(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0;
		class158.SequenceDefinition_animationsArchive = var1;
		class187.SequenceDefinition_skeletonsArchive = var2;
	}
}
