import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class134 extends class129 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1271767891
	)
	int field1592;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -695677663
	)
	int field1591;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -768466047
	)
	int field1594;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -353550851
	)
	int field1593;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class134(class132 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1592 = var1.readInt(); // L: 292
		this.field1593 = var1.readInt(); // L: 293
		this.field1591 = var1.readUnsignedByte(); // L: 294
		this.field1594 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3160(this.field1592, this.field1593, this.field1591, this.field1594); // L: 299
	} // L: 300

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "-126"
	)
	public static byte[] method3043(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var3 = (byte[])((byte[])var0); // L: 10
			return var1 ? BuddyRankComparator.method2790(var3) : var3; // L: 11
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 14
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 15
			return var2.get(); // L: 16
		} else {
			throw new IllegalArgumentException(); // L: 18
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcv;",
		garbageValue = "1"
	)
	static final InterfaceParent method3053(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11726
		var3.group = var1; // L: 11727
		var3.type = var2; // L: 11728
		Client.interfaceParents.put(var3, (long)var0); // L: 11729
		MouseHandler.Widget_resetModelFrames(var1); // L: 11730
		Widget var4 = SpotAnimationDefinition.getWidget(var0); // L: 11731
		class403.invalidateWidget(var4); // L: 11732
		if (Client.meslayerContinueWidget != null) { // L: 11733
			class403.invalidateWidget(Client.meslayerContinueWidget); // L: 11734
			Client.meslayerContinueWidget = null; // L: 11735
		}

		StructComposition.revalidateWidgetScroll(Calendar.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11737
		class11.runWidgetOnLoadListener(var1); // L: 11738
		if (Client.rootInterface != -1) { // L: 11739
			class18.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11740
	}
}
