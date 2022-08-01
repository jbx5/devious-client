import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("au")
public class class29 {
	@ObfuscatedName("o")
	static Applet field184 = null;

	@ObfuscatedName("q")
	static String field182 = "";

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;Llc;Llc;I)V", garbageValue = "-22340068")
	public static void method394(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0;
		HitSplatDefinition.field2017 = var1;
		class290.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(descriptor = "(Llu;Ljava/lang/String;I)V", garbageValue = "1796247890")
	static void method395(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field630 += var2.groupCount;
	}
}