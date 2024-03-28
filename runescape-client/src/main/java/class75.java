import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
public class class75 {
	@ObfuscatedName("az")
	static final BigInteger field923;
	@ObfuscatedName("ah")
	static final BigInteger field921;

	static {
		field923 = new BigInteger("10001", 16);
		field921 = new BigInteger("e922e9b93fe9d4e3abfbdb7a503bc8e509b156f5b5c253395fbaaf84ff0ab406c8f4fb2c2989e419fa806abea271ece839b84e5156195b5f2cdcc81a866d29391d7af5ae301c4a67780071759f4d46128179ecc478b9b0c441434198576783ba5afc2bfb3fe396d941079e5ae50ad2b3e2c416c5cf17aceaf267c31ab697eff7", 16);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-26"
	)
	public static int method2089(int var0) {
		return class319.field3480[var0];
	}
}
