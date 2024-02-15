import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	static final DefaultsGroup field4809;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	static final DefaultsGroup field4808;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1422233943
	)
	@Export("group")
	final int group;

	static {
		field4809 = new DefaultsGroup(1);
		field4808 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-664569182"
	)
	public static void method8542(AbstractArchive var0) {
		GrandExchangeOfferWorldComparator.EnumDefinition_archive = var0;
	}
}
